package com.example.demo.WorkerserviceLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerserviceLogController {

	@Autowired
	private WorkerserviceLogService service;

}
