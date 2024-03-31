
//canvas class - listeners, key inputs, etc, interface to the screen, to draw, to get input and make output
//fps is how many times the paint funxtion runs per second
//main game class - calls canvas a lot
//engine class

import javax.swing.*;
import java.awt.*;

public class RocketGame extends JFrame {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private static final int SHIP_VELOCITY = 2;

    private RocketShip rocketShip;

    public RocketGame() {
        setTitle("Space Pilot");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        rocketShip = new RocketShip(0, HEIGHT / 2 - RocketShip.HEIGHT / 2, SHIP_VELOCITY);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                rocketShip.draw(g);
            }
        };
        add(panel);

        setVisible(true);

        // Start the game loop
        while (true) {
            rocketShip.update();
            panel.repaint();
            try {
                Thread.sleep(20); // Adjust speed of animation here
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new RocketGame();
    }
}

	
	


	

