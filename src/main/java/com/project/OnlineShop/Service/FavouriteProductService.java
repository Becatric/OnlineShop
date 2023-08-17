package com.project.OnlineShop.Service;

import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Entity.Product;

import java.util.List;

public interface FavouriteProductService {

    FavouriteProduct createProduct(FavouriteProduct favouriteProduct);
    FavouriteProduct readProduct(int id);
    FavouriteProduct findById(int id);
    List<FavouriteProduct> findAll();
     int deleteProduct(int id);
     int deleteAll();
}
