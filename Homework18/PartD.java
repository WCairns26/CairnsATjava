import java.util.ArrayList;
import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();
        while (true) {
            System.out.print("Enter an integer or q to quit: ");
            if (input.hasNextInt()) {
                int value = input.nextInt();
                values.add(value);
            } else {
                String text = input.next();
                if (text.equals("q") || text.equals("Q")) {
                    break;
                }
            }
        }
        int i = 0;
        while (i < values.size()) {
            if (values.get(i) % 2 != 0) {
                values.remove(i);
            } else {
                i = i + 1;
            }
        }
        System.out.println();
        for (int j = 0; j < values.size(); j++) {
            System.out.println(values.get(j));
        }
        input.close();
    }
}