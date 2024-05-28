package _240528_2dSimpleGame;

import java.awt.*;

public class Ball extends Figure implements Drawable {
    private int radius = 10;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.ySpeed = 0;
    }

    public void update(){
        x += xSpeed;
        y += ySpeed;
    }

    public void draw(Graphics2D g){
        g.drawOval(x, y, 2*radius, 2*radius);
    }
}
