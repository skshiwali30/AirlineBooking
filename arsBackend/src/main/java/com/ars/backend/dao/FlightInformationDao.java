package com.ars.backend.dao;

import java.util.List;

import com.ars.backend.dto.FlightInformation;

public interface FlightInformationDao {
	
	boolean add(FlightInformation fInfo);
	boolean update(FlightInformation fInfo);
	boolean delete(FlightInformation fInfo);
	
	List<FlightInformation> list();

	FlightInformation get(int flightId);

}
