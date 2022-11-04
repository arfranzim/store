package br.com.franzim.store.service;

import br.com.franzim.store.document.dto.BuyDTO;
import org.springframework.stereotype.Service;

@Service
public interface BuyService {

    void buy(BuyDTO buyDTO);
}
