import mow.Mower;
import mow.Yard;
public class ProgramDemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }
    public static void main(String[] args) {
        Yard yard = new Yard(5, 24);
        int startRow = yard.getHeight() / 2 + 1;
        Mower mower = new Mower(startRow, 1, 1);
        while (true) {
            mower.mow(yard);
            clearScreen();
            yard.printYard(mower);
            delay(500);
            if (mower.senseFront(yard) == 'R') {
                break;
            }
            mower.moveForward();
        }
    }
}