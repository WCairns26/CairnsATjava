package animate;
import java.awt.EventQueue;
public class ProgramDemo {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("App");
            myApp.setVisible(true);
        });
    }
}