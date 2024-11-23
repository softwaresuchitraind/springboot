package com.sukla.bindings;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer cid;
	
	@NotNull(message="Name can not be null")
	private String name;
	private Double price;
	
	public Course()
	{
		// TODO Auto-generated constructor stub
	}
	public Course(Integer cid, String name, Double price)
	{
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	public Integer getCid()
	{
		return cid;
	}
	public void setCid(Integer cid)
	{
		this.cid = cid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Double getPrice()
	{
		return price;
	}
	public void setPrice(Double price)
	{
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Course [cid=" + cid + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
