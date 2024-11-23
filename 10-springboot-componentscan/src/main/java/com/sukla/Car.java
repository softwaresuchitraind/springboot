package com.sukla;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.sukla.security.AppSecurity;

@Component
public class Car {
	Car()
	{
		System.out.println("Car class constructor");
	}
	
}
