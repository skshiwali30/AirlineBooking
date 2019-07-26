package com.ars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ars.backend.dao.FlightInfoDao;
import com.ars.backend.dao.UserLoginDao;

@Controller
public class PageController {
	
	@Autowired
	private UserLoginDao userDao;
	private FlightInfoDao flightDao;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		//passing list of users
		mv.addObject("users", userDao.list());
		
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
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContacts", true);
		return mv;
	}
	
	//method to show all flights details
	@RequestMapping(value= {"/show/all/flightDetails"})
	public ModelAndView showAllFlightDetails()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Flights");
		//passing list of users
		mv.addObject("flights", flightDao.list());
		
		mv.addObject("userClickAllFlight", true);
		return mv;
	}
}
