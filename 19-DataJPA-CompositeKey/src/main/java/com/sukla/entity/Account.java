package com.sukla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="BANK_ACCOUNTS")
@Data
public class Account
{
	@Column(name="BRANCH_NAME")
	private String branchname;
	
	@Column(name="MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPK;
	
	
	
}
