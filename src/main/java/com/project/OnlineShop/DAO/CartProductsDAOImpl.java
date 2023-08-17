package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartProductsDAOImpl implements CartProductsDAO{
    private EntityManager entityManager;

    @Autowired
    public CartProductsDAOImpl(EntityManager entityManager){this.entityManager=entityManager;}


    @Transactional
    @Override
    public CartProducts create(CartProducts theCartProducts){
        return entityManager.merge(theCartProducts);
    }


    @Override
    public CartProducts findById(Integer id){
        return entityManager.find(CartProducts.class,id);
    }

    @Override
    public List<CartProducts> findAll(){
        TypedQuery<CartProducts> theQuery=entityManager.createQuery("FROM CartProducts ", CartProducts.class);

        return theQuery.getResultList();
    }

    @Transactional
    @Override
    public void update(CartProducts theProduct){
        entityManager.merge(theProduct);
    }

    @Transactional
    @Override
    public int deleteProduct(Integer id){
        CartProducts theProduct= entityManager.find(CartProducts.class,id);

        entityManager.remove(theProduct);
        return id;
    }

    @Transactional
    @Override
    public int deleteAll(){
        int rowsDeleted= entityManager.createQuery("DELETE FROM CartProducts").executeUpdate();
        return rowsDeleted;
    }

}
