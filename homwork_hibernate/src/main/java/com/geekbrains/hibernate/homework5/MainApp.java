package com.geekbrains.hibernate.homework5;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

                                                              /*homework number 5
        1. Создайте сущность Product (Long id, String title, int price) и таблицу в базе данных для хранения объектов этой сущности;
        2. Создайте класс ProductDao и реализуйте в нем логику выполнения CRUD-операций над сущностью Product (Product findById(Long id), List<Product> findAll(), void deleteById(Long id), Product saveOrUpdate(Product product));
        3. * Вшить ProductDao в веб-проект, и показывать товары, лежащие в базе данных. Помните что в таком случае SessionFactory или обертку над ней надо будет делать в виде Spring бина.
        Дополнительные материалы
        https://hibernate.org/orm/documentation/5.4/
        GEEKCHANGE: "Java. Изучаем Hibernate ORM для работы с базами данных" https://www.youtube.com/watch?v=emg94BI2Jao (Введение в Hibernate)*/
public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
/*
            ProductDao productDao = new ProductDaoImp(sessionFactoryUtils);
            //findById
            Product product = productDao.findByID(1L);
            System.out.println(product);
            //find all products
            System.out.println(productDao.findAll());
            //delete product by id
            productDao.deleteById(1L);
            System.out.println(productDao.findAll());
            System.out.println(productDao.findAll());
            Product product = new Product("Ball", 12);
            //save or update product
            productDao.saveOrUpdate(product);
            System.out.println(productDao.findAll());
*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
