package _231020_MoreThanOneClass;

/* Your turn: Write a class for a student which has:

 * id
 * firstName
 * lastName

As a developer, I have a working class with all needed
attributes (instance Variables) and all needed operations (methods)

 */

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        //return "(" + id + ")" + " Name: " + firstName + " " + lastName;
        return String.format("(%03d) Name: %s %s", id, firstName, lastName);
    }

    public static void main(String[] args) {
        Student student = new Student(12, "Albert", "Einstein");
        System.out.println(student);
    }
}
