package edu.sjsu.cmpe275.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	    @PostMapping("/reserv/{flightno}")
	    public ResponseEntity<String> FlightReservation(@PathVariable int flightno ,@RequestBody Passenger... passenget) {
	    	
	    	String s=flightService.FlightReservation(flightno, passenget);
	    	System.out.println("PassengerController"+s);
	              return new ResponseEntity(s, HttpStatus.OK);

	    }

	    @DeleteMapping("/revcancel/{flightno}/{RVNO}")
	    public ResponseEntity<String> FlightReservationCancelletion(@PathVariable int flightno,@PathVariable String RVNO)
	    {
	    	String s=flightService.FlightReservationCancelletion(flightno, RVNO);
	    	System.out.println("PassengerController"+s);
	              return new ResponseEntity(s, HttpStatus.OK);
	    }
   

}
