package _230929_ClassesPublicPrivate;

import java.util.Scanner;

public class Student {
    // Your turn: Write a class with two instancevariables called firstName, surName.
    // Both variables should have the default value "unknown".
    // The class should have two operations, input and output.

    private int id; // will be init by java itself
    private String firstName = "unknown"; //
    private String surName;

    // Constructor CTOR
    public Student(){ // this is the default java ctor
        // this will be called by new Person();
        System.out.println("Hello, this is the Person CTOR");

        // bereitet das Object auf die Arbeit vor.
        // Hier: set instancevaraibles to a default value
        firstName = "james";
        surName = "Thom";
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your firstname:");
        firstName = scanner.next(); // nimmt die komplette Eingabe
        System.out.println("Please insert your surname:");
        surName = scanner.next();
    }

    public void output(){
        System.out.println("Your name is: " + firstName + " "
                + surName + "(" + id + ")");
    }
}
