package animate2;
import java.awt.EventQueue;
public class ProgramDemo3 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application3 myApp = new Application3("Part B");
            myApp.setVisible(true);
        });
    }
}