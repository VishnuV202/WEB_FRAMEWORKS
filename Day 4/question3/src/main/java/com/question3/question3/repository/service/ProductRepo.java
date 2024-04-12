package com.question3.question3.repository.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question3.question3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
