package com.project.OnlineShop.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "cart_products")
public class CartProducts {

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

    @Column(name = "purchased")
    private int purchased;

    public CartProducts(int id, Product product_id, User user_id, int purchased) {
        this.id = id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.purchased = purchased;
    }

    public CartProducts() {

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

    public int getPurchased() {
        return purchased;
    }

    public void setPurchased(int purchased) {
        this.purchased = purchased;
    }

    @Override
    public String toString() {
        return "CartProducts{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", user_id=" + user_id +
                ", purchased=" + purchased +
                '}';
    }
}
