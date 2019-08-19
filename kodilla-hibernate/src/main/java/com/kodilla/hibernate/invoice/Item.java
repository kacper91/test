package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEMS")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;


    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;

    }

    public Item() {
    }

    @ManyToOne
    @JoinColumn(name = "ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    private int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    private BigDecimal getValue() {
        return value;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
}
