package com.sukla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{

	@RequestMapping("/welcome1")
	public String display1()
	{
		return "Welcome in First SB Application";
	}
}
