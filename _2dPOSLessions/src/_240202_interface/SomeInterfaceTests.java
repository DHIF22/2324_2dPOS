package _240202_interface;

public class SomeInterfaceTests {
    public static void main(String[] args) {
        MyInterface myInterface = new ImplementInterfaceFirst();
        System.out.println(myInterface.giveMeAString("hello world"));

        myInterface = new ImplementInterfaceTwo();
        System.out.println(myInterface.giveMeAString("hello world"));

        MyOtherInterface otherInterface = new ImplementInterfaceFirst();
        otherInterface.sayMessage("hello world");
    }
}
