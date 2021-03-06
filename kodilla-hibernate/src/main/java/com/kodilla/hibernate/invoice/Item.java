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

    @NotNull
    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }


    @NotNull
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }


    @NotNull
    @Column(name = "QUANTITY")
    private int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    private BigDecimal getValue() {
        return value;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setId(int id) {
        this.id = id;
    }

}
