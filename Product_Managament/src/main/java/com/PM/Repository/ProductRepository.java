package com.PM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PM.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

	
}

