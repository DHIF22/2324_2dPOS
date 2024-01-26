package _240126_abstract_zoo;

public class Dog extends Animal{

    private float veteranFactor = .8f;

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

    @Override
    public void calcVeteranCosts() {
        float cost = VET_PRICE * veteranFactor;
        setVetCost(cost);
    }
}
