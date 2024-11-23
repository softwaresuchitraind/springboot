package com.sukla.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sukla.security.AppSecurity;

@Configuration
public class AppConfig
{
	public AppConfig()
	{
		System.out.println("AppConfig constructor");
	}
	@Bean
	public AppSecurity createObject()
	{
		AppSecurity as = new AppSecurity();
		return as;
	}
}
