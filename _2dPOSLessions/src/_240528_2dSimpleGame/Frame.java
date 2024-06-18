package _240528_2dSimpleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private static final int WINDOWS_WIDTH = 600;
    private static final int WINDOWS_HEIGHT = 800;

    private PaintArea2d paintArea;

    public Frame(PaintArea2d paintArea2d){
        this.paintArea = paintArea2d;

        setTitle("Simple 2d Game");
        setSize(WINDOWS_WIDTH, WINDOWS_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(paintArea);

        Timer timer = new Timer(20, (e) ->
                paintArea.repaint()
        );
        timer.start();
    }

    public static void main(String[] args) {

        Game game = new Game();
        PaintArea2d paintArea2d = new PaintArea2d(game);

        System.setProperty("sun.java2d.opengl", "true");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame(paintArea2d).setVisible(true);
            }
        });
    }
}
