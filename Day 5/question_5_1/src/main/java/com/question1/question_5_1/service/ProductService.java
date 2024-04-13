package com.question1.question_5_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question1.question_5_1.model.Product;
import com.question1.question_5_1.repository.ProductRepo;



@Service
public class ProductService {
    @Autowired
    public ProductRepo productRepo;

    public Product saveProduct(Product product)
    {
        return productRepo.save(product);
    }
    public Product updateDetails(int id,Product product)
    {
        return productRepo.saveAndFlush(product);
    }
    public void deleteProduct(int id)
    {
        productRepo.deleteById(id);
    }
    public Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
