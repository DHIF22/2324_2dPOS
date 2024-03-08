package _240216_ComparableInterface;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    // your turn 7'
    // 1. write a CTOR
    // 2. implement add and remove student methodes

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(Student s){
        students.remove(s);
    }

    public void sortStudentsByLastName(){
        /*
        for(int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            for(int j = i; j < students.size() ; j++){
                Student o = students.get(j);
                int value = s.compareTo(o);
                // make some algo about value
            }
        }
         */
        // some sorting algorithm will be called
        students.sort(Student::compareTo); // Method reference
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("##################\n");
        for(Student s : students){
            sb.append(s);
            sb.append("\n");
        }
        sb.append("##################\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        School school = new School("HTL Kaindorf");
        // born in psvm
        Student student = new Student("Albert", "Einstein");
        school.addStudent(student);
        student = new Student("Nils", "Bohr");
        school.addStudent(student);
        student = new Student("Ernst", "Einstein");
        school.addStudent(student);
        student = new Student("Flies", "Bohr");
        school.addStudent(student);

        System.out.println(school);

        school.sortStudentsByLastName();
        System.out.println(school);
    }
}
