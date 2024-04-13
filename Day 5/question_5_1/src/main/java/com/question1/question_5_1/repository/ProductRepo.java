package com.question1.question_5_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.question1.question_5_1.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
