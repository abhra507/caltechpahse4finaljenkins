package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	
	@Autowired
	UserRepo repo;

	public User createuser(User user)
	{
		return repo.save(user);
	}
	
	public User findbynamepsswd(String username,String password)
	{
		return repo.findbynameandpwd(username, password);
	}

	
	public Boolean findbynamepssword(String username,String password)
	{
		User e=repo.findbynameandpwd(username, password);
		if (e !=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	


}
