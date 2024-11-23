package com.sukla.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukla.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
