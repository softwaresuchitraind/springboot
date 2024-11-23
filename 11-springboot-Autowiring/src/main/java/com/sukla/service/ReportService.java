package com.sukla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sukla.dao.ReportDao;

@Service
public class ReportService
{
	@Autowired
	private ReportDao reportDao;
	/*
	@Autowired
	//@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao)
	{
		System.out.println("ReportService.setReportDao()");
		this.reportDao=reportDao;
	}*/
	/*
	public ReportService()
	{
		System.out.println("ReportService.ReportService()");
	}
	@Autowired
	public ReportService(ReportDao reportDao)
	{
		System.out.println("ReportService.ReportService()::1param constructor");
		this.reportDao=reportDao;
	}*/
	
	public void generateReport()
	{
		String findData = reportDao.findData();
		System.out.println("Generating Report-------------");
	}
	

}
