package com.project.OnlineShop.Entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends PublicUser{

    private String password;
    @CreatedDate
    @Column(name = "createdAt")
    private int createdAt;
    @LastModifiedDate
    @Column(name = "updatedAt")
    private int updatedAt;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, Role role) {
        this.id = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = Role.User;
    }

    public PublicUser getPublicUser() {
        return new PublicUser(this.id, this.firstName, this.lastName, this.email, this.role);
    }

}

