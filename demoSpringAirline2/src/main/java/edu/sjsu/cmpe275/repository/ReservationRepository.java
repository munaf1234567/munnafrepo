package edu.sjsu.cmpe275.repository;


import edu.sjsu.cmpe275.model.Reservation;


import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

/**
 * The interface Reservation repository.
 */

public interface ReservationRepository  {

    /**
     * Search for reservations list.
     *
     * @param passengerId  the passenger id
     * @param dest_from    the dest from
     * @param dest_to      the dest to
     * @param flightNumber the flight number
     * @return the list
     */
   
    List<Reservation> searchForReservations(@PathVariable("passengerId") String passengerId, @PathVariable("dest_from") String dest_from,
    		@PathVariable("dest_to") String dest_to, @PathVariable("flightNumber") String flightNumber);


}

