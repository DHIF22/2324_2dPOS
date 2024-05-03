package _240419_FunctionalInterface_Lambda._02;

public class _02_Lambdas {

    public static int performOperation(int a, int b, MathematicOperation op){
        return op.calculate(a, b);
    }

    public static void main(String[] args) {
        MathematicOperation sub = (a, b) -> a - b;
        int value = sub.calculate(5, 4);
        System.out.println("Sub: " + value);

        // if curly brackets and the method has a return type
        // you have to use return!
        MathematicOperation add = (a, b) -> {
            return a + b;
        };
        value = add.calculate(5, 4);
        System.out.println("Add: " + value);

        int valueTwo = performOperation(5, 4, add);
        System.out.println("performOperation Answer: " + valueTwo);

        // your turn: if a > b returns 100 else 1000
        int valueThree = performOperation(4, 5, (a, b) -> {
           return (a > b) ? 100 : 1000; 
        });
        System.out.println("anoym func interface: " + valueThree);

    }
}
