package challenges;

public class SellingDto {
    private SellService sellService;
    private boolean isSelling;
    private User user;

    public SellingDto(SellService sellService, boolean isSelling, User user){
        this.sellService=sellService;
        this.isSelling=isSelling;
        this.user = user;
    }

    public SellService getSellService(){
        return sellService;

    }

    public boolean isSelling(){
        return isSelling;
    }

    public User getUser(){
        return user;
    }
}
