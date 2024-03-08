package _240216_ComparableInterface;

// do not import Person from other package!

public class Student extends Person implements Comparable<Student> {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public int compareTo(Student o) {
        int value = 0;
        // value < 0: this (this object) is before o
        // value == 0: this is equals o
        // value > 0: this (this object) is after o

        // sort by lastname
        // value = getLastName().compareTo(o.getLastName());

        // your turn: sort the Student about lastname and firstname
        if( ( value = this.getLastName().compareTo(o.getLastName())) == 0 ){
            value = this.getFirstName().compareTo(o.getFirstName());
        }

        return value;
    }
}
