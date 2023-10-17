package _230919_ControlStructures;

public class ControlStructures {
    public static void main(String[] args) {
        // This is a line comment

        /*
            This is a block comment
         */

        // Variables
        // must be speaking for it self (selbstsprechend / selbsterklaerend)
        float gravition = 9.81f;
        System.out.println("#### CONTROLSTRUCTUR Part1  ####");
        int value = 6;
        if(value < 10){
            System.out.println("Its True");
        }

        if(value > 10){
            System.out.println("value is great 10");
        } else {
            System.out.println("value is smaller 10");
        }

        boolean isRunning = false;
        if(isRunning == false){
            System.out.println("Is not running");
        }

        if(!isRunning){ // Negation ->
            System.out.println("Is not running");
        }

        isRunning = !isRunning; // toggle
        if(isRunning){
            System.out.println("Is running");
        }

        int otherValue = 12;
        if(otherValue > 10){
            if(otherValue < 15){
                System.out.println("inbetween 10 ... 15");
            } else {
                System.out.println("bigger than 15");
            }
        }

        if(otherValue < 10){
            System.out.println("smaller 10");
        } else if(otherValue < 20) {
            System.out.println("smaller 20");
        } else if(otherValue < 30){
            System.out.println("smaller 30");
        } else {
            System.out.println("ERROR");
        }

        if(otherValue < 20) { // dont to this
            System.out.println("smaller than 20");
        }

        int switcher = 3;
        switch(switcher){
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            default:
                System.out.println("ERROR - this should never be seen");
                break;
        }

        String name = "LB";
        switch (name){
            case "SC":
                System.out.println("Schreiber");
                break;
            case "GU":
                System.out.println("Guggerbauer");
                break;
            case "GG":
                System.out.println("Grassmugg");
                break;
            default:
                System.out.println("Hoedl");
                break;
        }

        System.out.println("#### CONTROLSTRUCTUR Part2  ####");
        isRunning = true;
        int counter = 0;
        while(isRunning){
            System.out.println("In da looop " + counter);
            counter++;
            if(counter > 1000){
                isRunning = false;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println("For loop i " + i);
        }

        do{
            System.out.println("do something");
        }while(isRunning);


        System.out.println("#### ARRAYs Part1  ####");
        String[] names = {"Anna-Lena", "Julian", "Tobias", "Sandra", "Geoerg", "Heinz"};
        System.out.println("Tell me the second name: " + names[1]);
        for(String singleName : names){
            System.out.println(singleName);
        }
        System.out.println("----------------------");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        // Your turn: Generate an array with 7 int-values. Print them line-by-line
        int[] numbers = {1,3,5,7,8,9,56};
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
