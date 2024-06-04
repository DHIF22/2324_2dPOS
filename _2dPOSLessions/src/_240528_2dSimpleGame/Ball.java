package _240528_2dSimpleGame;

import _240604_GameAndVector.Vector;

import java.awt.*;

public class Ball extends Figure implements Drawable {
    private int radius = 10;

    public Ball(int x, int y){
        this.location = new Vector(x, y);
        this.speed = new Vector(10, 5);
    }

    public void update(int width, int height){
        if(location.x <= 0 || ((location.x + 2*radius) >= width)){
            speed.multi(new Vector(-1, 1));
        }

        if( (location.y < 0) || ((location.y + 2*radius) >= height)){
            speed.multi(new Vector(1, -1));
        }

        location.add(speed);
        //location.x += xSpeed;
        //location.y += ySpeed;
    }

    public void draw(Graphics2D g){
        g.drawOval(location.x, location.y, 2*radius, 2*radius);
    }
}
