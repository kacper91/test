package Food2Door;

import java.util.List;

public class AlgidaStorage {
    List<Product> availableProducts;

    public AlgidaStorage(List<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public void checkProduct(Product product) {
        System.out.println("Checking product in storage.. ");

        boolean inStorage = availableProducts.stream()
                .filter(p -> p.equals(product)).count() > 0;

        if (inStorage) {
            System.out.println("Product is available");

        } else {
            System.out.println("Product is unavailable");

        }

    }
}
