package _231117_TypeConversion_and_someExamplesWithClasses;

public class Coordinate {
    // your turn: implement the class for a 2-d coordinate.
    private int x;
    private int y;
    private double distance;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
        setDistance();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double getDistance(){
        return distance;
    }

    private void setDistance(){
        distance = Math.sqrt(x*x + y*y);
    }

    @Override // this is not overload
    public String toString(){
        return String.format("(%d/%d)", x, y);
    }

    public static void main(String[] args) {
        Coordinate point = new Coordinate(3, 7);
        System.out.println(point);
    }
}
