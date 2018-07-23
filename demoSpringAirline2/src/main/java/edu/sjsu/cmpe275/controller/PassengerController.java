package edu.sjsu.cmpe275.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.sjsu.cmpe275.model.*;
import edu.sjsu.cmpe275.sevice.FlightService;



/**
 * The type Passenger controller.
 */
@RestController
@RequestMapping(value = "/passenger")
public class PassengerController {
	
	
	
	 @Autowired
		FlightService flightService;
	    
	    
	    public PassengerController() {
	    	System.out.println("PassengerController---d.c");
	    }
	    @GetMapping("/flight/{date}/{from}/{to}")
	    public ResponseEntity<List<Flight>> FlightReservation(@PathVariable int flightno ,@PathVariable Passenger... passenget) {
	    	
	    	List<Flight> list=flightService.getAllFlights(date,from,to);
	    	System.out.println("FlightController"+list);
	              return new ResponseEntity(list, HttpStatus.OK);
	           
	     

	    }

   

}
