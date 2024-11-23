package com.sukla.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sukla.entity.Account;
import com.sukla.entity.AccountPK;
import com.sukla.repo.AccountRepository;

@Service
public class AccountService
{
	private AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository)
	{
		this.accountRepository = accountRepository;
	}
	
	public void getDataUsingPK()
	{
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("CURRENT");
		pk.setHoldername("IBM");
		
		Optional<Account> findById = accountRepository.findById(pk);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		
	}
	
	public void saveAccData()
	{
		AccountPK pk = new AccountPK();
		pk.setAccId(104);
		pk.setAccType("SAVING");
		pk.setHoldername("TCS");
		
		Account acc = new Account();
		acc.setBranchname("Bangalore");
		acc.setMinBal(5000.0);
		
		acc.setAccPK(pk);
		accountRepository.save(acc);
	}
	
}
