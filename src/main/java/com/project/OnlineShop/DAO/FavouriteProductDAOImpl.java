package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FavouriteProductDAOImpl implements FavouriteProductDAO{

    private EntityManager entityManager;

    @Autowired
    public FavouriteProductDAOImpl(EntityManager entityManager){this.entityManager=entityManager;}

    @Transactional
    @Override
    public FavouriteProduct create(FavouriteProduct theFavouriteProduct){
        return entityManager.merge(theFavouriteProduct);
    }

    @Override
    public FavouriteProduct findById(Integer id){
        return entityManager.find(FavouriteProduct.class,id);
    }

    @Override
    public List<FavouriteProduct> findAll(){
        TypedQuery<FavouriteProduct> theQuery=entityManager.createQuery("FROM FavouriteProduct ", FavouriteProduct.class);

        return theQuery.getResultList();
    }

    @Transactional
    @Override
    public void update(FavouriteProduct theProduct){
        entityManager.merge(theProduct);
    }

    @Transactional
    @Override
    public int deleteProduct(Integer id){
        FavouriteProduct theProduct= entityManager.find(FavouriteProduct.class,id);

        entityManager.remove(theProduct);
        return id;
    }

    @Transactional
    @Override
    public int deleteAll(){
        int rowsDeleted= entityManager.createQuery("DELETE FROM FavouriteProduct").executeUpdate();
        return rowsDeleted;
    }

}
