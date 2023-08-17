package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Entity.Product;

import java.util.List;

public interface FavouriteProductDAO {

    FavouriteProduct create(FavouriteProduct theFavouriteProduct);
    FavouriteProduct findById(Integer id);

    List<FavouriteProduct> findAll();

    void update(FavouriteProduct theProduct);

    int deleteProduct(Integer id);

    int deleteAll();

}
