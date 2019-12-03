package com.practice.springsecurityjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.springsecurityjpa.entity.User;
import com.practice.springsecurityjpa.repo.UserRepo;

@Service
public class MyUserDetailsSerivce implements UserDetailsService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//return new User("foo", "foo", null);
		//return new MyUserDetails(username);
		//User JPA to get user from db
		Optional<User> user = userRepo.findByUsername(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not found "+username));
		
		return user.map(MyUserDetails::new).get();
	}

}
