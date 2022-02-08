package com.example.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userrepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User();
		user.setEmail("user@gmail.com");
		user.setName("user");
		user.setPassword(this.bCryptPasswordEncoder.encode("user123"));
		user.setRole("ROLE_User");
		
		this.userrepo.save(user);
		
		User user1 = new User();
		user1.setEmail("admin@gmail.com");
		user1.setName("admin");
		user1.setPassword(this.bCryptPasswordEncoder.encode("admin123"));
		user1.setRole("ROLE_Admin");
		
		this.userrepo.save(user1);

	
	}

}
