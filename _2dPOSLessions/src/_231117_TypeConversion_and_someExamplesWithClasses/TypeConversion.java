package _231117_TypeConversion_and_someExamplesWithClasses;

public class TypeConversion {
    public static void main(String[] args) {
        // int to string
        int value = 10;
        String strInt = String.valueOf(value);
        System.out.println("string -> int: " + strInt);
        System.out.println("string -> int: " + value);
        System.out.println("Type of strInt : " + strInt.getClass().toString() );

        // double to string
        strInt = String.valueOf(Math.PI);
        System.out.println("PI: " + strInt);

        // string to int
        int fromString = 0;
        fromString = Integer.parseInt("12");
        System.out.println("string -> int: " + fromString);

        // string to float
        float floatFromString = Float.parseFloat("34.7"); // komma muss ein punkt sein
        System.out.println("string -> float: " + floatFromString);

        // Hint: replace the , with an .
        floatFromString = Float.parseFloat("34,8".replace(",", "."));
        System.out.println("string -> float: " + floatFromString);

        // string to double
        double doubleFromString = Double.parseDouble("34.9");
        System.out.println("string -> double: " + (doubleFromString + 10.8) );

        // cast: from double to int
        int castToInt = (int) doubleFromString;
        System.out.println("cast to int " + castToInt);
    }
}
