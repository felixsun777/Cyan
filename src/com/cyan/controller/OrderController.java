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

import com.cyan.entity.Orderdetail;
import com.cyan.entity.Orders;
import com.cyan.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired 
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public ModelAndView orders(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order");
		List<Orders> orders = orderService.retrieveAllOrders();
		mv.addObject("orders", orders);
		mv.addObject("message", request.getAttribute("message"));
		return mv;
	}
	
	@RequestMapping("/delete")
	public void deleteOrder(Integer orderId,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		if(orderService.deleteOrder(orderId)) {
			request.setAttribute("message", "Successfully Deleted");
		}else {
			request.setAttribute("message", "Deleting failed");
		}
		//response.sendRedirect(request.getContextPath()+"/order/orders");
		request.getRequestDispatcher("/order/orders").forward(request, response);
	}
	
	
	@RequestMapping("/modify")
	public ModelAndView updateOrderPage(Orders order) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order_update");
		mv.addObject("order", order);
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateOrder(Orders order) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order_update");
		if(orderService.updateOrder(order)) {
			mv.addObject("message", "Successfully Updated");
		}else {
			mv.addObject("message", "Updating failed");
		}
		return mv;
	}
	
	@RequestMapping("/detail")
	public ModelAndView OrderDetailPage(Orders order) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order_detail");
		mv.addObject("order", order);
		List<Orderdetail> details = orderService.retrieveOrderDetails(order.getOrderId());
		mv.addObject("details", details);
		return mv;
	}
	
	
	
}
