package com.geekbrains.springboothomework.springboot.repository;

import com.geekbrains.springboothomework.springboot.entity.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productList;


    @PostConstruct
    public void init() {
        productList = new ArrayList<>(List.of(
                new Product(1L, "Bread", 12L),
                new Product(2L, "Milk", 5L),
                new Product(3L, "Apples", 13L),
                new Product(4L, "Ball", 25L),
                new Product(5L, "Eggplant", 7L)
        ));
    }

    public List<Product> findAllProducts() {
        return Collections.unmodifiableList(productList);
    }

    public Product findById(Long id) {
    return productList.stream().filter(s->s.equals(id))
                .findFirst().orElseThrow(()->new RuntimeException("Product not found"));
    }
}
