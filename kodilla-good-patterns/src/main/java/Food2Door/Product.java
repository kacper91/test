package Food2Door;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private Producent producent;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, Producent producent) {
        this.name = name;
        this.price = price;
        this.producent = producent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Producent getProducent() {
        return producent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}