package _231017_static;

public class StaticExample {
    private String name;
    // Class variable
    // All object of class StaticExample will have
    // the same content of variable counter.
    private static int counter = 0;

    public StaticExample(String name){
        this.name = name;
        counter++;
    }

    public void echoCounter(){
        System.out.println(name + " " + counter);
    }

    // class method
    public static boolean isPrim(int value){
        // System.out.println(name); // that doenst work!

        // your turn: please implement
        boolean isPrim = true;
        if(value % 2 == 0){
            isPrim = false;
        } else {
            for (int i = 3; i < value; i += 2) {
                if(value % i == 0){
                    isPrim = false;
                    break;
                }
            }
        }
        return isPrim;
    }

    // fibos are 1, 1, 2, 3, 5, 8, 13, 21, ...
    public static String fibonacciNumbers(int amount){

    }
}
