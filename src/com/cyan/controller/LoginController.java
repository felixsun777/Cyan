package com.cyan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.entity.Employee;
import com.cyan.service.EmployeeService;

@Controller
public class LoginController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
		
	}
	
	
	@RequestMapping("/login")
	public void login(Employee employee,HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		if(employee.getUsername()==null || employee.getPassword()==null) {
			request.setAttribute("message", "Incorrect username or password");
			request.getRequestDispatcher("/").forward(request, response);
		}else {
			if(employeeService.verify(employee)) {
				session.setAttribute("user", employee);
				response.sendRedirect(request.getContextPath()+"/menu");
			}else {
				request.setAttribute("message", "Incorrect username or password");
				request.getRequestDispatcher("/").forward(request, response);
			}
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "index";
		
	}
	
}
