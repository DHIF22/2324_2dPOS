package _240202_interface;

public interface MyInterface {
    /*
    Interface is a type similar to a class and is defined by the keyword `interface`.

    Interfaces are used to define common behavior of implementing classes. If two
    classes implement the same interface, other code which work on the interface
    level, can use object of both classes.

    Like a class an interface defines methods.

    Classes can implement one or several interfaces.

    A class which implement an interface must provide an implementation for all
    abstract methods defined in the interface.

    Interface can have constants, abstract methode and default-methods (tdb)
    which are all public, static or final
     */

    // automatically public, if no other visibility given

    void thisIsATest();
    public String giveMeAString(String message);
}
