package com.example.demo.WaitList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaitListService {
	@Autowired
	private WaitListRepository repository;
}
