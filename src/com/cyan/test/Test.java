package com.cyan.test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyan.entity.Employee;
import com.cyan.mapper.EmployeeMapper;
import com.cyan.service.EmployeeService;
import com.cyan.serviceimpl.EmployeeServiceImpl;

public class Test {

	private ApplicationContext app;
	
	@Autowired
	private EmployeeService employeeService;
	
	@org.junit.Test
	public void test() throws IOException {
		
		app = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
		EmployeeService employeeService = (EmployeeService) app.getBean("employeeService");
//		
//		Employee record = new Employee();
//		record.setUsername("root");
//		record.setPassword("root");
//		System.out.println(employeeMapper.insert(record));
		
		//System.out.println(userMapper.selectAllUser());
		
		Employee employee = new Employee();
		employee.setUsername("sun");
		employee.setPassword("sun");
		//System.out.println(employeeService.verify(employee));
		
	}

}
