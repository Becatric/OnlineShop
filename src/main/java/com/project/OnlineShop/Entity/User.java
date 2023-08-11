package com.project.OnlineShop.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

   @Column(name = "username")
   private String username;

   @Column(name = "password")
   private String password;

   @Enumerated(EnumType.STRING)
   @Column(name = "role")
   private Role role;

   public User(){};
    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser(){
        return new User(this.username,this.password, this.role);
    }
}

