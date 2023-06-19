package com.example.demo.WaitList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaitListController {

	@Autowired
	private WaitListService service;
}
