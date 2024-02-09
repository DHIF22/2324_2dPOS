package _240202_interface;

public class ImplementInterfaceFirst implements MyInterface, MyOtherInterface {
    @Override
    public void thisIsATest() {
        // getClass().getSimpleName() generate the String ImplementInterfaceFirst
        System.out.println(getClass().getSimpleName() + " called thisIsATest");
    }

    @Override
    public String giveMeAString(String message) {
        return getClass().getSimpleName() + " called giveMeAString with " + message;
    }

    @Override
    public void sayMessage(String msg) {
        System.out.println(getClass().getSimpleName() + " " + msg + " from sayMessage");
    }

    @Override
    public void doStrangeThings(int value) {
        System.out.println(String.format("%9d", value));
    }

    @Override
    public int calcValue(int a, int b) {
        return 0;
    }
}
