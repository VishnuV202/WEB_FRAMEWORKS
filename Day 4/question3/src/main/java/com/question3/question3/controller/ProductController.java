package com.question3.question3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question3.question3.model.Product;
import com.question3.question3.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService prod;
    @PostMapping(path="/api/product")
    public Product getProduct(@RequestBody Product product)
    {
        return prod.saveProduct(product);
    }

    @GetMapping("/api/products")
    public List<Product> getProds()
    {
        return prod.showProduct();
    }

    @GetMapping("api/product/{productId}")
    public Optional<Product> getprods(@PathVariable int productId)
    {
        return prod.showProductEach(productId);
    }
}
