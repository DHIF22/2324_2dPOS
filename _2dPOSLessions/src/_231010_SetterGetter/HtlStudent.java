package _231010_SetterGetter;

public class HtlStudent {
    private int pinCode = 1234;
    private String lastName = "Fussi";
    private String firstName = "Sophie";
    private String dateOfBirth = "1.1.1900";

    public HtlStudent(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    // in case of marriage
    public void setLastName(String name){
        this.lastName = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    @Override
    public String toString(){
        return "Htl Student "
                + this.lastName
                + " born on the "
                + this.dateOfBirth;
    }
}
