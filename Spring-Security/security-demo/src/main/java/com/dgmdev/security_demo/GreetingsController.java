package com.dgmdev.security_demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Security";
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userEndPoint() {
		return "Hello User Security";
	}
	@GetMapping("/admin")
	public String adminEndPoint() {
		return "Hello Admin Security";
	}


}
