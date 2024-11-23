package com.sukla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukla.client.WelcomeFeignClient;

@RestController
public class GreetController
{
	@Autowired
	private WelcomeFeignClient welcomeFeignClient;
	
	@GetMapping("/greet")
	public String  getGreetMsg()
	{
		String message=welcomeFeignClient.getWelcomeMsg();
		return "Good Morning"+message;
	}
}
