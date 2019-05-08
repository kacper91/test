package challenges;

import java.util.List;

public class SellRequest {
    private User user;
    private List<Product> products;

    public SellRequest(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }
}
