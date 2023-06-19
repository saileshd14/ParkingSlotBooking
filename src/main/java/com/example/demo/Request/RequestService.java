package com.example.demo.Request;

import java.util.List;

import com.example.demo.Worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
	@Autowired
	private RequestRepository repository;
	public Request saveRequest(Request b)
	{
		return repository.save(b);
		
	}
	public List<Request> getRequest(int userID)
	{
		return repository.findByUserID(userID);
		
	}
	
	public String deleteRequest(int BookRefNum)
	{
		repository.deleteById(BookRefNum);
		return "Request Removed :" + BookRefNum;
	}

    public Request approveRequest(int bookRefNum, String stat) {
		Request existingRequest = repository.findById(bookRefNum).orElse(null);
		existingRequest.setStatus(stat);
		return saveRequest(existingRequest);
    }
}

