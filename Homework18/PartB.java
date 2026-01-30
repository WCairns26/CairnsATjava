import java.util.ArrayList;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();
        while (true) {
            System.out.print("Enter a test score or q to quit: ");
            if (input.hasNextDouble()) {
                double val = input.nextDouble();
                scores.add(val);
            } else {
                String text = input.next();
                if (text.equals("q") || text.equals("Q")) {
                    break;
                }
            }
        }
        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%.2f\n", scores.get(i));
            total = total + scores.get(i);
        }
        if (scores.size() > 0) {
            double avg = total / scores.size();
            System.out.printf("Average: %.2f\n", avg);
        }
        input.close();
    }
}