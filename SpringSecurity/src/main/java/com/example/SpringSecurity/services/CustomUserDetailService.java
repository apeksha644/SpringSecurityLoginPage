package com.example.SpringSecurity.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecurity.models.CustomUserDetail;
import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userrepo;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = this.userrepo.findByName(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("No user");
		}
		return new CustomUserDetail(user);
	}

}
