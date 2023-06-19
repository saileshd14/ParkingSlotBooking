package com.example.demo.Dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDashboard {

	
	@GetMapping("/UserDashboard")
	public String homepage()
	{
		
		return "UserDashboard";
		
	}
	
}

