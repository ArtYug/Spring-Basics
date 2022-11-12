package com.geekbrains.hibernate.homework5;

import java.util.List;

public interface ProductDao {
    Product findByID(Long id);
    List<Product>findAll();
    void deleteById(Long id);
    void saveOrUpdate(Product product);
}
