package com.sukla.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySQLReportDaoImpl implements ReportDao
{
	public MySQLReportDaoImpl()
	{
		System.out.println("MySQLReportDaoImpl.ReportDaoImpl()");
	}
	
	@Override
	public String findData()
	{
		System.out.println("Fetching ReportMySQL data from Db");
		return "Report Data";
	}
}
