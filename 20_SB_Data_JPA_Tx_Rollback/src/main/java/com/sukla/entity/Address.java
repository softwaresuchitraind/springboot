package com.sukla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMP_ADDR_TBL")
@Data
public class Address
{
	@Id
	@Column(name = "ADDR_ID")
	private Integer addrId;
	
	private String city;
	private String state;
	private String country;
	
	@Column(name="EMP_ID")
	private Integer empId;
	
}
