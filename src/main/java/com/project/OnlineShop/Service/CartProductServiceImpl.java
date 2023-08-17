package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.CartProductsDAO;
import com.project.OnlineShop.DAO.FavouriteProductDAO;
import com.project.OnlineShop.Entity.CartProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService{

    CartProductsDAO cartProductsDAO;
    CartProductServiceImpl(){}

    @Autowired
    CartProductServiceImpl(CartProductsDAO cartProductsDAO){
        this.cartProductsDAO=cartProductsDAO;
    }

    public CartProducts createProduct(CartProducts cartProducts){
        return cartProductsDAO.create(cartProducts);
    }

    public CartProducts readProduct(int id){
        return cartProductsDAO.findById(id);
    }
    public CartProducts findById(int id){
        return cartProductsDAO.findById(id);
    }
    public List<CartProducts> findAll(){
        return cartProductsDAO.findAll();
    }
    public int deleteProduct(int id){
        return cartProductsDAO.deleteProduct(id);
    }
    public int deleteAll(){
        cartProductsDAO.deleteAll();

        return 1;
    }
}
