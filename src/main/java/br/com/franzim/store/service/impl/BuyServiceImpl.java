package br.com.franzim.store.service.impl;

import br.com.franzim.store.document.dto.BuyDTO;
import br.com.franzim.store.document.dto.InfoProviderDTO;
import br.com.franzim.store.service.BuyService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BuyServiceImpl implements BuyService {
    public static final String URI_FORNECEDOR = "http://localhost:8081/info/";

    @Override
    public void buy(BuyDTO buyDTO) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoProviderDTO> exchange = client.exchange(
                URI_FORNECEDOR + buyDTO.getAddress().getState(),
                HttpMethod.GET,
                null,
                InfoProviderDTO.class
        );
    }
}
