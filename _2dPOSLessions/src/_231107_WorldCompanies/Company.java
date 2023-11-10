package _231107_WorldCompanies;

public class Company {
    private String name;
    private int counterOfEmployees; // = 0
    private int counterOfDirectors; // = 0

    private Person[] employees = new Person[100];
    private Person[] bordOfDirectors = new Person[5];

    public Company(String name){
        this.name = name;
    }

    public void addEmployee(Person employee){
        employees[counterOfEmployees] = employee;
        counterOfEmployees++;
    }

    public void addDirectors(Person director){
        if(counterOfDirectors < bordOfDirectors.length) {
            bordOfDirectors[counterOfDirectors] = director;
            counterOfDirectors++;
        } else {
            System.out.println("Board of Directors is full (" + director.getFirstName() + ")");
        }

        addEmployee(director);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Name of Company: " + name);
        sb.append("\nDIRECTORS BOARD\n");
        sb.append("---------------\n");
        for(int i = 0; i < counterOfDirectors; i++){
            sb.append(bordOfDirectors[i].toString());
            sb.append("\n");
        }
        sb.append("\nEMPLOYEEs\n");
        sb.append("---------------\n");
        for(int i = 0; i < counterOfEmployees; i++){
            sb.append(employees[i].toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Address address = new Address("Rue la Repuplice", 1, 73365, "Paris");
        Address maistrasse = new Address("Maistrasse", 12, 80634, "Muenchen");

        Person marie = new Person(4009, "Marie", "Curie");
        Person pierre = new Person(4010, "Pierre", "Curie");
        marie.setAddress(address);
        pierre.setAddress(address);

        Person[] einsteins = new Person[4];
        einsteins[0] = new Person(5000, "Albert", "Einstein");
        einsteins[0].setAddress(maistrasse);
        einsteins[1] = new Person(5001, "Peter", "Einstein");
        einsteins[1].setAddress(maistrasse);
        einsteins[2] = new Person(5002, "Maria", "Einstein");
        einsteins[2].setAddress(maistrasse);
        einsteins[3] = new Person(5002, "Ciara", "Einstein");
        einsteins[3].setAddress(maistrasse);

        Company ibsc = new Company("IBSC");
        ibsc.addDirectors(marie);
        ibsc.addDirectors(pierre);

        for(int i = 0; i < einsteins.length; i++) {
            ibsc.addDirectors(einsteins[i]);
        }
        //ibsc.addDirectors(einsteins[0]);
        //ibsc.addDirectors(einsteins[1]);
        //ibsc.addDirectors(einsteins[2]);
        //ibsc.addDirectors(einsteins[3]);

        // Your turn: Each director is also an employee

        // Your turn: Each director and employee earns money.
        // Calculate the monthly outcome of the company for
        // directors and employee.
        System.out.println(ibsc);
    }
}
