package com.question3.question3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question3.question3.model.Product;
import com.question3.question3.repository.service.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Product saveProduct(Product p)
    {
        return repo.save(p);
    }

    public List<Product> showProduct()
    {
        return repo.findAll();
    }

    public Optional<Product> showProductEach(int id)
    {
        return repo.findById(id);
    }
}
