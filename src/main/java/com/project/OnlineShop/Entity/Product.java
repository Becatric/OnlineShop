package com.project.OnlineShop.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name="inStock")
    private int inStock;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private Filter filter;

    @Column(name = "description")
    private String description;

    @Column(name = "img")
    private String img;

    //contructori
    public Product(){}

    public Product(String name, int price, int inStock, String description, String img) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.description = description;
        this.img = img;
    }

    //getter/setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(String img) {
        this.img = img;
    }

//toString

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}

