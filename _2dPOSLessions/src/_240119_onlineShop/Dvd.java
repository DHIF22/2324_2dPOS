package _240119_onlineShop;

public class Dvd extends Article{
    private String name;
    private int countryCode;
    private String duration;

    public static final float VAT = 0.20f;

    public Dvd(int articleNumber, float price, String name, String duration, int countryCode){
        super(articleNumber, price);
        this.name = name;
        this.countryCode = countryCode;
        this.duration = duration;
    }

    public float getPrice(){
        return super.getPrice() * (1 + VAT);
    }

    @Override
    public String toString() {
        return "DVD - " + name;
    }

    public static void main(String[] args) {
        Dvd d = new Dvd(23, 20.0f, "Name of DVD", "12:34:44", 43);
        System.out.println(d);
        System.out.println(d.getPrice());
    }
}
