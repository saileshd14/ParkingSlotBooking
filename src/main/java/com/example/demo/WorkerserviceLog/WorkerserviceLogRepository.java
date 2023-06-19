package com.example.demo.WorkerserviceLog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerserviceLogRepository extends JpaRepository<WorkerserviceLog,Integer> {

	List<WorkerserviceLog> findByWorkerID(int workerID);

	

}
