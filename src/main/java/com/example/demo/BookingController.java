package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	Logger log=Logger.getAnonymousLogger();
	
	@Autowired
	BookingService se;
	
	@Autowired
	DoctorService se1;
	
	/*@ResponseBody
	@RequestMapping("/cabbook/{cabid}/{requestid}")
	public List<Booking> cabbook(HttpServletRequest request,HttpServletResponse response,@PathVariable("cabid") int cabid,@PathVariable("requestid") int requestid) {
		
			return se.bookbycabidandreqestid(cabid,requestid);
		}

	@ResponseBody
	@RequestMapping("/persisttoDB")
	public String persist(HttpServletRequest request,HttpServletResponse response,@RequestBody Booking booking) {
		log.info("the persist object is "+booking.toString());
		
		Booking b=se.persisttoDB(booking);
		if (b != null)
		{
			return "persisted";
		}
		else
		{
			return "not persisted";
		}
		}
	
	
	@ResponseBody
	@RequestMapping("/getallcabbookings")
	public List<Booking> getallcabbookings(HttpServletRequest request,HttpServletResponse response) {
				
		return se.getallbookings();

		}
		
	@ResponseBody
	@RequestMapping("/cabbook/{destination}")
	public List<Booking> updatebydestination(@PathVariable("destination") String destination) {	
		return se.findbydestination(destination);
	}*/
	
	
	@RequestMapping("/booking")
	public ModelAndView booking(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();	
		int ownerid=Integer.parseInt(request.getParameter("ownerid"));
		int petid=Integer.parseInt(request.getParameter("petid"));
		int doctorid=Integer.parseInt(request.getParameter("doctorid"));
		String doctorname=request.getParameter("doctorname");
		String petname=request.getParameter("petname");		
		String ownername=request.getParameter("ownername");
		String appstatus="booked";
		Booking booking=new Booking();
        booking.setDoctorid(doctorid);
        booking.setUserid(ownerid);
        booking.setPetid(petid);
        booking.setDoctorname(doctorname);
        booking.setPetname(petname);
        booking.setOwnername(ownername);
        booking.setAppointmentstatus(appstatus);
		log.info("values recieved from form ");
		 Booking b=se.persisttoDB(booking);
		 se1.update(doctorid);
			mv.setViewName("bookinglist.jsp");
			mv.addObject("lists", b);		
		    return mv;
		
	}
	
	

	
	
	@RequestMapping("/history")
	public ModelAndView bookinghistory(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();			
		List<Booking> b1=se.getallbookings();
			mv.setViewName("bookinghistory.jsp");
			mv.addObject("lists", b1);		
		    return mv;
		
	}
	
}
