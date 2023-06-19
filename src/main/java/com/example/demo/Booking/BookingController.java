package com.example.demo.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Request.Request;



@RestController
public class BookingController {
	
	@Autowired
	private BookingService service;
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking p)
	{
		return service.saveBooking(p);
	}
	@GetMapping("/viewBookings/{id}")
	public List<Booking>  viewAllBookings(@PathVariable int id)
	{
		return service.getBooking(id);
	}
	@PutMapping("/modiflyBooking")
	public Booking updateBooking(@RequestBody Request p)
	{
		return service.modiflyBooking(p);
	}
	@PutMapping("/cancelBooking/{BookRefNum}")
	public Booking updateBooking(@RequestBody int BookRefNum)
	{
		return service.cancelBooking(BookRefNum);
	}
	
}
