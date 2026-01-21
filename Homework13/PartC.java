import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class PartC {
    public static void draw(Graphics g) {
        int centerX = 200;
        int centerY = 200;
        int steps = 1000;
        double scale = 150.0;
        g.setColor(Color.BLUE);
        for (int i = 0; i <= steps; i++) {
            double theta = (2.0 * Math.PI) * i / steps;
            double r = Math.cos(2.0 * theta);
            double x = scale * r * Math.cos(theta);
            double y = scale * r * Math.sin(theta);
            int plotX = centerX + (int) x;
            int plotY = centerY - (int) y;
            g.fillOval(plotX, plotY, 2, 2);
        }
    }
    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }
    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }
    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }
        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Graphics Template");
        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };
        frame.add(component);
        frame.setVisible(true);
        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }
}
