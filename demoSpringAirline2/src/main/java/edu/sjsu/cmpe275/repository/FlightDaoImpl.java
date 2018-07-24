package edu.sjsu.cmpe275.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sjsu.cmpe275.model.Flight;
import edu.sjsu.cmpe275.model.Passenger;
import edu.sjsu.cmpe275.model.Reservation;
@Repository
public class FlightDaoImpl implements FlightDao {
 List<Flight> list= new ArrayList<>();
	  public FlightDaoImpl() {
	    	System.out.println("FlightDaoImpl---d.c");

	    	System.out.println("FlightDaoImpl---ststic block");
	    	list.add(new Flight("IndiGo", 800, 200, 5000, "blore", "Kolkata", "10-10-2017","8:00PM", "10:00PM",  "welcome to IndiGo Discount 5% for people traveling with more than 6 member"));
	    	list.add(new Flight("IndiGo", 801, 200, 7000, "blore", "Kolkata", "11-10-2017","8:00PM", "10:00PM",  "welcome to IndiGo Discount 5%  for people traveling with more than 6 member"));
	    	list.add(new Flight("IndiGo", 700, 200, 3000, "Kolkata", "blore", "10-10-2017","8:00PM", "10:00PM",  "welcome to IndiGo Discount  5% for people traveling with more than 6 member"));
	    	list.add(new Flight("IndiGo", 701, 200, 5000, "Kolkata", "blore", "11-10-2017","8:00PM", "10:00PM",  "welcome to IndiGo Discount 5%  for people traveling with more than 6 member"));
	    	list.add(new Flight("Lufthansa", 600, 200, 4000,"blore", "Kolkata", "10-10-2017","8:00PM", "10:00PM",  "welcome to Lufthansa Discount  5% for people traveling with more than 6 member"));
	    	list.add(new Flight("Lufthansa", 601, 200, 8000, "blore", "Kolkata", "11-10-2017","8:00PM", "10:00PM",  "welcome to Lufthansa Discount 5%  for people traveling with more than 6 member"));
	    	list.add(new Flight("Lufthansa", 400, 200, 5000, "Kolkata", "blore", "10-10-2017","8:00PM", "10:00PM",  "welcome to Lufthansa Discount 5%  for people traveling with more than 6 member"));
	    	list.add(new Flight("Lufthansa", 401, 200, 6000, "Kolkata", "blore","11-10-2017","8:00PM", "10:00PM",  "welcome to Lufthansa Discount 5%  for people traveling with more than 6 member"));
	    	list.add(new Flight("IndiGo", 900, 200, 7000, "Chennai", "Delhi", "20-10-2017","8:00PM", "10:00PM",  "welcome to IndiGo Discount for 5%  people traveling with more than 6 member"));
	    	list.add(new Flight("Lufthansa", 910, 200, 8000, "Delhi", "blore", "23-10-2017","8:00PM", "10:00PM",  "welcome to Lufthansa Discount 5% for people traveling with more than 6 member"));
	    }
	  
	  


	@Override
	public List<Flight> getAllFlights(String date, String from, String to) {
		List<Flight> flist= new ArrayList<>();
		for(Flight f:list)
		{
			if(date.equalsIgnoreCase(f.getArrivaldate()) && from.equalsIgnoreCase(f.getFrom()) && to.equalsIgnoreCase(f.getTo()))
			{
				System.out.println("if cond"+f);
				flist.add(f);
		    }
			System.out.println(f);
			
		}
		
		
		
		return flist;
	}




	@Override
	public Flight getFlight(int flightno) {
		
		for(Flight f:list)
		{
			if(f.getFlightNumber()==flightno)
			{
				return f;
		    }
			System.out.println(f);
			
		}
		return null;
	}




	@Override
	public String FlightReservationCancelletion(int flightno, String RVNO) {
		int noofcancel=0;
		Flight flight=null;
		for(Flight f:list)
		{
			if(f.getFlightNumber()==flightno)
			{
				flight=f;
				 List<Reservation> reslist=f.getReservations();
				List<Passenger> passlist= f.getPassengers();
				for(Reservation res:reslist)
				{
					if(res.getOrderNumber().equals(RVNO))
						reslist.remove(res);
				}
				
				for(Passenger pas:passlist)
				{
					if(pas.getReservations().getOrderNumber().equals(RVNO))
					{
						passlist.remove(pas);
						noofcancel++;
					}
				}
				int seatleft=f.getSeatsLeft()+noofcancel;
				f.setSeatsLeft(seatleft);
				return "Successfull Cancalled on Flight"+flight.getFlightname()+"("+flight.getFlightNumber()+")";
		    }
			System.out.println(f);
			
		}
		
		
		return null ;
	}

}
