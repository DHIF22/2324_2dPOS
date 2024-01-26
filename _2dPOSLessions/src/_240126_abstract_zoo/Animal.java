package _240126_abstract_zoo;

public abstract class Animal {
    private String name;
    public final String TYPE;

    public Animal(String name, String type){
        TYPE = type;
        this.name = name;
    }

    abstract public void eat();
    abstract public void makeSomeNoise();
    abstract public void sleep();

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return TYPE + " the name is " + name;
    }
}
