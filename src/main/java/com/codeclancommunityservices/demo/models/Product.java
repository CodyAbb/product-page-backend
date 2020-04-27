package com.codeclancommunityservices.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private int amount;

    @Column(name = "addedToBasket")
    private boolean addedToBasket;

    public Product(String name, String description, int amount) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.addedToBasket = false;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAddedToBasket() {
        return addedToBasket;
    }

    public void setAddedToBasket(boolean addedToBasket) {
        this.addedToBasket = addedToBasket;
    }
}
