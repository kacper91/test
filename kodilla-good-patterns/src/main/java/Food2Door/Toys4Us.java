package Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Toys4Us implements  Producent{

Toys4UsStorage toys4UsStorage;

public Toys4Us(){

    Product car = new Product("Car", 22.50);
    List<Product> availableProducts = new ArrayList<>();
    availableProducts.add(car);
    this.toys4UsStorage = new Toys4UsStorage(availableProducts);
}


    @Override
    public void process(Product product) {
        System.out.println("Toys4us - Sprawdzanie stanu magazynu i realizacja zamowienia");
        toys4UsStorage.checkProduct(product);

    }
}
