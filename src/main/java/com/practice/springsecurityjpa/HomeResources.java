package com.practice.springsecurityjpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
	
	@RequestMapping( value= {"/"})
	public String home() {
		return "<H1>Welcome to Home</H1>";
	}
	
	
	@RequestMapping("/user")
	public String user() {
		return "Welcome to User Dash";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome to Admin Dash";
	}
}
