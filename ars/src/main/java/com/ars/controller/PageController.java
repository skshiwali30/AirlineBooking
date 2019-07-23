package com.ars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView Index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to MVC spring framework..");
		return mv;
	}
}
