package com.example.SpringSecurity.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	String name;
	String password;
	String email;
	String role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String name, String password, String email, String role) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", role=" + role + "]";
	}

}
