package com.sukla.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukla.entity.Account;
import com.sukla.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>
{

}
