package com.africa.breej.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CustomUserRepositoryImpl implements CustomUserRepository{
    private MongoTemplate mongoTemplate;

    public static final String PROJECT_BREEJ_DB_USER = "project_breej_db_user";

    public CustomUserRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}
