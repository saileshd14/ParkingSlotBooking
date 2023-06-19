package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	public User addMoney(double amount, int id)
	
	{		
		User existingUser =  repository.findById(id).orElse(null);
		existingUser.setWallet(existingUser.getWallet()+amount);
		return repository.save(existingUser);
		
	}
	public User sendRequest(String s, int id)
	
	{		
		User existingUser =  repository.findById(id).orElse(null);
		existingUser.setRequest(existingUser.getRequest()+ '/' + s);
		return repository.save(existingUser);
		
	}
	public User modiflyDetails(User p)
	
	{		
		User existingUser =  repository.findById(p.getId()).orElse(null);
		existingUser.setCarRegNum(p.getCarRegNum());
		existingUser.setCarName(p.getCarName());
		existingUser.setEmail(p.getEmail());
		existingUser.setMobileNum(p.getMobileNum());
		existingUser.setRequest(p.getRequest());
		return repository.save(existingUser);
		
		
	}
}
