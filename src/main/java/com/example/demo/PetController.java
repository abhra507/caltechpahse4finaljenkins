package com.example.demo;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetController {
Logger log=Logger.getAnonymousLogger();
@Autowired
PetService se;


@RequestMapping("/inputrequest")
public ModelAndView inputrequest(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();	
	String petname=request.getParameter("petname");
	String petage=request.getParameter("petage");
	String petsize=request.getParameter("petsize");
	String petsex=request.getParameter("petsex");
	String userid=request.getParameter("userid");
	String username=request.getParameter("username");
	Pet p=new Pet();
	p.setPetage(petage);
	p.setPetname(petname);
	p.setPetsize(petsize);
	p.setUserid(userid);
	p.setUsername(username);
	p.setPetsex(petsex);	
	Pet ee=se.createrequest(p);
	if(ee!=null) {
		mv.setViewName("pets.jsp");
		mv.addObject("petobject", ee);

			}
	else {
		mv.setViewName("display.jsp");

	}

	 return mv;
	
	
}







/*@ResponseBody
@RequestMapping("/getallrequestsbyId/{id}")
public Optional<Request> getallbyId(@PathVariable("id") int id){
		return se.getbyId(id);
	}




@ResponseBody
@RequestMapping("/getallrequests")
public List<Request> getall(){
	 return se.getall();
	}


@ResponseBody
@RequestMapping(value="/request/{destination}")
public List<Request> getRequestsbydestination(HttpServletRequest request,HttpServletResponse response,@PathVariable("destination") String destination) {
	return se.findbydestination(destination);

	
}

@ResponseBody
@RequestMapping("/deletebyid/{id}")
public List<Request> delete(@PathVariable("id") int id) {
	se.delete(id);
	return getall();
}

@ResponseBody
@RequestMapping("/updateBydestination")
public Request updatebydestination(@RequestBody Request e) {
	log.info("the request object is "+e.toString());
	return se.updateRequest(e);
}




@ResponseBody
@RequestMapping("/deleterequest/{id}")
public String deleterequest(@PathVariable("id") String id) {
	int id1=Integer.parseInt(id);  
	return  se.delete(id1);
	
	
}*/

}


