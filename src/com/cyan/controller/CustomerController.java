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
import com.cyan.entity.Customer;
import com.cyan.entity.Department;
import com.cyan.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public ModelAndView customer() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer");
		List<Customer> customers = customerService.retrieveAllCustomers();
		mv.addObject("customers", customers);
		return mv;
	}
	
	@RequestMapping("/new")
	public String newCustomerPage() {
		return "customer_new";
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertCustomer(Customer customer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer_new");
		if(customerService.insertCustomer(customer)) {
			mv.addObject("message", "Successfully Added");
		}else {
			mv.addObject("message", "Adding failed");
		}
		
		return mv;
	}
	
	
	@RequestMapping("/delete")
	public void deleteCustomer(Integer userId,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		if(customerService.deleteCustomer(userId)) {
			request.setAttribute("message", "Successfully Deleted");
		}else {
			request.setAttribute("message", "Deleting failed");
		}
		//response.sendRedirect(request.getContextPath()+"/customer/customers");
		request.getRequestDispatcher("/customer/customers").forward(request, response);
	}
	
	
	@RequestMapping("/modify")
	public ModelAndView modifyDepartmentPage(Customer customer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer_update");
		mv.addObject("customer", customer);
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateCustomer(Customer customer,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer_update");
		if(customerService.updateCustomer(customer)) {
			request.setAttribute("message", "Successfully Updated");
		}else {
			request.setAttribute("message", "Updating failed");
		}
		return mv;
	}
	
}
