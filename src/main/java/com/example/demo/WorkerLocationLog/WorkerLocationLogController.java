package com.example.demo.WorkerLocationLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerLocationLogController {

	@Autowired
	private WorkerLocationLogService service;

}
