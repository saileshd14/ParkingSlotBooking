package com.example.demo.ParkingSlot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.NewDate;
import com.example.demo.Booking.Booking;
import com.example.demo.Booking.BookingRepository;

@Service
public class ParkingSlotService {
	@Autowired
	private ParkingSlotRepository repository;
	@Autowired
	private BookingRepository booking;
	
	public List<ParkingSlot> getParkingSlot(String location, String date ,String CheckInTime, String CheckOutTime)
	{
		NewDate obj= new NewDate(date, CheckInTime,CheckOutTime);
		List<ParkingSlot> park= repository.findByLocation(location);
		List<Booking> book;
		List<ParkingSlot> list =new ArrayList<ParkingSlot>();
		for(ParkingSlot p:park)
		{
			book=booking.findByParkingSlotAndStatus(p.getParkingSlot(),"In Transit");
			boolean check=true;
			for(Booking b:book)
			{
				NewDate temp= new NewDate(b.getDate(), b.getCheckInTime(),b.getCheckOutTime());
				check= NewDate.comparison(temp,obj);
				if(!check)
					break;		
					
			}
			if(check)
			list.add(p);
			
		}
		
		return list;
	}
}
