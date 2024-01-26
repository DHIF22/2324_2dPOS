package _231222_extends;

public class Wolf extends Animal{
    public Wolf(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Wolf: " + super.toString();
    }
}
