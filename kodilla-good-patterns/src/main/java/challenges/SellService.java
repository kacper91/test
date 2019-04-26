package challenges;

import java.time.LocalDate;

public class SellService {

    private int orderNumber;
    private LocalDate orderDate;
    private boolean payment;
    private String item;

    public SellService(int orderNumber, LocalDate orderDate, boolean payment, String item){
        this.orderNumber=orderNumber;
        this.orderDate=orderDate;
        this.payment=payment;
        this.item=item;

    }

}
