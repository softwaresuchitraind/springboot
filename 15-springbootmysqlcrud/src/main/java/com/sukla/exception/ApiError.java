package com.sukla.exception;

import java.util.Date;

public class ApiError
{
	private Integer errorCode;
	private String errorDesc;
	private Date date;
	
	public ApiError()
	{
		// TODO Auto-generated constructor stub
	}

	public ApiError(Integer errorCode, String errorDesc, Date date)
	{
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}

	public Integer getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(Integer errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorDesc()
	{
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc)
	{
		this.errorDesc = errorDesc;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	@Override
	public String toString()
	{
		return "ApiError [errorCode=" + errorCode + ", errorDesc=" + errorDesc + ", date=" + date + "]";
	}
	
	
	
}
