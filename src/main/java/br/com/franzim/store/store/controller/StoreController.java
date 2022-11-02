package br.com.franzim.store.store.controller;

import br.com.franzim.store.store.document.dto.BuyDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buy")
public class StoreController {

    @RequestMapping(method = RequestMethod.POST)
    public void buy(@RequestBody BuyDTO buyDTO) { System.out.println(buyDTO); }
}
