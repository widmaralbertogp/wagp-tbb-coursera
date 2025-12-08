package Main.java;
public class Address
{
    String street;
    String city;
    String state;
    String country;
    int zipcode;

    public Address(String street, String city, String state, String country, int zipcode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
    public void getFullAddress()
    {
        System.out.println(street + ", " + city + ", " + state + ", " + country + " - " + zipcode);
    }    

}