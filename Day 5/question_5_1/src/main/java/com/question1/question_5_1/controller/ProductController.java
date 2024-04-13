package com.question1.question_5_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.question1.question_5_1.model.Product;
import com.question1.question_5_1.service.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
    @Autowired
    public ProductService productService;
    @PostMapping("/api/product")
    public Product postMethodName(@RequestBody Product product) {
        
        return productService.saveProduct(product);
    }

    @PutMapping("/api/product/{productId}")
    public Product putMethodName(@PathVariable("productId") int id, @RequestBody Product product) {
        
        return productService.updateDetails(id,product);
    }
    
    @DeleteMapping("api/product/{productId}")
    public void delete(@PathVariable("productId") int id,@RequestBody Product product)
    {
        productService.deleteProduct(id);
    }
}
