package _240227_Comparator;

public class Player implements Comparable<Player>{
    private int age;
    private String name;
    private int score;
    private float salary;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
        // which values are in score and salary when programm
        // is in this line.
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Player other) {
        return this.getName().compareTo(other.getName());
    }

}
