package com.sukla.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao
{
	public OracleReportDaoImpl()
	{
		System.out.println("OracleReportDaoImpl.ReportDaoImpl()");
	}
	
	@Override
	public String findData()
	{
		System.out.println("Fetching Report Oracle data from Db");
		return "Report Data";
	}
}
