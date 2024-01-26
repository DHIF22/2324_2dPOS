package _231222_extends;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return "My name is " + name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}
