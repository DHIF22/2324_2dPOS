package _231017_static;

public class TestForStaticExample {
    public static void main(String[] args) {
        //StaticExample staticExample1 = new StaticExample("#One");
        //StaticExample staticExample2 = new StaticExample("#Two");

        //for(int i = 0; i < 100; i++){
        //    StaticExample staticExample = new StaticExample("#One");
        //}
        int value = 991;
        boolean isPrim = StaticExample.isPrim(value);
        System.out.println(value + ":" + isPrim);

        //staticExample1.echoCounter();
        //staticExample2.echoCounter();
    }
}
