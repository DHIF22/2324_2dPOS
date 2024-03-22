package _240322_PersonCompanyFromFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

// id,first_name,last_name,email,gender,company,ip_address,last_log_in
public class Person {

    public enum Token{
        ID,
        FIRST_NAME,
        LAST_NAME,
        MAIL,
        GENDER,
        COMPANY,
        IP_ADDRESS,
        LAST_LOG_IN
    }

    public enum Gender{
        MALE,
        FEMALE,
        DIVERSE
    }

    private Long id;
    private String firstName;
    private String lastName;
    private String mailAddress;
    private Gender gender = Gender.DIVERSE;
    private Company company;
    private int[] ipAddress = new int[4];
    private LocalDate lastLogin;

    public Person(String line){
        String[] tokens = line.split(",");
        try {
            this.id = Long.parseLong(tokens[Token.ID.ordinal()]); // String -> Long
        } catch(NumberFormatException ex){
            System.out.println("No Number convertion possible " + tokens[Token.ID.ordinal()] );
            this.id = 0L;
        }
        this.firstName = tokens[Token.FIRST_NAME.ordinal()];
        this.lastName = tokens[Token.LAST_NAME.ordinal()];
        this.mailAddress = tokens[Token.MAIL.ordinal()];

        String gender = tokens[Token.GENDER.ordinal()];
        switch(gender.toLowerCase()){
            case "female":
                this.gender = Gender.FEMALE;
                break;

            case "male":
                this.gender = Gender.MALE;
                break;

            default:
                this.gender = Gender.DIVERSE;
                break;
        }

        stringToIp(tokens[Token.IP_ADDRESS.ordinal()]);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        this.lastLogin = LocalDate.parse(tokens[Token.LAST_LOG_IN.ordinal()], dateTimeFormatter);

    }

    private void stringToIp(String ipAddress){
        String[] tokens = ipAddress.split("\\."); // RegEx !
        int counter = 0;
        for(String t : tokens){
            this.ipAddress[counter] = Integer.parseInt(t);
            counter++;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", gender=" + gender +
                //", company='" + company + '\'' +
                ", ipAddress=" + Arrays.toString(ipAddress) +
                ", lastLogin=" + lastLogin +
                '}';
    }

    public static void main(String[] args) {
        String line = "1,Rayna,Worrill,rworrill0@over-blog.com,Male,Skimia,215.229.63.36,2020/07/20";
        Person p = new Person(line);
        System.out.println(p);
    }
}
