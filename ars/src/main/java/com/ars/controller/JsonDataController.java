package com.ars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	/*@Autowired
	private FlightInformationDao flightInfoDao;
	
	@ResponseBody
	@RequestMapping(value = "/flightInfo", method = RequestMethod.GET)
	public List<FlightInformation> getAllFlightInformation()
	{
		return flightInfoDao.list();
	}*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "hello";
	}
}
