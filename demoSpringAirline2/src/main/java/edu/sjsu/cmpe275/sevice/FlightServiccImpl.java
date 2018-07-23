package edu.sjsu.cmpe275.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sjsu.cmpe275.model.Flight;
import edu.sjsu.cmpe275.model.Passenger;
import edu.sjsu.cmpe275.model.Reservation;
import edu.sjsu.cmpe275.repository.FlightDao;
@Service
public class FlightServiccImpl implements FlightService {
	@Autowired
	FlightDao fdo;
	
	
	public	FlightServiccImpl()
	{
		System.out.println("FlightServiccImpl--d.c");
	}
	@Override
	public List<Flight> getAllFlights(String date, String from, String to) {
		
		return fdo.getAllFlights(date, from, to);
	}
	@Override
	public List FlightReservation(int flightno, Passenger... passenget) {
		Flight flight=fdo.getFlight(flightno);
		List<Flight> listf= new ArrayList<>();
		listf.add(flight);
		
		int nofopassenger=passenget.length;
		int totaldiscount=0;
		int total=0;
		if(nofopassenger>6)
		{
			int price=flight.getPrice();
			for(int i=0;i<nofopassenger;i++)
			{
				total=total+price;
				
			}
			totaldiscount=(total/100)*5;
			System.out.println(totaldiscount);
			total=total-totaldiscount;
			System.out.println("finalprice"+total);
			
			Reservation res= new Reservation("ri100", total, listf);
			
		}
		else
		{
			
		}
		return null;
	}

}
