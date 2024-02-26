package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;
	private int userid;
	private int doctorid;
	private int petid;
	private String ownername;
    private String petname;
    private String doctorname;
    private String appointmentstatus;
   
}
