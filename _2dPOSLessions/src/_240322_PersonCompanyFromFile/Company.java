package _240322_PersonCompanyFromFile;

import java.util.ArrayList;
import java.util.List;
public class Company {
    private String name;
    private List<Person> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addEmplyee(Person employee){
        employees.add(employee);
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Company other = (Company) obj; // From object to Company-Object
        return name.equals(other.getName());
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
