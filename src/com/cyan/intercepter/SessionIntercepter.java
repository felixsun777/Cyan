package com.cyan.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionIntercepter implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String RequestURI = request.getRequestURI();
		String ContextPath = request.getContextPath();
		
		if(RequestURI.equals(ContextPath+"/") || RequestURI.equals(ContextPath+"/login")) {
			return true;
		}	
		HttpSession session = request.getSession();
		if (session.getAttribute("user") != null) {
			return true;
		} else {
			request.setAttribute("message", "Session Expired. Please Login!");
			request.getRequestDispatcher("/").forward(request, response);
			return false;
		}
	}

}
