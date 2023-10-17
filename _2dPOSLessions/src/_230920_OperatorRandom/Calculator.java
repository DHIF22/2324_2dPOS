package _230920_OperatorRandom;

import java.util.Scanner;

public class Calculator {

    // input
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a value (int):");
        int inputFromUser = scanner.nextInt();
        System.out.println("DEBUG> " + inputFromUser);
    }

    // calcualtion

    // output
    public void output(){
        System.out.println("Output ...");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input();
        calculator.output();

    }
}
