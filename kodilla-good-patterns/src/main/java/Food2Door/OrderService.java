package Food2Door;

import java.util.List;

public class OrderService {

    public void order(List<Product> products){
        products.forEach(product -> product.getProducent().process(product));
        System.out.println("End of program");
    }

}
