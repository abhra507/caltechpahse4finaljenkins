package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PetRepo extends JpaRepository<Pet,Integer>{
	
   	String query="select pet from Pet pet where pet.petname=?1";
    @Query(query)
     public List<Pet> findbypetname(String petname);
	

}
