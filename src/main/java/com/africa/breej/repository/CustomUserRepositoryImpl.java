//package com.africa.breej.repository;
//
//import com.africa.breej.model.user.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//@Slf4j
//public class CustomUserRepositoryImpl implements CustomUserRepository{
//    private MongoTemplate mongoTemplate;
//
//    public static final String PROJECT_BREEJ_DB_USER = "project_breej_db_user";
//
//    public CustomUserRepositoryImpl(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//    }
//
//    @Override
//    public Optional<User> findByUsername(String username) {
//        return Optional.empty();
//    }
//}
