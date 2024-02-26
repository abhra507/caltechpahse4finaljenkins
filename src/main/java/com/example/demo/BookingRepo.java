package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface BookingRepo extends JpaRepository<Booking,Integer> {
	

String query1="select booking from Booking booking where booking.doctorname=?1";
@Query(query1)
public List<Booking> findbydoctorname(String doctorname);
}
