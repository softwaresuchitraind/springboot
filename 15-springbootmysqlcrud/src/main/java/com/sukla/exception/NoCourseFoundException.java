package com.sukla.exception;

public class NoCourseFoundException extends RuntimeException
{
	public NoCourseFoundException(String msg)
	{
		super(msg);
	}
}
