//package com.africa.breej.repository;
//
//import com.africa.breej.model.user.User;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository("mongoUserRepository")
//public interface MongoUserRepository extends MongoRepository<User, String>, CustomUserRepository {
//    Optional<User> findByUsername(String username);
//}