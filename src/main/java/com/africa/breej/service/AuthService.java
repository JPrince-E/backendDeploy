package com.africa.breej.service;

import com.africa.breej.model.user.User;
import com.africa.breej.payload.auth.SignUpRequest;
import org.springframework.stereotype.Service;

import java.net.URI;

public interface AuthService {
    URI createUser(SignUpRequest signUpRequest);
}
