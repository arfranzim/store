package br.com.franzim.store.document.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String street;
    private Integer number;
    private String state;
}
