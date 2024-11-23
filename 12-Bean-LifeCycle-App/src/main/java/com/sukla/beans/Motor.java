package com.sukla.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean,DisposableBean
{
	public Motor()
	{
		
		System.out.println("Motor.Motor()");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Motor.afterPropertiesSet()");
		
	}
	
	@Override
	public void destroy() throws Exception
	{
		System.out.println("Motor.destroy()");
		
	}
}
