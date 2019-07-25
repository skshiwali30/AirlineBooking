package com.ars.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightInformation {

	/*
	 * private fields
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String flightName;
	private double fare;
	private String startPoint;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private int no_of_seats;
	
	@Column(name = "vaccantSeat")
	private boolean isVaccantSeat;
	
	//getter and setter
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int string) {
		this.flightId = string;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String source) {
		this.startPoint = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String string) {
		this.departureTime = string;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String string) {
		this.arrivalTime = string;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public boolean isVaccantSeat() {
		return isVaccantSeat;
	}
	public void setVaccantSeat(boolean isVaccantSeat) {
		this.isVaccantSeat = isVaccantSeat;
	}
	
	@Override
	public String toString() {
		return "FlightInformation [flightId=" + flightId + ", flightName=" + flightName + ", fare=" + fare
				+ ", startPoint=" + startPoint + ", destination=" + destination + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", no_of_seats=" + no_of_seats + ", isVaccantSeat=" + isVaccantSeat
				+ ", getFlightId()=" + getFlightId() + ", getFlightName()=" + getFlightName() + ", getFare()="
				+ getFare() + ", getStartPoint()=" + getStartPoint() + ", getDestination()=" + getDestination()
				+ ", getDepartureTime()=" + getDepartureTime() + ", getArrivalTime()=" + getArrivalTime()
				+ ", getNo_of_seats()=" + getNo_of_seats() + ", isVaccantSeat()=" + isVaccantSeat() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
