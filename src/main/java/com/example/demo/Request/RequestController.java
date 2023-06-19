package com.example.demo.Request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
	@Autowired
	private RequestService service;
	@PostMapping("/addRequest")
	public Request addRequest(@RequestBody Request p)
	{
		return service.saveRequest(p);
	}
	@GetMapping("/viewRequests/{id}")
	public List<Request>  viewAllRequests(@PathVariable int id)
	{
		return service.getRequest(id);
	}
	@DeleteMapping("/deleteRequest/{id}")
	public String delRequest(@PathVariable int id)
	{
		return service.deleteRequest(id);
	}
	@PutMapping("/Admin/approveRequest/{id}")
	public Request appRequest(@PathVariable int id, @RequestParam String stat) { return service.approveRequest(id,stat);}

}
