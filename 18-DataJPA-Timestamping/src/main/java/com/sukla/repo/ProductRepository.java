package com.sukla.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukla.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
