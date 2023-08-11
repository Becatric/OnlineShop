package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.UserDAO;
import com.project.OnlineShop.DAO.UserRepository;
import com.project.OnlineShop.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    UserDAO userDAO;
    UserServiceImpl(){}

    @Autowired
    void UsersServiceImpl(UserRepository userRepository,UserDAO userDAO) {
        this.userRepository = userRepository;
        this.userDAO=userDAO;
    }
   // @Override
    public User createUser(User user)
    { return userDAO.create(user);}

    public User readUserDetails(int id){
        return userDAO.findById(id);
    }

    public User findById(int id){
        return userRepository.findById(id).get();
    }

    public List<User>findAll(){
        return userRepository.findAll();
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
