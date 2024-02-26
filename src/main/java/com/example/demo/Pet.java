package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int petid;
		private String petname;
		private String petage;
		private String petsize;
		private String petsex;
        private String userid;
        private String username;

}
