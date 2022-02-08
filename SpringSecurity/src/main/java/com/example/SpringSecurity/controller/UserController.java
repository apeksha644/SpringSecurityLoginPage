package com.example.SpringSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	// all users
	@GetMapping("/")
	public List<User> getAllUser(){
		
		return this.userservice.getAllUser();
	}
	
	// particular users
	@GetMapping("/{name}")
	public User getParticularUser(@PathVariable("name") String  name){
		return this.userservice.getParticularUser(name);
	}
	
	//add user 
	@PostMapping("/")
	public User add(@RequestBody User user)
	{
		return this.userservice.addUser(user);
		
	}
	
	
	
	

}
