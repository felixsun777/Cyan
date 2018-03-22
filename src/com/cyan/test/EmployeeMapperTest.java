package com.cyan.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyan.entity.Employee;
import com.cyan.entity.EmployeeExample;
import com.cyan.mapper.EmployeeMapper;

public class EmployeeMapperTest {

	private ApplicationContext app;
	private EmployeeMapper employeeMapper;
	
	@Before
	public void setUp() throws Exception {
		app = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
		employeeMapper = (EmployeeMapper) app.getBean("employeeMapper");
	}

	//根据主键删除
	@Test
	public void testDeleteByPrimaryKey() {
		
	}

	//插入
	@Test
	public void testInsert() {
		
	}

	//根据样例查询
	@Test
	public void testSelectByExample() {
		
		EmployeeExample example = new EmployeeExample();
		EmployeeExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo("123");
		criteria.andPasswordEqualTo("sun");
		List<Employee> res = employeeMapper.selectByExample(example);
		if(res.size()>0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

	//根据主键查询
	@Test
	public void testSelectByPrimaryKey() {
		
		System.out.println(employeeMapper.selectByPrimaryKey(1).getUsername());
		
	}

	//根据主键更新
	@Test
	public void testUpdateByPrimaryKey() {
		
	}

}
