package _231222_extends;

public class Hippo extends Animal{
    public Hippo(String name){

        super(name);
    }

    @Override
    public String toString() {
        return "Hippo: " + getName();
    }
}
