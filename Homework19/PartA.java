import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File tFile = new File("temps.txt");
        Scanner tempIn = new Scanner(tFile);
        ArrayList<Integer> temps = new ArrayList<Integer>();
        int lowest = 0;
        boolean first = true;
        while (tempIn.hasNextInt()) {
            int t = tempIn.nextInt();
            temps.add(t);
            if (first) {
                lowest = t;
                first = false;
            } else {
                if (t < lowest) {
                    lowest = t;
                }
            }
        }
        tempIn.close();
        for (int i = 0; i < temps.size(); i++) {
            int value = temps.get(i);
            if (value == lowest) {
                System.out.println(value + " <= lowest");
            } else {
                System.out.println(value);
            }
        }
    }
}