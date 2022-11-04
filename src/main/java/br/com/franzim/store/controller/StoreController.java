package br.com.franzim.store.controller;

import br.com.franzim.store.document.dto.BuyDTO;
import br.com.franzim.store.service.BuyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buy")
public class StoreController {

    private final BuyService buyService;

    public StoreController(BuyService buyService) {
        this.buyService = buyService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void buy(@RequestBody BuyDTO buyDTO) {
        buyService.buy(buyDTO);
    }
}
