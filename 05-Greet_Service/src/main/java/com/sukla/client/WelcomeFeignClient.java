package com.sukla.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="04-Welcome-API")
public interface WelcomeFeignClient
{
	@GetMapping("/welcome")
	public String getWelcomeMsg();
	
}
