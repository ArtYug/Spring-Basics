package com.geekbrains.springboothomework.springboot.services;

import com.geekbrains.springboothomework.springboot.entity.Product;
import com.geekbrains.springboothomework.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
