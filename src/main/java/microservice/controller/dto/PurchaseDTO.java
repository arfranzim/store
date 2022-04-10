package microservice.controller.dto;

import lombok.Data;
import microservice.model.Address;
import microservice.model.Item;

import java.util.List;

@Data
public class PurchaseDTO {
  private List<Item> items;
  private Address address;
}
