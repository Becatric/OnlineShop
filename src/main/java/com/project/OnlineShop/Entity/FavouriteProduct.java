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
    private Product product_id;

    @ManyToOne
    @Column(name = "user_id")
    private User user_id;

    public FavouriteProduct(Product product_id, User user_id) {
        this.product_id = product_id;
        this.user_id = user_id;
    }

    public FavouriteProduct() {

    }

    public int getId() {
        return id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "FavouriteProduct{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", user_id=" + user_id +
                '}';
    }
}
