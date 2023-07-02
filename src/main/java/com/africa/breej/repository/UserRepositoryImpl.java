//package com.africa.breej.repository;
//
//import com.africa.breej.model.user.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public class UserRepositoryImpl implements CustomUserRepository {
//
//    private final MongoUserRepository mongoUserRepository;
//    private final JpaUserRepository jpaUserRepository;
//
//    @Autowired
//    public UserRepositoryImpl(MongoUserRepository mongoUserRepository, JpaUserRepository jpaUserRepository) {
//        this.mongoUserRepository = mongoUserRepository;
//        this.jpaUserRepository = jpaUserRepository;
//    }
//
//    @Override
//    public Optional<User> findByUsername(String username) {
//        // Implement the logic to fetch the user by username from both MongoDB and JPA repositories
//        Optional<User> userFromMongo = mongoUserRepository.findByUsername(username);
//        if (userFromMongo.isPresent()) {
//            return userFromMongo;
//        } else {
//            return jpaUserRepository.findByUsername(username);
//        }
//    }
//}
