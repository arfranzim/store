package microservice.controller;

import microservice.controller.dto.PurchaseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/store")
public class StoreConroller {

    @PostMapping("/make-purchase")
    public PurchaseDTO makePurchase(PurchaseDTO purchaseDTO) {
        return purchaseDTO;
    }
}
