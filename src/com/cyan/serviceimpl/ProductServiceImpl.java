package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Department;
import com.cyan.entity.DepartmentExample;
import com.cyan.entity.Product;
import com.cyan.entity.ProductExample;
import com.cyan.entity.Review;
import com.cyan.mapper.DepartmentMapper;
import com.cyan.mapper.ProductMapper;
import com.cyan.mapper.ReviewMapper;
import com.cyan.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ReviewMapper reviewMapper;

	@Autowired
	private ProductExample productExample;
	
	@Override
	public List<Product> retrieveAllProducts() {
		List<Product> products = productMapper.selectByExampleWithBLOBs(productExample);
		productExample.clear();
		return products;
	}

	@Override
	public boolean insertProduct(Product product) {
		int res = productMapper.insert(product);
		if (res > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteProduct(Integer productId) {
		if(productMapper.deleteByPrimaryKey(productId)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		if(productMapper.updateByPrimaryKeyWithBLOBs(product)>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Review> retrieveProductReviews(Integer productId) {
		return reviewMapper.selectByProductId(productId);
	}

}
