package _230929_ClassesPublicPrivate;

public class TestMyPerson {
    public static void main(String[] args) {
        Student person = new Student();
        person.output();

        // person.firstName = "Florian";
        person.input(); // calls methode input from object person
        person.output();

    }
}
