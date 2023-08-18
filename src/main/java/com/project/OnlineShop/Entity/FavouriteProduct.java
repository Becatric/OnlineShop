package com.project.OnlineShop.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "favorite")
public class FavouriteProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public FavouriteProduct(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public FavouriteProduct() {}

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user= user;
    }

    @Override
    public String toString() {
        return "FavouriteProduct{" +
                "id=" + id +
                ", product_id=" + product+
                ", user_id=" + user +
                '}';
    }
}
