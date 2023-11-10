package _231107_WorldCompanies;

public class Address {

    // instance variables
    private String street;
    private int streetNumber = 0;
    private int cipCode = 0;
    private String city;

    public Address(String street,
                   int streetNumber,
                   int cipCode,
                   String city){
        this.street = street;
        this.streetNumber = streetNumber;
        this.cipCode = cipCode;
        this.city = city;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public int getStreetNumber(){
        return streetNumber;
    }
    public void setStreetNumber(int number){
        streetNumber = number;
    }
    public int getCipCode(){
        return cipCode;
    }
    public void setCipCode(int value){
        cipCode = value;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String valueOfCity){
        this.city = valueOfCity;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(street);
        sb.append(" ");
        sb.append(streetNumber);
        sb.append(" " + cipCode + " " + city);
        return sb.toString();
    }

    public static void main(String[] args) {
        Address htlKaindorf = new Address("Grazerstrasse", 202, 8430, "Leibitz");
        System.out.println(htlKaindorf);

        String streetName = htlKaindorf.getStreet();
        // if(streetName == "Grazerstrasse") // compare reference
        System.out.println("TEST: getStreet");
        if(streetName.equals("Grazerstrasse")){ // compare value
            System.out.println("ok");
        } else {
            System.out.println("failed");
        }

    }
}
