package com.example.demo.WorkerLocationLog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerLocationLogRepository extends JpaRepository<WorkerLocationLog,Integer> {

	
	List<WorkerLocationLog> findByLocation(String location);

	

}
