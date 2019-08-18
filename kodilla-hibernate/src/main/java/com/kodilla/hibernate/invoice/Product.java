package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private Item item;

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "item",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    public Product(String name) {
        this.name = name;
    }

    public Product() {

    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "NAME")
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
