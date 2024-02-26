package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DoctorController {
	Logger log=Logger.getAnonymousLogger();
	@Autowired
	DoctorService seo;
	
	@RequestMapping("/getdoctorbyname/{doctorname}")
			public ModelAndView getdoctorbydoctorname(HttpServletRequest request,HttpServletResponse response,@PathVariable("doctorname") String doctorname) {
			ModelAndView mnv=new ModelAndView();
			List<Doctor> list=seo.findbyname(doctorname);
			mnv.setViewName("doctorlist.jsp");
			mnv.addObject("lists", list);
		    return mnv;
		
	}
	



	
	@RequestMapping("/getalldoctorlists")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		 ModelAndView mnv=new ModelAndView();
		 List<Doctor> list=seo.getall();
			mnv.setViewName("doctorlist.jsp");
			mnv.addObject("lists", list);
		    return mnv;


	}

	@RequestMapping("/updatedoctoravailabilitystatus/{did}")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response,@PathVariable("did") String did) {
		 ModelAndView mnv=new ModelAndView();
		 int did1=Integer.parseInt(did);
		 String s=seo.update(did1);
		 mnv.addObject("lists2", s);
		 return mnv;


	}
	


}



