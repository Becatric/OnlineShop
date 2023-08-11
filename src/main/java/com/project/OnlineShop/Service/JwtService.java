package com.project.OnlineShop.Service;

import com.project.OnlineShop.Entity.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String token);

    String generateToken(User userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);
}
