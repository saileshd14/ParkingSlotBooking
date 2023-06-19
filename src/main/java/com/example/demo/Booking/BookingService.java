package com.example.demo.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Request.Request;
import com.example.demo.User.User;
import com.example.demo.User.UserRepository;


@Service

public class BookingService {
	@Autowired
	private BookingRepository repository;
	@Autowired
	private UserRepository user;
	public Booking saveBooking(Booking b)
	{
		return repository.save(b);
		
	}
	public List<Booking> getBooking(int userID)
	{
		return repository.findByUserID(userID);
		
	}
	
	public Booking modiflyBooking(Request p)
	{
		Booking existingProduct =  repository.findById(p. getBookRefNum()).orElse(null);
		if(p.getStatus().equals("Approved"))
		{
			existingProduct.setParkingSlot(p.getParkingSlot());
			existingProduct.setLocation(p.getLocation());
			existingProduct.setDate(p.getDate());
			existingProduct.setCheckInTime(p.getCheckInTime());
			existingProduct.setCheckOutTime(p.getCheckOutTime());
			existingProduct.setService(p.getService());
			existingProduct.setBillCost(p.getBillCost());
			existingProduct.setStatus("Modification Approved");
		}
		if(p.getStatus().equals("Declined"))
		{
			existingProduct.setStatus("Modification Declined");
		}
		if(p.getStatus().equals("Ongoing"))
		{
			existingProduct.setStatus("Modification under Approval");
		}
		
		return repository.save(existingProduct);
		
	}
	public Booking cancelBooking(int BookRefNum)
	{
		Booking b =  repository.findById(BookRefNum).orElse(null);
		b.setStatus("CANCELLED");
		User u = user.findById(b.getUserID()).orElse(null);
		u.setWallet(u.getWallet()+ b.getBillCost());
		user.save(u);
		return repository.save(b);
	}
	
	
}
