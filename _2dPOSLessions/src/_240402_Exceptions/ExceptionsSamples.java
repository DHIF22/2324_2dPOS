package _240402_Exceptions;

import java.util.Scanner;

public class ExceptionsSamples {
    // your turn: What are Exceptions? (find some infos)
    // Some examples

    private Scanner scanner = new Scanner(System.in);

    public void doSomethingStupid(){
        System.out.println("Hello Example");
        int value = 0;
        boolean isRunning = true;

        do {
            System.out.println("Please insert a integer value:");
            String userInput = scanner.next();
            try {
                value = Integer.parseInt(userInput);
            } catch(NumberFormatException ex){
                System.out.println("ERROR: Please insert a Number");
            } catch(Exception ex){
                System.out.println("ERROR");
                System.out.println(ex.getMessage());
                //ex.printStackTrace(); // sout included
            }

        } while(isRunning);

        System.out.println(String.format("Given value is: %3d", value));

    }

    public int readFromScanner() {
        try {
            return Integer.parseInt(scanner.next());
        } catch(NumberFormatException ex){
            System.out.println("ERROR: Catch NumberFormatException");
            throw ex; // throw exception in direction of caller
        }
    }

    public int readFromScannerTheBetterOne() throws NumberFormatException{
        return Integer.parseInt(scanner.next());
    }

    public int readFromScannerThrowOwnException() throws ScException{
        try {
            return Integer.parseInt(scanner.next());
        } catch(NumberFormatException ex){
            System.out.println("ERROR: Catch NumberFormatException");
            throw new ScException("Greeting from SC"); // throw exception in direction of caller
        }
    }

    public static void main(String[] args) {
        int value = 2;
        ExceptionsSamples exceptionsSamples = new ExceptionsSamples();
        if(value == 0) {
            System.out.println("#### 1. Example ####");
            exceptionsSamples.doSomethingStupid();
        } else if(value == 1){
            System.out.println("#### 2. Example ####");
            System.out.println("Please insert a number");
            try {
                int userInput = exceptionsSamples.readFromScanner();
            } catch(NumberFormatException ex){
                System.out.println("ERROR: now is the exception one step above");
            }
        } else if(value == 2){
            System.out.println("#### 3. Example ####");
            System.out.println("Please insert a number");
            try {
                int userInput = exceptionsSamples.readFromScannerTheBetterOne();
                userInput = exceptionsSamples.readFromScannerThrowOwnException();
            } catch (NumberFormatException ex){
                System.out.println("ERROR: 3 example throws");
            } catch (ScException se){
                System.out.println(se.getMessage());
            }
        }
        else {
            System.out.println("ERROR ...");
        }
    }
}
