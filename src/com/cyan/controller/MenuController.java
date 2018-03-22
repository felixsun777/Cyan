package com.cyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("menu");
		mv.addObject("count",menuService.getCount());
		return mv;
	}
	
}
