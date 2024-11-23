package com.sukla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMP_TBL")
@Data
public class Employee
{
	@Id
	@Column(name= "EMP_ID")
	private Integer empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL")
	private Double empSal;
}
