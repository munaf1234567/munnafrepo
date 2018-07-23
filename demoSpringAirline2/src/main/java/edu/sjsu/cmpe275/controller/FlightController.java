package edu.sjsu.cmpe275.controller;


import edu.sjsu.cmpe275.model.*;



import edu.sjsu.cmpe275.sevice.FlightService;
import edu.sjsu.cmpe275.utils.DateTimeUtil;
import edu.sjsu.cmpe275.utils.IntervalStartComparator;
import org.joda.time.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



@RestController
public class FlightController {
    @Autowired
	FlightService flightService;
    
    
    public FlightController() {
    	System.out.println("FlightController---d.c");
    }
    @GetMapping("/flight/{date}/{from}/{to}")
    public ResponseEntity<List<Flight>> getFlightsInfo(@PathVariable String date,@PathVariable String from,@PathVariable String to) {
    	List<Flight> list=flightService.getAllFlights(date,from,to);
    	System.out.println("FlightController"+list);
              return new ResponseEntity(list, HttpStatus.OK);
           
     

    }

   


}
