package com.cyan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.entity.Category;
import com.cyan.entity.Department;
import com.cyan.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categories")
	public ModelAndView categories(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("category");
		List<Category> categories = categoryService.retrieveAllCategories();
		mv.addObject("categories", categories);
		mv.addObject("message", request.getAttribute("message"));
		return mv;
	}
	
	@RequestMapping("/new")
	public String newCategoryPage() {
		return "category_new";
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertCategory(Category category) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("category_new");
		if(categoryService.insertCategory(category)) {
			mv.addObject("message", "Successfully Added");
		}else {
			mv.addObject("message", "Adding failed");
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	public void deleteCategory(Integer categoryId,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		if(categoryService.deleteCategory(categoryId)) {
			request.setAttribute("message", "Successfully Deleted");
		}else {
			request.setAttribute("message", "Deleting failed");
		}
		//response.sendRedirect(request.getContextPath()+"/category/categories");
		request.getRequestDispatcher("/category/categories").forward(request, response);
	}
	
	@RequestMapping("/modify")
	public ModelAndView modifyDepartmentPage(Category category) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("category_update");
		mv.addObject("category", category);
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateCategory(Category category,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("category_update");
		if(categoryService.updateCategory(category)) {
			mv.addObject("message", "Successfully Updated");
		}else {
			mv.addObject("message", "Updating failed");
		}
		return mv;
	}
	
}
