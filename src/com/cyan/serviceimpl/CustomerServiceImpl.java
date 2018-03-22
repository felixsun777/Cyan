package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Customer;
import com.cyan.entity.CustomerExample;
import com.cyan.entity.Department;
import com.cyan.entity.Employee;
import com.cyan.entity.EmployeeExample;
import com.cyan.mapper.CustomerMapper;
import com.cyan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private CustomerExample customerExample;
	
	@Override
	public List<Customer> retrieveAllCustomers() {
		
		List<Customer> customers = customerMapper.selectByExample(customerExample);
		
		customerExample.clear();
		
		return customers;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		
		int res = customerMapper.insert(customer);
		
		if(res>0) return true;
		return false;
	}
	
	@Override
	public boolean deleteCustomer(Integer userId) {
		
		if(customerMapper.deleteByPrimaryKey(userId)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		if(customerMapper.updateByPrimaryKey(customer)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean verify(Customer customer) {
		
		CustomerExample.Criteria criteria = customerExample.createCriteria();
		criteria.andUsernameEqualTo(customer.getUsername());
		criteria.andPasswordEqualTo(customer.getPassword());
		List<Customer> list = customerMapper.selectByExample(customerExample);
		customerExample.clear();
		if(list.size()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Customer getCustomerByUserName(String Username) {
		CustomerExample.Criteria criteria = customerExample.createCriteria();
		criteria.andUsernameEqualTo(Username);
		List<Customer> list = customerMapper.selectByExample(customerExample);
		customerExample.clear();
		if (!list.isEmpty()) {
			return list.get(0);
		}else {
			return null;
		}
		
		
	}

}
