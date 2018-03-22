package com.cyan.serviceimpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.CategoryExample;
import com.cyan.entity.CustomerExample;
import com.cyan.entity.OrdersExample;
import com.cyan.entity.ProductExample;
import com.cyan.mapper.CategoryMapper;
import com.cyan.mapper.CustomerMapper;
import com.cyan.mapper.OrdersMapper;
import com.cyan.mapper.ProductMapper;
import com.cyan.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private ProductExample productExample;
	@Autowired
	private OrdersMapper orderMapper;
	@Autowired
	private OrdersExample orderExample;
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private CustomerExample customerExample;
	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private CategoryExample categoryExample;
	
	@Override
	public HashMap<String, Integer> getCount() {
		HashMap<String, Integer> count = new HashMap<>();
		count.put("product", (int) productMapper.countByExample(productExample));
		count.put("order", (int) orderMapper.countByExample(orderExample));
		count.put("customer", (int) customerMapper.countByExample(customerExample));
		count.put("category", (int) categoryMapper.countByExample(categoryExample));
		return count;
	}

}
