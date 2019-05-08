package Food2Door;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Producent algida = new Algida();
        Producent komputronik = new Komputronik();
        Producent toys4us = new Toys4Us();

        Product teddy = new Product("Teddy", 20.50, toys4us);
        Product icecream = new Product("Swiderek", 2.50, algida);
        Product disk = new Product("Hard disk", 200.10, komputronik);

        List<Product> products = Arrays.asList(teddy, icecream, disk);

        OrderService orderService = new OrderService();
        orderService.order(products);

    }

}
