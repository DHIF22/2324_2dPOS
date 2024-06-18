package _240528_2dSimpleGame;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Game extends MyGraphics{

    public Game(){
    }

    public void update(int width, int height){
        for(Drawable d : figures) {
            d.update(width, height);
        }
    }

    public void draw(Graphics2D g){
        for(Drawable d : figures) {
            d.draw(g);
        }
    }
}
