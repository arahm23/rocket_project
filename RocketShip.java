import java.awt.*;

public class RocketShip {

    private static final int WIDTH = 50;
    static final int HEIGHT = 100;

    private int x, y; // Position of the ship
    private double angle; // Rotation angle of the ship
    private int velocity; // Speed of the ship

    public RocketShip(int x, int y, int velocity) {
        this.x = x;
        this.y = y;
        this.angle = 0; // Start ship facing upwards
        this.velocity = velocity;
    }

    public void update() {
        // Update ship's position
        x += velocity;

        // If the ship goes off the right side of the screen, reset to the left side
        if (x > RocketGame.WIDTH) {
            x = -WIDTH;
        }
    }

    public void draw(Graphics g) {
        // Save the current graphics color
        Color oldColor = g.getColor();

        // Set the color to draw the ship
        g.setColor(Color.RED);

        // Draw the ship (a simple rectangle for now)
        g.fillRect(x, y, WIDTH, HEIGHT);

        // Reset the color to the original color
        g.setColor(oldColor);
    }

    // Add methods for controlling the ship (e.g., rotate, thrust) here
}
