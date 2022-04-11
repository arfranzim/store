package microservice.controller.dto;

import microservice.model.Address;
import microservice.model.Item;

import java.util.List;

public class PurchaseDTO {
  private List<Item> items;
  private Address address;

  public List<Item> getItems() { return items; }
  public void setItems(List<Item> items) { this.items = items; }

  public Address getAddress() { return address; }
  public void setAddress(Address address) { this.address = address; }
}
