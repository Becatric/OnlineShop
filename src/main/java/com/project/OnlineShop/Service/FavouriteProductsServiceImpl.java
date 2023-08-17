package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.FavouriteProductDAO;
import com.project.OnlineShop.DAO.ProductDAO;
import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteProductsServiceImpl implements FavouriteProductService{

    FavouriteProductDAO favouriteProductDAO;
    FavouriteProductsServiceImpl(){}

    @Autowired
    FavouriteProductsServiceImpl(FavouriteProductDAO favouriteProductDAO){
        this.favouriteProductDAO=favouriteProductDAO;
    }

    public FavouriteProduct createProduct(FavouriteProduct favouriteProduct){
        return favouriteProductDAO.create(favouriteProduct);
    }

    public FavouriteProduct readProduct(int id)
    {
        return favouriteProductDAO.findById(id);
    }
    public FavouriteProduct findById(int id){
        return favouriteProductDAO.findById(id);
    }
    public List<FavouriteProduct> findAll(){
        return favouriteProductDAO.findAll();
    }
    public int deleteProduct(int id){
        return favouriteProductDAO.deleteProduct(id);
    }
    public int deleteAll(){
        favouriteProductDAO.deleteAll();

        return 1; //pe idee sa vad ca mere
    }
}
