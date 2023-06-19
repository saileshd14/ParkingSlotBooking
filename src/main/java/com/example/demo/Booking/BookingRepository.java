package com.example.demo.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

	List<Booking> findByUserID(int userID);
	List<Booking> findByParkingSlotAndStatus(String parkingSlot, String status);
	List<Booking> findByWorkerIDContainingAndStatus(String workerID, String status);

}
