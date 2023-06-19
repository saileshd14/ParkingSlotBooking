package com.example.demo.WorkerLocationLog;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.WorkerserviceLog.WorkerserviceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.NewDate;
import com.example.demo.Booking.Booking;
import com.example.demo.Booking.BookingRepository;

@Service
public class WorkerLocationLogService {

	@Autowired
	private WorkerLocationLogRepository repository;
	@Autowired
	private BookingRepository booking;
	public List<WorkerLocationLog> getWorker(String location, String date, String checkInTime, String checkOutTime)
	{
		NewDate obj= new NewDate(date, checkInTime,checkOutTime);
		List<WorkerLocationLog> work= repository.findByLocation(location);
		List<Booking> book;
		List<WorkerLocationLog> list =new ArrayList<WorkerLocationLog>();
		for(WorkerLocationLog w:work)
		{
			book=booking.findByWorkerIDContainingAndStatus(String.valueOf(w.getWorkerID()),"In Transit");
			boolean check=true;
			for(Booking b:book)
			{
				NewDate temp= new NewDate(b.getDate(), b.getCheckInTime(),b.getCheckOutTime());
				check= NewDate.comparison(temp,obj);
				if(!check)
					break;		
					
			}
			if(check)
			list.add(w);
		}
		return list;
	}

	public List<WorkerLocationLog> getloclogById(int workerID) {
		List<WorkerLocationLog> wl = repository.findAll();
		for(int i=0;i<wl.size();i++) {
			WorkerLocationLog a = wl.get(i);
			if(a.getWorkerID()==workerID) {
				wl.add(a);
			}
		}
		return wl;
	}
}
