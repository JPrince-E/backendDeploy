package com.africa.breej.repository;

import com.africa.breej.model.auth.Auth;
import com.africa.breej.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>, CustomUserRepository {
    Optional<User> findByUsername(String username);
}
