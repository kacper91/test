package Food2Door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Komputronik implements Producent {

    KomputronikStorage komputronikStorage;

    public Komputronik() {
        Product hardDisk = new Product("Samsung Evo 960", 250.50);
        Product processor = new Product("Intel E8200", 800.80);
        Product monitor = new Product("Iiyama Prolite", 450.38);
        List<Product> availableProducts = Arrays.asList(hardDisk, processor, monitor);

        this.komputronikStorage = new KomputronikStorage(availableProducts);
    }

    @Override
    public void process(Product product) {
        System.out.println("Komputronik - Sprawdzanie  magazynu i realizacja zamowienia");
        komputronikStorage.checkProduct(product);

    }

}
