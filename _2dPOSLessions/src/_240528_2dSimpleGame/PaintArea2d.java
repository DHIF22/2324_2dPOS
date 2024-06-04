package _240528_2dSimpleGame;

import javax.swing.*;
import java.awt.*;

public class PaintArea2d extends JPanel {

    private Game game = null;

    public PaintArea2d() {
        super();
        game = new Game();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int height = getHeight();
        int width = getWidth();
        Graphics2D g2d = (Graphics2D) g;
        game.update(width, height);
        game.draw(g2d);
    }
}
