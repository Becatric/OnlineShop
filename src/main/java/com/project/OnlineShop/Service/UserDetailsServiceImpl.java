package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.UserRepository;
import com.project.OnlineShop.Entity.User;
import com.project.OnlineShop.Entity.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    UserRepository userRepository;

    UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByEmail(username).get(0);
        return new UserDetailsImpl(user);
    }
}