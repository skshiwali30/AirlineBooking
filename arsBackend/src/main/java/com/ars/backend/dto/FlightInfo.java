package com.ars.backend.dto;

import javax.persistence.Id;

public class FlightInfo {
	
	@Id
	private String fId;
	private String fName;
	private String source;
	private String destination;
	private double timeDuration;
	private int noOfSeats;
	private String route;
	
	
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTimeDuration() {
		return timeDuration;
	}
	public void setTimeDuration(double timeDuration) {
		this.timeDuration = timeDuration;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	
	@Override
	public String toString() {
		return "FlightInfo [fId=" + fId + ", fName=" + fName + ", source=" + source + ", destination=" + destination
				+ ", timeDuration=" + timeDuration + ", noOfSeats=" + noOfSeats + ", route=" + route + "]";
	}
	
}
