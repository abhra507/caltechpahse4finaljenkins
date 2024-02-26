package com.example.demo;


import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorTest1  {
	
	@Autowired
	 Userservice validobj;
	


	@Test
	public void test1() {
		 System.out.println("in test1");
		assertTrue(validobj.findbynamepssword("pritam","pritam"));
	
	}
	

	

}
