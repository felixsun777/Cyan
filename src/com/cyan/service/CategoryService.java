package com.cyan.service;

import java.util.List;

import com.cyan.entity.Category;


public interface CategoryService {

	List<Category> retrieveAllCategories();
	boolean insertCategory(Category category);
	boolean deleteCategory(Integer categoryId);
	boolean updateCategory(Category category);
	
}
