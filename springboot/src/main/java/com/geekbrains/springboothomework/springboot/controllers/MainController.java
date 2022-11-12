package com.geekbrains.springboothomework.springboot.controllers;

import com.geekbrains.springboothomework.springboot.entity.Product;
import com.geekbrains.springboothomework.springboot.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    private final ProductService productService;

    public MainController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> showProductsPage() {
        return productService.findAllProducts();
    }

}
