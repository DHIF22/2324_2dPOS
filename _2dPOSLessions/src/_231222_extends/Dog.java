package _231222_extends;

public class Dog extends Animal{

    public Dog(String name){

        super(name);
    }

    @Override
    public String toString() {
        return "Dog: " + getName();
    }
}
