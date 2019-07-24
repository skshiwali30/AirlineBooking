package com.ars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value= {"/our-aircraft"})
	public ModelAndView ourAircraft()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Our Aircraft");
		mv.addObject("userClickOurAircraft", true);
		return mv;
	}
	
	@RequestMapping(value= {"/safety"})
	public ModelAndView safety()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Safety");
		mv.addObject("userClickSafety", true);
		return mv;
	}
	
	@RequestMapping(value= {"/charters"})
	public ModelAndView charters()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Charters");
		mv.addObject("userClickCharters", true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView Index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContacts", true);
		return mv;
	}
}
