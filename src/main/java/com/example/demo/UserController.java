package com.example.demo;

import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
Logger log=Logger.getAnonymousLogger();
@Autowired
Userservice service;

/*@ResponseBody
@RequestMapping("/login")
public String login(HttpServletRequest request,HttpServletResponse response,@RequestBody User user) {
	User ee=service.findbynamepsswd(user.getName(),user.getPassword());
	if(ee!=null) {
		return "Welcome , "+ee.getName()+" ,"+ee.getUserid();
			}
	else {
	   return "login failed" ;
	}

	
}*/

@RequestMapping("/")
public ModelAndView loginRequest1(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();	
		mv.setViewName("login.jsp");
	return mv;
	
}

@RequestMapping("/reg")
public ModelAndView registerRequest1(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();	
		mv.setViewName("register.jsp");
	return mv;
	
}

@RequestMapping("/login")
public ModelAndView loginRequest(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();	
	String user=request.getParameter("user");
	String pwd=request.getParameter("pwd");
	log.info("values recieved from form ");
	User ee=service.findbynamepsswd(user,pwd);
	if(ee!=null) {
		mv.setViewName("display.jsp");
		log.info("login is suceess");
		mv.addObject("emp", ee);
	}
	else {
		mv.setViewName("fail.jsp");
		log.info("login failed");
	}
	
	return mv;
	
}


@RequestMapping("/register")
public ModelAndView  registerms(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();	
	String user=request.getParameter("user");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	User user1=new User();
	user1.setName(user);
	user1.setEmail(email);
	user1.setPassword(pwd);
	user1.setRetypepassword(pwd);
	User ee=service.createuser(user1);
	log.info("the object added is  "+ee.toString());
	if(ee !=null) {
		
		mv.setViewName("login1.jsp");
		mv.addObject("usr", "registration done succcessfully..");
		mv.addObject("emp", ee);
		log.info("the object mv "+mv);
	}
	
	 return mv;

}


/*@ResponseBody
@RequestMapping("/register")
public String registerms(HttpServletRequest request,HttpServletResponse response,@RequestBody User user) {
	User ee=service.createuser(user);
	if(ee !=null) {
	return ("registration done succcessfully for " +ee.getName());
	}
	else
	{
		return "registration failed";
	}
	
}*/


}
