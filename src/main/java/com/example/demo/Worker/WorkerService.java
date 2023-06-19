package com.example.demo.Worker;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.WorkerLocationLog.WorkerLocationLogService;
import com.example.demo.WorkerserviceLog.WorkerserviceLog;
import com.example.demo.WorkerserviceLog.WorkerserviceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.WorkerLocationLog.WorkerLocationLog;



@Service
public class WorkerService {

	@Autowired
	WorkerLocationLogService wlls;

	@Autowired
	WorkerserviceLogService wsls;

	@Autowired
	private WorkerRepository repository;

	public List<Worker> getServiceById(List <WorkerLocationLog> worker)
	{
		List<Worker> wsl= new ArrayList<Worker>();
		for(WorkerLocationLog wtt: worker)
				{
						
						Worker w= repository.findById(wtt.getWorkerID()).orElse(null);
								 wsl.add(w); 
				}
		return wsl;
	}

	public List<WorkerAll> getWorker()
	{
		List<Worker> w = repository.findAll();
		List<WorkerAll> wa = new ArrayList<>();
		int i=0;
		for(i=0;i<w.size();i++) {
			Worker a = w.get(i);
			List<WorkerserviceLog> b = wsls.getserlogById(a.getID());
			List<WorkerLocationLog> c = wlls.getloclogById(a.getID());
			WorkerAll d = new WorkerAll();
			d.worker = a;
			d.wll_log = c;
			d.wsl_list = b;
			wa.add(d);
		}

		return wa;

	}

	public String deleteWorker(int id)
	{

		repository.deleteById(id);

		return "Worker removed successfully";
	}

	public Worker updateWorker(Worker w)
	{
		Worker existingWorker = repository.findById(w.getID()).orElse(null);
		existingWorker.setFirstName(w.getFirstName());
		existingWorker.setLastName(w.getLastName());
		existingWorker.setEmail(w.getEmail());
		existingWorker.setCummHrs(w.getID());
		existingWorker.setID(w.getID());
		existingWorker.setCummHrs(w.getCummHrs());
		existingWorker.setRating(w.getRating());
		return repository.save(existingWorker);
	}

	public Worker saveWorker(Worker w) {
		return repository.save(w);
	}

	//	@PostMapping("/addProduct")
//	public Product addProduct(@RequestBody Product p)
//	{
//		return service.saveProduct(p);
//	}
}
