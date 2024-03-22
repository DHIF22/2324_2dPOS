package _240322_PersonCompanyFromFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonFileParser {

    private List<Person> persons = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();
    private final Path file = Paths.get(System.getProperty("user.dir"), "res", "file.log");

    public PersonFileParser() {
        try {
            readFile();

        } catch (IOException e) {
            System.out.println("ERROR - next time");
            System.out.println(e.getMessage());
        }
    }

    public List<Company> getCompanies() {
        return companies;
    }

    private void readFile() throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(file);
        String line = "";
        boolean firstLine = true;
        while( (line = bufferedReader.readLine()) != null){
            if(firstLine){
                firstLine = false;
                continue;
            }
            Person p = new Person(line);
            persons.add(p);

            // find the company name (string) in line
            String strCompany = line.split(",")[Person.Token.COMPANY.ordinal()];
            // create a company
            Company company = new Company(strCompany);
            // look, if the company exists
            if(!companies.contains(company)){ // contains calls Company.equals(...) - OverRide
                // if yes, add to list
                companies.add(company);
            } else {
                int index = companies.indexOf(company);
                company = companies.get(index);
            }
            p.setCompany(company);
            company.addEmplyee(p);

        }
    }

    public static void main(String[] args) {
        PersonFileParser personFileParser = new PersonFileParser();
        List<Company> listOfCompanies = personFileParser.getCompanies();

        for(Company c : listOfCompanies){
            System.out.println(c);
        }
    }
}
