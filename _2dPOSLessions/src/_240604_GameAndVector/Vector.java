package _240604_GameAndVector;

public class Vector {
    public int x;
    public int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector other){
        this.x += other.x;
        this.y += other.y;
    }

    public void multi(Vector other){
        this.x *= other.x;
        this.y *= other.y;
    }

}
