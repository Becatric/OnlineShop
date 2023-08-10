package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager){this.entityManager=entityManager;}

    @Transactional
    @Override
    public User create(User theUser){ return entityManager.merge(theUser);}

    @Override
    public List<User> findAll(){
        TypedQuery<User> theQuery=entityManager.createQuery("FROM User ", User.class);

        return theQuery.getResultList();
    }

    @Override
    public User findByUsername(String username){
        TypedQuery<User> theQuery=entityManager.createQuery("FROM User WHERE username=:theData", User.class);

        theQuery.setParameter("theData", username);

        return theQuery.getResultList().get(0);
    }

    @Override
    public User findById(Integer id){return entityManager.find(User.class,id);}

    @Transactional
    @Override
    public void update(User theUser){ entityManager.merge(theUser);}

    @Transactional
    @Override
    public void deleteUser(Integer id){
        User theUser= entityManager.find(User.class,id);
        entityManager.remove(theUser);
    }

    @Transactional
    @Override
    public int deleteAll(){
        int rowsDeleted= entityManager.createQuery("delete FROM User ").executeUpdate();
        return rowsDeleted;
    }
}
