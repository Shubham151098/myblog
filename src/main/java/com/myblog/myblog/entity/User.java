package com.myblog.myblog.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name="usernamename", unique = true)
    private String username;
    @Column(name="email", unique = true)
    private String email;
    private String password;
}

//import lombok.Data;
//
//import javax.persistence.*;
//
//@Data
//@Entity
//@Table(name="users")
//public class User{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    private String name;
//    @Column(name="username", unique = true)
//    private String username;
//    @Column(name = "email", unique = true)
//    private String email;
//    private String password;
//
//}

