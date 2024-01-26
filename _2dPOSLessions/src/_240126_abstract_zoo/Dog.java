package _240126_abstract_zoo;

public class Dog extends Animal{

    public Dog(String name){
        super(name, "Dog");
    }

    @Override
    public void eat() {
        System.out.println(TYPE + " is eating");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(TYPE + " make some noise");
    }

    @Override
    public void sleep() {
        System.out.println(TYPE + " is sleeping");
    }

}
