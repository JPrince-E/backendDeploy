package com.africa.breej.model.user;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
//@Document(collection = "project_breej_db_user")
@Entity
@Table(name = "user")
public class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid", nullable = false)
    private int uid;

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String username;

    @Email
    private String email;

    private Boolean emailVerified = false;

    private String password;

    private boolean isTutor;

//    @NotNull
//    private AuthProvider provider;
//
//    @NotNull
//    private Role role;
//
//    @NotNull
//    private Gender gender;

    private String providerId;

    private String courseOfStudy;

    private String department;

    private String faculty;

    private String nameOfSchool;

    private String yearOfEntry;

    private String level;

    private String cgpa;

    private String phoneNumber;

    private boolean deleted=false;

    LocalDateTime timeCreated;

    LocalDateTime timeUpdated;

    LocalDateTime lastLogin;

}
