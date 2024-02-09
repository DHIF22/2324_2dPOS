package _240202_interface;

// your turn: implement the interface ...

public class ImplementInterfaceTwo implements MyInterface{
    @Override
    public void thisIsATest() {
        System.out.println("Hello from 2");
    }

    @Override
    public String giveMeAString(String message) {
        return getClass().getSimpleName() + "Message: " + message;
    }
}
