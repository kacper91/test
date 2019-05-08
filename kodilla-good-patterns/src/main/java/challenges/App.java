package challenges;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String... args){
        User user = new User("kacper9999", "kacper", "orlowski", 27);
        List<Product> products = new ArrayList<>();
        products.add(new Product("bear", 20));
        products.add(new Product("kitty", 40));
        products.add(new Product("mouse", 120));

        SellService sellService = new SellService();
        InformationService informationService = new InformationService();
        SellRepository sellRepository = new SellRepository();
        SellProcessor sellProcessor = new SellProcessor(informationService, sellService,sellRepository);

        SellRequest sellRequest = new SellRequest(user, products);

        sellProcessor.process(sellRequest);

    }
}
