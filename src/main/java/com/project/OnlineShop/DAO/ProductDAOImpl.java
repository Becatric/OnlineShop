package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{

    //entity manager
    private EntityManager entityManager;

    @Autowired
    public ProductDAOImpl(EntityManager entityManager){this.entityManager=entityManager;}

    @Override
    @Transactional
    public Product create(Product theProduct){ return entityManager.merge(theProduct);}

    @Override
    public Product findById(Integer id){
        return entityManager.find(Product.class,id);
    }

    @Override
    public List<Product> findAll(){
        TypedQuery<Product> theQuery=entityManager.createQuery("FROM Product ", Product.class);

        return theQuery.getResultList();
    }

    @Override
    public List<Product>findByName(String name){
        TypedQuery<Product> theQuery=entityManager.createQuery("FROM Product WHERE name=:theData", Product.class);
        theQuery.setParameter("theData",name);
        return theQuery.getResultList();
    }
    @Override
    public List<Product>findByPrice(Integer price){
        TypedQuery<Product> theQuery=entityManager.createQuery("FROM Product WHERE price=:theData", Product.class);
        theQuery.setParameter("theData",price);
        return theQuery.getResultList();
    }

    @Transactional
    @Override
    public void update(Product theProduct){entityManager.merge(theProduct);}

    @Transactional
    @Override
    public int deleteProduct(Integer id){
        Product theProduct= entityManager.find(Product.class,id);

        entityManager.remove(theProduct);
        return id;
    }

    @Transactional
    @Override
    public int deleteAll(){
        int rowsDeleted= entityManager.createQuery("DELETE FROM Product ").executeUpdate();
        return rowsDeleted;
    }
}