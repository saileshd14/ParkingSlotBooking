package com.example.demo.ParkingSlot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot,Integer> {
	
	List<ParkingSlot> findByLocation(String location);

}
