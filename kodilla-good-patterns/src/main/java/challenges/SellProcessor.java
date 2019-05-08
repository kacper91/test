package challenges;

import java.util.UUID;

public class SellProcessor {

    private InformationService informationService;
    private SellService sellService;
    private SellRepository sellRepository;


    public SellProcessor(final InformationService informationService,
                         final SellService sellService,
                         final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

    public SellDto process(final SellRequest sellRequest) {
        boolean isSold = sellService.sell(sellRequest.getUser(), sellRequest.getProducts());

        if(isSold) {
            informationService.inform(sellRequest.getUser());
            sellRepository.createSell(sellRequest.getUser(), sellRequest.getProducts());

            String orderID = UUID.randomUUID().toString();

            return new SellDto(sellRequest.getUser(), true, orderID);
        } else {
            return new SellDto(sellRequest.getUser(), false);
        }
    }
}