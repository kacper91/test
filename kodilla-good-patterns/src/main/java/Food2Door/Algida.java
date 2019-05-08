package Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Algida implements Producent {
    AlgidaStorage algidaStorage;


    public Algida() {

        Product icecream = new Product("Swiderek", 2.50);
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(icecream);
        this.algidaStorage = new AlgidaStorage(availableProducts);
    }

    @Override
    public void process(Product product) {

        System.out.println("Algida - Sprawdzanie  magazynu i realizacja zamowienia");
        algidaStorage.checkProduct(product);

    }

}
