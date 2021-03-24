
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.Setter;

public class Address {

    //@Getter @Setter
    private String street;
    private int number;
    private int zipcode;
    private String city;

    public Address(String street, int number, int zipcode, String city) {
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                '}';
    }
}
