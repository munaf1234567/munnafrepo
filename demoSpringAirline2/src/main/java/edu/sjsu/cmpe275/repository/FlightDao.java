package edu.sjsu.cmpe275.repository;

import edu.sjsu.cmpe275.model.Flight;



import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


public interface FlightDao {
	List<Flight> getAllFlights(String date, String from,String to);
	Flight getFlight(int flightno);
	
}
