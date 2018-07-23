package edu.sjsu.cmpe275.sevice;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import edu.sjsu.cmpe275.model.Flight;
import edu.sjsu.cmpe275.model.Passenger;

public interface FlightService {
	List<Flight> getAllFlights(String date, String from,String to);
	  List  FlightReservation(int flightno ,Passenger... passenget);

}
