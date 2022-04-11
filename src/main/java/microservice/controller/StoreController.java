package microservice.controller;

import microservice.controller.dto.PurchaseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
public class StoreController {

    @PostMapping
    public void makePurchase(@RequestBody PurchaseDTO purchaseDTO) {
        System.out.println(purchaseDTO.getAddress());
    }
}