package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Orderdetail;
import com.cyan.entity.Orders;
import com.cyan.entity.OrdersExample;
import com.cyan.mapper.OrderdetailMapper;
import com.cyan.mapper.OrdersMapper;
import com.cyan.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrdersMapper orderMapper;
	
	@Autowired
	private OrderdetailMapper orderdetailMapper;

	@Autowired
	private OrdersExample orderExample;
	
	@Override
	public List<Orders> retrieveAllOrders() {
		orderExample.setOrderByClause("order_id DESC");
		List<Orders> orders = orderMapper.selectByExample(orderExample);
		orderExample.clear();
		return orders;
	}

	@Override
	public boolean deleteOrder(Integer orderId) {
		int res = orderMapper.deleteByPrimaryKey(orderId);
		if (res > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateOrder(Orders order) {
		int res = orderMapper.updateByPrimaryKey(order);
		if (res > 0)
			return true;
		return false;
	}

	@Override
	public List<Orderdetail> retrieveOrderDetails(Integer orderId) {	
		return orderdetailMapper.selectByOrderId(orderId);
	}

	
}
