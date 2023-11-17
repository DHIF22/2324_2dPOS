package _231117_TypeConversion_and_someExamplesWithClasses;

import java.util.Random;

public class Cloud {
    // your turn: the cloud can hold 10000 points
    static final int MAX_POINTS = 10_000; // constant
    private Coordinate[] points = new Coordinate[MAX_POINTS];
    private int currentPointCounter = 0;

    public void addPoint(Coordinate point){
        if(currentPointCounter < MAX_POINTS){
            points[currentPointCounter] = point;
            currentPointCounter++;
        }
    }

    public void addPoint(int x, int y){
        addPoint(new Coordinate(x, y));
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("##########\n");
        for(int i = 0; i < currentPointCounter; i++){
            sb.append(points[i].toString());
            sb.append("\n");
        }

        sb.append("##########\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        // your turn: set into cloud 10000 random points
        Cloud cloud = new Cloud();
        //Coordinate point = new Coordinate(3, 9);
        //cloud.addPoint(point);
        Random random = new Random();
        int randomX = 0;
        int randomY = 0;
        int upperLimit = 50;
        int lowerLimit = -50;
        for(int i = 0; i < cloud.MAX_POINTS; i++) {
            randomX = random.nextInt(lowerLimit, upperLimit+1);
            randomY = random.nextInt(lowerLimit, upperLimit+1);
            cloud.addPoint(new Coordinate(randomX, randomY));
        }
        System.out.println(cloud);
    }
}
