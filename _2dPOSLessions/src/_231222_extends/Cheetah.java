package _231222_extends;

public class Cheetah extends Animal{

    public Cheetah(String name){

        super(name);
    }

    @Override
    public String toString() {
        return "Cheetah: " + getName();
    }
}
