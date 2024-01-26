package _240126_abstract_zoo;

public abstract class Animal {
    public final String TYPE;
    private String name;
    private float veteranCost;

    public static final float VET_PRICE = 125;

    public Animal(String name, String type){
        TYPE = type;
        this.name = name;
    }

    abstract public void eat();
    abstract public void makeSomeNoise();
    abstract public void sleep();
    abstract public void calcVeteranCosts();

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return TYPE + " the name is " + name + " costs: " + String.format("%.2f", veteranCost);
    }

    public void setVetCost(float veteranCost){
        this.veteranCost = veteranCost;
    }

    public float getVeteranCost() {
        return veteranCost;
    }
}
