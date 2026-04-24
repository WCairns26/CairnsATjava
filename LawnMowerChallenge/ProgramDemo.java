import java.util.Scanner;
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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int width = in.nextInt();
        Yard yard = new Yard(height, width);
        Mower mower = new Mower(1, 1, 1);
        mower.randomizeMower(yard);
        while (true) {
            mower.mow(yard);
            clearScreen();
            yard.printYard(mower);
            delay(150);
            if (mower.updateMower(yard) == false) {
                mower.mow(yard);
                clearScreen();
                yard.printYard(mower);
                break;
            }
        }
        in.close();
    }
}