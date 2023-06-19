package com.example.demo.Worker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.ParkingSlot.ParkingSlot;

@Controller
public class WorkerController {

	@Autowired
	private WorkerService service;

	@GetMapping("/Admin/workerDisplay")
	public List<WorkerAll>  findAllWorkers()
	{
		return service.getWorker();
	}

	@DeleteMapping("/Admin/workerDelete/{id}")
	public String deleteWorker(@PathVariable int id)
	{
		return service.deleteWorker(id);
	}

	@PutMapping("/Admin/workerUpdate")
	public Worker updateWorker(@RequestBody Worker w)
	{
		return service.updateWorker(w);
	}

	@PostMapping("/Admin/workerAdd")
	public Worker addWorker(@RequestBody Worker w)
	{
		return service.saveWorker(w);
	}
}
