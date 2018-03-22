package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyan.entity.Customer;
import com.cyan.entity.Department;
import com.cyan.entity.DepartmentExample;
import com.cyan.mapper.DepartmentMapper;
import com.cyan.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private DepartmentExample departmentExample;

	@Override
	public List<Department> retrieveAllDepartments() {

		List<Department> departments = departmentMapper.selectByExampleWithBLOBs(departmentExample);

		departmentExample.clear();

		return departments;
	}

	@Override
	public boolean insertDepartment(Department department) {
		int res = departmentMapper.insert(department);
		if (res > 0)
			return true;
		return false;
	}
	
	@Override
	public boolean deleteDepartment(Integer departmentId) {
		
		if(departmentMapper.deleteByPrimaryKey(departmentId)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateDepartment(Department department) {
		if(departmentMapper.updateByPrimaryKeyWithBLOBs(department)>0) {
			return true;
		}
		return false;
	}
	

}
