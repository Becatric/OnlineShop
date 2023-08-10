package com.project.OnlineShop.Service;

import com.project.OnlineShop.Entity.User;

import java.util.List;

public interface UserService {

    User createUser(User theUser);
    User readUserDetails(int id);
    User findById(int id);
    List<User>findAll();
    User findByUsername(String username);
    void changeUsernameOrPassword(String username);
    int delete(int id);


}
