package com.project.OnlineShop.Service;

import com.project.OnlineShop.Entity.Product;

import java.util.List;

public interface ProductService {

     Product createProduct(Product product);
    Product readProduct(int id);
    List<Product> findAll();
    List<Product> findByName(String Name);
    List<Product> findByPrice(int price);
    public void updateProduct(int id);
    public int deleteProduct(int id);
    public int deleteAll();

}
