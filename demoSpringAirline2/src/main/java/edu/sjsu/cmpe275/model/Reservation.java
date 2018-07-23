package edu.sjsu.cmpe275.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * The type Reservation.
 */

public class Reservation {

   
    private String orderNumber;

   
    private int price;

   
    private List<Flight> flights;

 
    private Passenger passengerFKey;

  

  
   

	public Reservation(String orderNumber, int price, List<Flight> flights) {
		super();
		this.orderNumber = orderNumber;
		this.price = price;
		this.flights = flights;
	}


	public Reservation() {
    }

    
    public Reservation(int price, Passenger passengerFKey, List<Flight> flights) {
        this.price = price;
        this.passengerFKey = passengerFKey;
        this.flights = flights;
    }

   
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets order number.
     *
     * @param orderNumber the order number
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Gets flights.
     *
     * @return the flights
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * Sets flights.
     *
     * @param flights the flights
     */
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * Gets passengerFKey.
     *
     * @return the passengerFKey
     */
    @JsonIgnore
    public Passenger getPassengerFKey() {
        return passengerFKey;
    }

    /**
     * Sets passengerFKey.
     *
     * @param passengerFKey the passengerFKey
     */
    public void setPassengerFKey(Passenger passengerFKey) {
        this.passengerFKey = passengerFKey;
    }

    /**
     * Gets passenger.
     *
     * @return the passenger
     */
   
}