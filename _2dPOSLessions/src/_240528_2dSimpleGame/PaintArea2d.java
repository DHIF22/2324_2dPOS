package _240528_2dSimpleGame;

import javax.swing.*;
import java.awt.*;

public class PaintArea2d extends JPanel {

    private Game game = new Game();

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        game.update();
        game.draw(g2d);
    }
}
