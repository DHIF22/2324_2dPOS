package _240528_2dSimpleGame;

import java.awt.*;

public class Box extends Figure implements Drawable{

    private int width, height;

    public Box(int x, int y, int width, int heigth){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = heigth;
    }

    @Override
    public void update() {
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRect(x, y, width, height);
    }
}
