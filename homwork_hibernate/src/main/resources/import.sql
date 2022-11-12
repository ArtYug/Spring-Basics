DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (id bigserial PRIMARY KEY , name VARCHAR(255),price int);
INSERT INTO products (name,price) VALUES('Milk',12),('Bread',14),('Ball',18);

