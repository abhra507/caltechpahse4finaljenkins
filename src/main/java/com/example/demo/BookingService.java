package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {	
	Logger log=Logger.getAnonymousLogger();
	@Autowired
	BookingRepo rc;
	

	
	
	public Booking persisttoDB(Booking booking)
	{
		log.info("the persist object is "+booking.toString());
			return rc.save(booking);		
		
	}
		
	
	public List<Booking> getallbookings()
	{
		return rc.findAll();
	}
	
	public List<Booking> findbydoctorname(String doctorname)
	{
		return rc.findbydoctorname(doctorname);
	}

	

}
