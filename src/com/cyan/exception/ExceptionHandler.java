package com.cyan.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception ex) {

		ModelAndView mv = new ModelAndView();
		
		if(ex.getMessage().equals("Credit Card already exist under other account!")
				|| ex.getMessage().equals("Place order failed")) {
			mv.setViewName("order");
		}else {
			mv.setViewName("error");
		}
		mv.addObject("exception", ex.getMessage());
		return mv;
	}

}
