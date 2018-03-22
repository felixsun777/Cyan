package com.cyan.service;

import java.util.List;

import com.cyan.entity.Customer;
import com.cyan.entity.Department;

public interface DepartmentService {

	List<Department> retrieveAllDepartments();
	boolean insertDepartment(Department department);
	boolean deleteDepartment(Integer departmentId);
	boolean updateDepartment(Department department);
}
