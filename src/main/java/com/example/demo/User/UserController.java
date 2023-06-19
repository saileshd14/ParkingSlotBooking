package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	@PutMapping("/addMoney")
	public String AddAmount(@RequestBody double amount)
	{
		int id=1;
		service.addMoney(amount,id);
		return "ThankYou";
		
	}
	@PutMapping("/ThankYou")
	public String DebitAmount()
	{
		
		return "ThankYou";
	}
	@PutMapping("/UserUpdate")
	public User update(@RequestBody User p)
	{
		return service.modiflyDetails(p);
	}


}
