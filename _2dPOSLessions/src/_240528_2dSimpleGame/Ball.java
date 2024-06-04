package _240528_2dSimpleGame;

import java.awt.*;

public class Ball extends Figure implements Drawable {
    private int radius = 10;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.xSpeed = 10;
        this.ySpeed = 5;
    }

    public void update(int width, int height){
        if(x <= 0){
            xSpeed *= -1;
        }
        if((x + 2*radius) >= width){
            xSpeed *= -1;
        }

        if( (y < 0) || ((y + 2*radius) >= height)){
            ySpeed *= -1;
        }

        x += xSpeed;
        y += ySpeed;
    }

    public void draw(Graphics2D g){
        g.drawOval(x, y, 2*radius, 2*radius);
    }
}
