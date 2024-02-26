package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	Logger log=Logger.getAnonymousLogger();
	
	@Autowired
	DoctorRepo re;
	



	
	public List<Doctor> findbyname(String doctorname)
	{
		return re.findbyname(doctorname);
	}

	
	public List<Doctor> getall()
	{
		return re.findAll();
	}

	
	//delete 
	public String update(int id) {
		String status="no";
		re.updateById(id,status);
		return "updated id of "+id;
	}


}