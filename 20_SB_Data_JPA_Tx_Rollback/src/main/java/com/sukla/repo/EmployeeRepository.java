package com.sukla.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sukla.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>
{

}
