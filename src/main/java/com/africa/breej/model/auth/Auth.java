package com.africa.breej.model.auth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Setter
//@Document(collection = "project_breej_db_auth")
@Entity
@Table(name = "auth")
public class Auth {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid", nullable = false)
    private int uid;

    @Id
    private String id;

    @Email
    private String email;

    private String password;

    private boolean isTutor;
}
