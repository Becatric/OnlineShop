package com.project.OnlineShop.Service;

import com.project.OnlineShop.Request.SignInRequest;
import com.project.OnlineShop.Request.SignUpRequest;
import com.project.OnlineShop.Response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
