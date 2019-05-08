package Food2Door;

import java.util.List;

public class Toys4UsStorage {

    List<Product> availableProducts;

    public Toys4UsStorage(List<Product> availableProducts) {

        this.availableProducts = availableProducts;

    }

    public void checkProduct(Product product){

        System.out.println("Checking in Toys4Us Storage..");
        long higherThen10 = availableProducts.stream()
                .filter(p->p.getPrice()>10).count();

        if(higherThen10>5) {
            System.out.println("Stock is full");
        }
        else {
            System.out.println("Need to stock");


        }



    }

}
