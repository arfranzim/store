package microservice.model;

public class Address {
    private String street;
    private String number;
    private String state;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}
