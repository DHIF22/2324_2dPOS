package _240528_2dSimpleGame;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Drawable> figures = new ArrayList<>();

    public Game(){
        figures.add(new Ball(10, 10));
        figures.add(new Box(20, 20, 30, 40));
    }

    public void update(){
        for(Drawable d : figures) {
            d.update();
        }
    }

    public void draw(Graphics2D g){
        for(Drawable d : figures) {
            d.draw(g);
        }
    }
}
