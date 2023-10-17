package _230920_OperatorRandom;

public class LessonFromToday {
    public static void main(String[] args) {
        /*
        Operators:
        * Arithmetic: +, -, *, /, % - der Noah wieder ... :-)
        * Uniaere: !, ++, --, +, -
        * Assigment: =, +=, -=, *=, /=, %=
        * compare: ==, !=, <, >, <=, >=
        * logical: &&, ||, !

        * terneare operator (3 Operanden)

         */

        // terneare operator (3 Operanden)
        int value = 6;
        boolean result = value > 5 ? true : false;
        // same as Line 19
        if(value > 5){
            result = true;
        } else {
            result = false;
        }

        int a = 5;
        int b = 6;
        int c = 7;
        a = b++ + ++c;
        System.out.println(a);
    }
}
