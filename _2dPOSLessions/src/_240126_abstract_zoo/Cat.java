package _240126_abstract_zoo;

public class Cat extends Animal{

    public Cat(String name){
        super(name, "Cat"); // first thing to do is to call the CTOR of base class
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
