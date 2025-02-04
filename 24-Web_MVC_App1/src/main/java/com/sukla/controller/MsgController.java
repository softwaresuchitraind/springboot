package com.sukla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController
{
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","Hi, Welcome to Sukla IT");
		
		mav.setViewName("message");
		
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetmsg()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","Good Morning");
		mav.setViewName("message");
		return mav;
	}
}
