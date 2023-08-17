package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.Product;
import java.util.List;
public interface ProductDAO {

    Product create(Product theProduct);

    Product findById(Integer id);

    List<Product>findAll();

    List<Product>findByName(String name);
    List<Product>findByPrice(Integer price);

    void update(Product theProduct);

    int deleteProduct(Integer id);

    int deleteAll();


}