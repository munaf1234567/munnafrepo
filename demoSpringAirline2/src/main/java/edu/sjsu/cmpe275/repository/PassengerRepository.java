package edu.sjsu.cmpe275.repository;

import org.springframework.web.bind.annotation.PathVariable;

import edu.sjsu.cmpe275.model.Passenger;



/**
 * The interface Passenger repository.
 */

public interface PassengerRepository {

   
    Passenger getPassengerByOrderNo(@PathVariable("orderNumber") String orderNumber);

}
