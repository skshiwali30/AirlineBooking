package com.ars.backend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ars.backend.dao.FlightInfoDao;
import com.ars.backend.dto.FlightInfo;

@Repository("flightDao")
public class FlightInfoDaoImpl implements FlightInfoDao {
	
	private static List<FlightInfo> flights = new ArrayList<>();

	static {
		FlightInfo flight = new FlightInfo();
		
		//add info of 1st flight
		flight.setfId("IN1234");
		flight.setfName("Air12");
		flight.setNoOfSeats(150);
		flight.setSource("Delhi");
		flight.setDestination("Bombay");
		flight.setTimeDuration(5.6);
		flight.setRoute("Jaipur");
		flights.add(flight);
		
		flight = new FlightInfo();
		//add info of 2nd flight
		flight.setfId("IN1235");
		flight.setfName("Air22");
		flight.setNoOfSeats(250);
		flight.setSource("Delhi");
		flight.setDestination("Chennai");
		flight.setTimeDuration(9.8);
		flight.setRoute("Goa");
		flights.add(flight);
	}
	@Override
	public List<FlightInfo> list() {
		return flights;
	}

}
