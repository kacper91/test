package Food2Door;

import java.util.List;

public class KomputronikStorage {
    List<Product> availableProducts;

    public KomputronikStorage(List<Product> availableProducts) {
        this.availableProducts = availableProducts;

    }

    public void checkProduct(Product product) {
        System.out.println("Wait for a second..");
        System.out.println("Count items on stock: " + availableProducts.size());
        availableProducts.stream()
            .map(p-> p.getName().toUpperCase())
          .forEach(System.out::println);


    }

}
