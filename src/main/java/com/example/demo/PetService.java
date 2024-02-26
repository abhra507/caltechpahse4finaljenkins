
package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
	Logger log=Logger.getAnonymousLogger();
	
	@Autowired
	PetRepo re;
	


	public Pet createrequest(Pet pet)
	{
		return re.save(pet);
	}
	
	/*public List<Request> findbydestination(String destination)
	{
		return re.findbydestination(destination);
	}

	//retrive
	public List<Request> getall(){
	return re.findAll();
	}
	
	
	public boolean getallforjunit(){
	List<Request> rr= re.findAll();
	if (rr !=null)
	{
		return true;
	}
	else
	{
		return false;
	}
	}

	
	public Optional<Request> getbyId(int id) {
		return re.findById(id);
	}



	
	//delete 
	public String delete(int id) {
		re.deleteById(id);
		return "deleted id of "+id;
	}


	//update 
  
		public Request updateRequest(Request e) {
		Request ee=re.findById(e.getRequestid()).orElse(null);			
		ee.setDestination(e.getDestination());	
		return re.save(ee);
			
		}*/
		
		

		

		

}