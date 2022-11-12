package com.geekbrains.homework2_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductServlet", urlPatterns = "/cost")
public class ProductServlet  extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: ProductServlet");
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "BMW", 52400));
        list.add(new Product(2, "Toyota", 66000));
        list.add(new Product(3, "Audi", 44000));
        list.add(new Product(4, "BM", 52400));
        list.add(new Product(5, "Toy", 66000));
        list.add(new Product(6, "Au", 44000));
        list.add(new Product(7, "B", 52400));
        list.add(new Product(8, "Tota", 66000));
        list.add(new Product(9, "Adi", 44000));
        list.add(new Product(10, "udi", 44000));

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");

        for (Product product : list) {
            resp.getWriter().printf("<h1>product" + product.getId() + " " + product.getTitle() + " " + product.getCost() + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
