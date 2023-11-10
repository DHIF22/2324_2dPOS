package _231107_WorldCompanies;

public class Person {
    private int id; // Instancevar default 0
    private String firstName;
    private String lastName;
    private float salary; // default 0.0f

    private Address address; // there is no address object ... NullPointer

    public Person(int id,
                  String firstName,
                  String lastName){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setSalary(float value){
        salary = value;
    }

    public float getSalary(){
        return salary;
    }

    public void setAddress(Address value){
        address = value;
    }
    public Address getAddress(){
        return address;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s %s\n", firstName, lastName));
        sb.append(String.format("Salary: %.2f\n", salary));
        sb.append(address.toString());

        return sb.toString();
    }

    public static void main(String[] args) {
        Address addressBirth = new Address("Residenz", 10, 80637, "Muenchen");

        Person person = new Person(1, "Albert", "Einstein");
        Person wife = new Person(2, "Mileva", "Maric");
        person.setAddress(addressBirth);

        System.out.println(person);

        Address addressDeath = new Address("VillaEinstein", 1, 88754, "Cambridge");

        wife.setAddress(addressDeath);
        person.setAddress(addressDeath);
        System.out.println(person);
        System.out.println(wife);

    }
}