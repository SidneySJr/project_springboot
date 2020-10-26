package com.sidneyjr.course.resources;

import java.util.List;

import com.sidneyjr.course.entities.Product;
import com.sidneyjr.course.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService categoryService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product category = categoryService.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
