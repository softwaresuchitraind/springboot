package com.sukla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sukla.entity.Address;
import com.sukla.entity.Employee;
import com.sukla.repo.AddressRepository;
import com.sukla.repo.EmployeeRepository;



@Service
public class EmployeeService
{
	private EmployeeRepository empRepo;
	
	private AddressRepository addrRepo;

	@Autowired
	public EmployeeService(EmployeeRepository empRepo, AddressRepository addrRepo)
	{
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	@Transactional( rollbackFor = Exception.class)
	public void saveData()
	{
		Employee emp = new Employee();
		emp.setEmpId(201);
		emp.setEmpName("suchitra");
		emp.setEmpSal(25000.0);
		empRepo.save(emp);
	
		Address addr = new Address();
		addr.setAddrId(501);
		addr.setEmpId(201);
		int i = 10/0;
		addr.setCity("Bangalore");
		addr.setState("KN");
		addrRepo.save(addr);
	}
	
}
