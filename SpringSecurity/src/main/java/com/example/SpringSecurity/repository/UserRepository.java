package com.example.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSecurity.models.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	public User findByName(String username);

}
