package animate2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class Board2 extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private BufferedImage img;
    public Board2() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        try {
            File imageFile = new File("media/andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (img != null) {
            AffineTransform affineTransform = new AffineTransform();
            double xScale = (B_WIDTH / 4.0) / img.getWidth();
            double yScale = (B_HEIGHT / 4.0) / img.getHeight();
            double scale = Math.min(xScale, yScale);
            int scaledWidth = (int) (img.getWidth() * scale);
            int scaledHeight = (int) (img.getHeight() * scale);
            int x_t = B_WIDTH - scaledWidth;
            int y_t = B_HEIGHT - scaledHeight;
            affineTransform.translate(x_t, y_t);
            affineTransform.scale(scale, scale);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}