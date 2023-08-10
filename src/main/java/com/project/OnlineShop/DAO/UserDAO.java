package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface UserDAO {

    User create(User theUser);

    List<User> findAll();
    User findByUsername(String username);
    User findById(Integer id);

    void update(User theUser);

    void deleteUser(Integer id);

    int deleteAll();
}
