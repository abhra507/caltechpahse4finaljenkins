package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

	String query="select doctor from Doctor doctor where doctor.doctorname=?1";
	@Query(query)
	public List<Doctor> findbyname(String doctorname);
	

	
	String query1="update Doctor doctor set doctor.availabilitystatus=:status where doctor.did=:did";
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(query1)
	public int updateById(@Param("did") int did,@Param("status") String status);

	
}

