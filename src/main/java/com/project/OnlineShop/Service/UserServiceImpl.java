package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.UserDAO;
import com.project.OnlineShop.DAO.UserDAOImpl;
import com.project.OnlineShop.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserDAO userDAO;
    UserServiceImpl(){}

    @Autowired
    UserServiceImpl(UserDAO userDAO){ this.userDAO=userDAO;}

   // @Override
    public User createUser(User user)
    { return userDAO.create(user);}

    public User readUserDetails(int id){
        return userDAO.findById(id);
    }

    public User findById(int id){
        return userDAO.findById(id);

    }

    public List<User>findAll(){
        List<User>temp=userDAO.findAll();
        return temp;
    }
    public User findByUsername(String username){
        return userDAO.findByUsername(username);

    }
    public void changeUsernameOrPassword(String username){
       //find the account
        User tempUser= userDAO.findByUsername(username);
       //change the username
        userDAO.update(tempUser);

    }
    public int delete(int id){
        userDAO.deleteUser(id);

        return 1;
    }

}
