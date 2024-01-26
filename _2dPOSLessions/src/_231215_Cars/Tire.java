package _231215_Cars;

public class Tire {
    private int diameter;
    private int crossSection;
    private int width;

    public Tire(int diameter, int crossSection, int width){
        this.diameter = diameter;
        this.crossSection = crossSection;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("(%d/%d/%d)", diameter, crossSection, width);
    }

    public static void main(String[] args) {
        Tire t = new Tire(23, 24, 56);
        System.out.println(t);
    }
}
