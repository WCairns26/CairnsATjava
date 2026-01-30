import java.util.ArrayList;
import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<Integer>();
        while (true) {
            System.out.print("Enter a temperature or q to quit: ");
            if (input.hasNextInt()) {
                int value = input.nextInt();
                temps.add(value);
            } else {
                String text = input.next();
                if (text.equals("q") || text.equals("Q")) {
                    break;
                }
            }
        }
        int lowesttemp = temps.get(0);
        for (int i = 1; i < temps.size(); i++) {
            if (temps.get(i) < lowesttemp) {
                lowesttemp = temps.get(i);
            }
        }
        for (int i = 0; i < temps.size(); i++) {
            if (temps.get(i) == lowesttemp) {
                System.out.println(temps.get(i) + " <= lowest");
            } else {
                System.out.println(temps.get(i));
            }
        }
        input.close();
    }
}