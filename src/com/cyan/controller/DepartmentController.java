package com.cyan.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.entity.Department;
import com.cyan.service.DepartmentService;


@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/departments")
	public ModelAndView departments(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("department");
		List<Department> departments = departmentService.retrieveAllDepartments();
		mv.addObject("departments", departments);
		mv.addObject("message", request.getAttribute("message"));
		return mv;
	}
	
	@RequestMapping("/new")
	public String newDepartmentPage() {
		return "department_new";
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertDepartment(Department department) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("department_new");
		if(departmentService.insertDepartment(department)) {
			mv.addObject("message", "Successfully Added");
		}else {
			mv.addObject("message", "Adding failed");
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	public void deleteDepartment(Integer departmentId,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		if(departmentService.deleteDepartment(departmentId)) {
			request.setAttribute("message", "Successfully Deleted");
		}else {
			request.setAttribute("message", "Deleting failed");
		}
		//response.sendRedirect(request.getContextPath()+"/department/departments");
		request.getRequestDispatcher("/department/departments").forward(request, response);
	}
	
	
//	@RequestMapping("/modify")
//	public ModelAndView modifyDepartmentPage(Department department) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("department_update");
//		mv.addObject("department", department);
//		return mv;
//	}
	
	@RequestMapping("/modify")
	public String modifyDepartmentPage(Department department,Map<String, Department> map) {
		map.put("department", department);
		return "department_update";
	}
	
	@RequestMapping("/update")
	public ModelAndView updateDepartment(Department department,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("department_update");
		if(departmentService.updateDepartment(department)) {
			mv.addObject("message", "Successfully Updated");
		}else {
			mv.addObject("message", "Updating failed");
		}
		return mv;
	}
	
}
