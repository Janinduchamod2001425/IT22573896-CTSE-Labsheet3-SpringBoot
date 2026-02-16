package com.sliit.product_service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    // CREATE
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }

    // GET ALL
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        repository.deleteById(id);
    }
}
