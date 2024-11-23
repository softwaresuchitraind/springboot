package com.sukla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
	@RequestMapping("/")
	public String display()
	{
		return "Default message in First SB Application";
	}
	
	@RequestMapping("/welcome")
	public String display1()
	{
		return "message in First SB Application";
	}
}
