package _231222_extends;

public class Tiger extends Animal{

    public Tiger(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Tiger: " + getName();
    }
}
