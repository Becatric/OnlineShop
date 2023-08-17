package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;

import java.util.List;

public interface CartProductsDAO {

    CartProducts create(CartProducts theCartProducts);
    CartProducts findById(Integer id);

    List<CartProducts> findAll();

    void update(CartProducts theProduct);

    int deleteProduct(Integer id);

    int deleteAll();
}
