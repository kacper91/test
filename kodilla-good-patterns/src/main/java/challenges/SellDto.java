package challenges;

public class SellDto {

    private User user;
    private boolean isSold;
    private String orderNumber;


    public SellDto(User user, boolean isSold, String orderNumber) {
        this.user = user;
        this.isSold = isSold;
        this.orderNumber=orderNumber;
    }

    public SellDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }


}
