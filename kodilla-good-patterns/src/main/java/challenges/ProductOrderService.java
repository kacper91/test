package challenges;


public class ProductOrderService {
    private SellService sellService;
    private User user;


    public ProductOrderService(SellService sellService,User user){
        this.sellService=sellService;
        this.user = user;

    }




}
