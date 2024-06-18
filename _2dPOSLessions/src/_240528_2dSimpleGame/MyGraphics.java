package _240528_2dSimpleGame;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class MyGraphics {
    protected List<Drawable> figures = new ArrayList<>();

    public void addDrawable(Drawable d){
        figures.add(d);
    }

    abstract public void update(int width, int height);

    abstract public void draw(Graphics2D g);

}
