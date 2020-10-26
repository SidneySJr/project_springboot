package com.sidneyjr.course.services;

import java.util.List;
import java.util.Optional;

import com.sidneyjr.course.entities.Product;
import com.sidneyjr.course.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository categoryRepository;

    public List<Product> findAll() {
        return categoryRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
