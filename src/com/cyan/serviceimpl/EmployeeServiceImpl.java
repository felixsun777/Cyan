package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Employee;
import com.cyan.entity.EmployeeExample;
import com.cyan.mapper.EmployeeMapper;
import com.cyan.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private EmployeeExample employeeExample;

	
	@Override
	public boolean verify(Employee employee) {
		
		EmployeeExample.Criteria criteria = employeeExample.createCriteria();
		criteria.andUsernameEqualTo(employee.getUsername());
		criteria.andPasswordEqualTo(employee.getPassword());
		List<Employee> list = employeeMapper.selectByExample(employeeExample);
		employeeExample.clear();
		if(list.size()>0) {
			return true;
		}else {
			return false;
		}
	}

}
