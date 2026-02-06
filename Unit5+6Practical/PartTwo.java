import java.util.ArrayList;
import java.util.Scanner;
public class PartTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> quizScores = new ArrayList<Double>();
        boolean done = false;
        while (done == false) {
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if (input.hasNextDouble()) {
                double val = input.nextDouble();
                quizScores.add(val);
            } else {
                String text = input.next();
                if (text.equals("q")) {
                    done = true;
                }
            }
        }
        System.out.println("-------------------");
        double total = 0;
        int count = quizScores.size();
        for (int i = 0; i < quizScores.size(); i++) {
            double score = quizScores.get(i);
            System.out.println(score);
            total = total + score;
        }
        System.out.println("-------------------");
        if (count > 0) {
            double avg = total / count;
            System.out.println("avg = " + avg);
        } else {
            System.out.println("avg = 0");
        }
        input.close();
    }
}