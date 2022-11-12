package com.geekbrains.hibernate.homework5;

import org.hibernate.Session;

import java.util.List;

public class ProductDaoImp implements ProductDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public ProductDaoImp(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public Product findByID(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.getTransaction().commit();
            return product;
        }
    }

    @Override
    public List<Product> findAll() {
        try(Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            List<Product>products = session.createQuery("select p from Product p").getResultList();
            session.getTransaction().commit();
            return products;
        }
    }

    @Override
    public void deleteById(Long id) {
    try(Session session = sessionFactoryUtils.getSession()){
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.delete(product);
        session.getTransaction().commit();
    }
    }

    @Override
    public void saveOrUpdate(Product product) {
        try(Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.saveOrUpdate(product);
            session.getTransaction().commit();
        }
    }
}
