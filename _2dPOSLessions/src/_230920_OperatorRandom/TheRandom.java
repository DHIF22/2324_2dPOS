package _230920_OperatorRandom;

import java.util.Random;

public class TheRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int lowerBound = 2;
        int upperBound = 17;
        int range = upperBound - lowerBound + 1;

        System.out.println(random.nextInt(range) + lowerBound);

        // your turn: please fill an array (default with 5 elements init with -1.0)
        // with some float numbers between 5.2 and 19.3.
        // Please use a loop :-)

        float[] numbers = {-1.0f, -2.0f, -3.0f, -4.0f, -5.0f};
        float lowerLimit = 5.2f;
        float upperLimit = 19.3f;
        float floatRange = upperLimit - lowerLimit;
        for (float number : numbers) {
        //for(int i = 0; i < numbers.length; i++){
            float randomNumber = random.nextFloat(floatRange) + lowerLimit;
            //System.out.println(randomNumber);
            // numbers[i] = randomNumber;
            number = randomNumber;
            System.out.println(number);
        }

        int counter = 0;
        for (float number : numbers) {
            System.out.println(counter + " : " + number);
            counter++;
        }

        // Your turn: Solve the bug!
        // SChint: How to init an array in Java (think_smiley)

        // Your turn:
        // Have a look at https://docs.oracle.com/ - Java API Documentation
        // API: Application Programming Interface

    }
}
