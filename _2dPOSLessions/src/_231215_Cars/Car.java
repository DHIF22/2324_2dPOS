package _231215_Cars;

public class Car {
    private Radio radio = null;
    private String brand;
    private Engine engine = null;
    private int currentTiresAmount = 0;
    private Tire[] tires = new Tire[4];

    public Car(String brand){
        this.brand = brand;
    }

    public void setRadio(Radio r){
        radio = r;
    }
    public void setEngine(Engine e){engine = e;}

    public void addTire(Tire t){
        tires[currentTiresAmount] = t;
        currentTiresAmount++;
    }

    @Override
    public String toString() {
        return "Car : " + brand + "\nRadio: " + radio + "\n" + engine;
    }

    public static void main(String[] args) {
        Engine theStrongestEngineOnFlatEarth = new Engine("Ferrari");
        Radio theCoolestRadioEver = new Radio();
        Car car = new Car("Audo");
        car.setRadio(theCoolestRadioEver);
        car.setEngine(theStrongestEngineOnFlatEarth);
        System.out.println(car);
    }
}
