package br.com.franzim.store.store.document.dto;

import lombok.Data;

import java.util.List;

@Data
public class BuyDTO {
    private List<ItenDTO> itens;
    private AddressDTO address;
}
