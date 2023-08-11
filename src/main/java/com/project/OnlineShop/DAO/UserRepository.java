package com.project.OnlineShop.DAO;

import com.project.OnlineShop.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//for the cors/auth/security
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByEmail(String email);
}
