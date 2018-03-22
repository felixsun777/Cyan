package com.cyan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cyan.entity.Customer;
import com.cyan.entity.Department;
import com.cyan.entity.Employee;

public interface CustomerService {

	List<Customer> retrieveAllCustomers();
	boolean insertCustomer(Customer customer);
	boolean deleteCustomer(Integer userId);
	boolean updateCustomer(Customer customer);
	boolean verify(Customer customer);
	Customer getCustomerByUserName(String Username);
}
