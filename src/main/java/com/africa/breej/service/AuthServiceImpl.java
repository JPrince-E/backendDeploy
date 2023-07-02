package com.africa.breej.service;

import com.africa.breej.model.user.User;
import com.africa.breej.payload.auth.SignUpRequest;
import com.africa.breej.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Service
public class AuthServiceImpl implements AuthService{
    private final JpaUserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AuthServiceImpl(JpaUserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder =  new BCryptPasswordEncoder();
    }

    public URI createUser(SignUpRequest signUpRequest) {

        User user = new User();
        user.setPhoneNumber(signUpRequest.getPhoneNumber());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setTutor(signUpRequest.isTutor());
        User result= userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/user/me")
                .buildAndExpand(result.getId()).toUri();

        return location;
    }
}
