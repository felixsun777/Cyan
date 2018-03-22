package com.cyan.service;

import java.util.List;

import com.cyan.entity.Orderdetail;
import com.cyan.entity.Orders;

public interface OrderService {

	List<Orders> retrieveAllOrders();
	boolean deleteOrder(Integer orderId);
	boolean updateOrder(Orders order);
	List<Orderdetail> retrieveOrderDetails(Integer orderId);
}
