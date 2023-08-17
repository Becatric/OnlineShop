package com.project.OnlineShop.Service;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;

import java.util.List;

public interface CartProductService {

    CartProducts createProduct(CartProducts cartProducts);
    CartProducts readProduct(int id);
    CartProducts findById(int id);
    List<CartProducts> findAll();
    int deleteProduct(int id);
    int deleteAll();

}
