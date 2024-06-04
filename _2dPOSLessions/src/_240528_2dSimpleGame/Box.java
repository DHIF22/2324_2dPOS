package _240528_2dSimpleGame;

import _240604_GameAndVector.Vector;

import java.awt.*;

public class Box extends Figure implements Drawable{

    private int width, height;

    public Box(int x, int y, int width, int heigth){
        this.location = new Vector(x, y);
        this.width = width;
        this.height = heigth;
    }

    @Override
    public void update(int width, int height) {
        location.add(speed);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRect(location.x, location.y, width, height);
    }
}
