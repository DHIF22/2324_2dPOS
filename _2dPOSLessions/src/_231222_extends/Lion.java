package _231222_extends;

public class Lion extends Animal{

    public Lion(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Lion: " + getName();
    }
}
