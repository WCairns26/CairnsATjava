package animate2;
import java.awt.EventQueue;
public class ProgramDemo2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application2 myApp = new Application2("Part A");
            myApp.setVisible(true);
        });
    }
}