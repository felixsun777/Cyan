package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Category;
import com.cyan.entity.CategoryExample;
import com.cyan.entity.Department;
import com.cyan.mapper.CategoryMapper;
import com.cyan.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private CategoryExample categoryExample;
	
	@Override
	public List<Category> retrieveAllCategories() {
		List<Category> categories = categoryMapper.selectByExampleWithBLOBs(categoryExample);
		categoryExample.clear();
		return categories;
	}

	@Override
	public boolean insertCategory(Category category) {
		int res = categoryMapper.insert(category);
		if (res > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteCategory(Integer categoryId) {
		if(categoryMapper.deleteByPrimaryKey(categoryId)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCategory(Category category) {
		if(categoryMapper.updateByPrimaryKeyWithBLOBs(category)>0) {
			return true;
		}
		return false;
	}

}
