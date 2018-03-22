package com.cyan.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.entity.Category;
import com.cyan.entity.Orderdetail;
import com.cyan.entity.Product;
import com.cyan.entity.Review;
import com.cyan.service.PictureService;
import com.cyan.service.ProductService;
import com.cyan.serviceimpl.PictureServiceImpl;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private PictureService pictureService;

	@RequestMapping("/products")
	public ModelAndView ProductService(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product");
		List<Product> products = productService.retrieveAllProducts();
		mv.addObject("products", products);
		mv.addObject("message", request.getAttribute("message"));
		return mv;
	}

	@RequestMapping("/new")
	public String newProductPage() {
		return "product_new";
	}

	@RequestMapping("/insert")
	public ModelAndView insertProduct(Product product, MultipartFile pic) throws IllegalStateException, IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product_new");		
		if (!pic.isEmpty()) {
			String path = "/Users/sun/Desktop/projects/CyanWeb/WebContent/static/images/products/";
			String originalFileName = pic.getOriginalFilename();
			// 新的图片名称
			String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
			// 新的图片
			File newFile = new File(path + newFileName);
			// 将内存中的数据写入磁盘
			pic.transferTo(newFile);		
			String image = "static/images/products/" + newFileName;		
			product.setImage(image);
		}
		if (productService.insertProduct(product)) {
			mv.addObject("message", "Successfully Added");
		} else {
			mv.addObject("message", "Adding failed");
		}
		return mv;
	}

	@RequestMapping("/delete")
	public void deleteProduct(Integer productId, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		if (productService.deleteProduct(productId)) {
			request.setAttribute("message", "Successfully Deleted");
		} else {
			request.setAttribute("message", "Deleting failed");
		}
		// response.sendRedirect(request.getContextPath()+"/product/products");
		request.getRequestDispatcher("/product/products").forward(request, response);
	}

	@RequestMapping("/modify")
	public ModelAndView modify(Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product_update");
		mv.addObject("product", product);
		return mv;
	}

	@RequestMapping("/update")
	public ModelAndView updateProduct(Product product, MultipartFile pic, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product_update");
		
		if (!pic.isEmpty()) {
			String path = "/Users/sun/Desktop/projects/CyanWeb/WebContent/static/images/products/";
			String originalFileName = pic.getOriginalFilename();
			// 新的图片名称
			String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
			// 新的图片
			File newFile = new File(path + newFileName);
			// 将内存中的数据写入磁盘
			pic.transferTo(newFile);
			
			String image = "static/images/products/" + newFileName;
			
			// 删除旧的图片
			if(!product.getImage().isEmpty()) {
				String delete = "/Users/sun/Desktop/projects/CyanWeb/WebContent/" + product.getImage();
				File file = new File(delete);
		        if (file.exists()) {
		        		file.delete();
		        }
			}
			
			//更新新的图片路径
			product.setImage(image);
		}
		
		if (productService.updateProduct(product)) {
			mv.addObject("message", "Successfully Updated");
		} else {
			mv.addObject("message", "Updating failed");
		}
		return mv;
	}

	
	@RequestMapping("/pictures")
	public ModelAndView uploadPictures(Integer productId, MultipartFile[] pictures, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product_update");
		List<String> paths = new ArrayList<>();
		
		for(MultipartFile pic : pictures) {
			String path = "/Users/sun/Desktop/projects/CyanWeb/WebContent/static/images/products/";
			String originalFileName = pic.getOriginalFilename();
			// 新的图片名称
			String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
			// 新的图片
			File newFile = new File(path + newFileName);
			// 将内存中的数据写入磁盘
			pic.transferTo(newFile);
			
			String image = "static/images/products/" + newFileName;
			paths.add(image);

		}
		
		//写入图片信息到数据库
		pictureService.uploadPictures(productId, paths);
		mv.addObject("message", "Successfully Updated");

		return mv;
	}
	
	
	
	
	@RequestMapping("/review")
	public String ProductReviewPage(Product product, Map<String, Object> map) {
		map.put("product", product);
		List<Review> reviews = productService.retrieveProductReviews(product.getProductId());
		map.put("reviews", reviews);
		return "product_review";
	}

}
