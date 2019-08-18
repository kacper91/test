package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice(String number, List<Item> items){
        this.number=number;
        this.items=items;
    }

    public Invoice(){

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="VOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name="INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "items",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

