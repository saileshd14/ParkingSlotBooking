package com.example.demo.WorkerserviceLog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.WorkerLocationLog.WorkerLocationLog;

@Service
public class WorkerserviceLogService {

	@Autowired
	private WorkerserviceLogRepository repository;
	public List<WorkerserviceLog> getServiceById(List <WorkerLocationLog> worker)
	{
		List<WorkerserviceLog> wsl= new ArrayList<WorkerserviceLog>();
		for(WorkerLocationLog wtt: worker)
				{
						
						List<WorkerserviceLog> w = repository.findByWorkerID(wtt.getWorkerID());
								 wsl.addAll(w); 
				}
		return wsl;
	}

	public List<WorkerserviceLog> getserlogById(int workerID) {
		List<WorkerserviceLog> ws = repository.findAll();
		for(int i=0;i<ws.size();i++) {
			WorkerserviceLog a = ws.get(i);
			if(a.getWorkerID()==workerID) {
				ws.add(a);
			}
		}
		return ws;
	}

}