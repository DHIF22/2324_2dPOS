package _231215_Cars;

public class Engine {
    private boolean on;
    private String manufacturer;
    private boolean accelerate;
    // RPM display later

    public Engine(String manufacturer){
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "The Engine is from " + manufacturer;
    }

    public static void main(String[] args) {
        Engine e = new Engine("Fiat");
        System.out.println(e);
    }
}
