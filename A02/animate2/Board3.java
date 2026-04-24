package animate2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class Board3 extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x;
    private int y;
    private int angle;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 1;
    private int ySpeed = 1;
    private Timer timer;
    private BufferedImage img;
    private class ScheduledUpdate extends TimerTask {
        public void run() {
            x = x + xSpeed;
            y = y + ySpeed;
            angle = angle - 5;
            if (x > B_WIDTH) {
                x = 0;
            }
            if (y > B_HEIGHT) {
                y = 0;
            }
            if (angle <= -360) {
                angle = 0;
            }
            repaint();
        }
    }
    public Board3() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        try {
            File imageFile = new File("media/andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        x = 0;
        y = 0;
        angle = 0;
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), INITIAL_DELAY, PERIOD_INTERVAL);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (img != null) {
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.translate(x - img.getWidth() / 2.0, y - img.getHeight() / 2.0);
            affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2.0, img.getHeight() / 2.0);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}