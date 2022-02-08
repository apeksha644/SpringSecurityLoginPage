package com.example.SpringSecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringSecurity.models.User;

@Service
public class UserService {
	
	List<User> list = new ArrayList<User>();
	
	public UserService()
	{
	
//		list.add(new User("abc","abc123","abc@gmail.com"));
//		list.add(new User("pqr","pqr123","pqr@gmail.com"));
	}
	

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.list;
	}

	public User getParticularUser(String name) {
		// TODO Auto-generated method stub
		return this.list.stream().filter((user)->user.getName().equals(name)).findAny().get();
		
	}

	public User addUser(User user) 
	{
		 this.list.add(user);
		 return user;
		
	}

}
