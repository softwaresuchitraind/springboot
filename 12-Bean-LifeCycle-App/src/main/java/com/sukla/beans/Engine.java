package com.sukla.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine
{
	public Engine()
	{
		System.out.println("Engine.Engine()");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("start the engine");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("stop the engine");
	}

}
