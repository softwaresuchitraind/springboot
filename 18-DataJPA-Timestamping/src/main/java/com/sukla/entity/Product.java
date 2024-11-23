package com.sukla.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "PRODUCT_MASTER")
@Data
public class Product
{
	@Id
	@Column(name= "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@Column(name="PRODUCT_NAME")
	private String pname;
	
	@Column(name="PRODUCT_PRICE")
	private Double price;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE", updatable = false)
	//private LocalDate createdDate;
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE", insertable = false)
	//private LocalDate updatedDate;
	private LocalDateTime updatedDate;
}