package edu.sjsu.cmpe275.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * The type Flight.
 */

public class Flight {

    private String flightname;
    private int flightNumber;
    private int flightCapacity;
    private int price;
    private String from;
    private String to;
    private String Arrivaldate;
    private String departureTime;
    private String arrivalTime;
    private String description;
  
    private int seatsLeft;
    private List<Reservation> reservations;
    private List<Passenger> passengers;
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getFlightCapacity() {
		return flightCapacity;
	}
	public void setFlightCapacity(int flightCapacity) {
		this.flightCapacity = flightCapacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getArrivaldate() {
		return Arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		Arrivaldate = arrivaldate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	public Flight(String flightname, int flightNumber, int flightCapacity, int price, String from, String to,
			String arrivaldate, String departureTime, String arrivalTime, String description,
			int seatsLeft, List<Reservation> reservations, List<Passenger> passengers) {
		super();
		this.flightname = flightname;
		this.flightNumber = flightNumber;
		this.flightCapacity = flightCapacity;
		this.price = price;
		this.from = from;
		this.to = to;
		Arrivaldate = arrivaldate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.description = description;
		
		this.seatsLeft = seatsLeft;
		this.reservations = reservations;
		this.passengers = passengers;
	}
	public Flight(String flightname, int flightNumber, int flightCapacity, int price, String from, String to,
			String arrivaldate, String departureTime, String arrivalTime, String description) {
		super();
		this.flightname = flightname;
		this.flightNumber = flightNumber;
		this.flightCapacity = flightCapacity;
		this.price = price;
		this.from = from;
		this.to = to;
		Arrivaldate = arrivaldate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.description = description;
	}
	public Flight() {
		super();
	}
	@Override
	public String toString() {
		return "Flight [flightname=" + flightname + ", flightNumber=" + flightNumber + ", flightCapacity="
				+ flightCapacity + ", price=" + price + ", from=" + from + ", to=" + to + ", Arrivaldate=" + Arrivaldate
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", description=" + description
				+ ", seatsLeft=" + seatsLeft + ", reservations=" + reservations + ", passengers="
				+ passengers + "]";
	}
	

}