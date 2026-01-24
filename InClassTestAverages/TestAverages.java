import java.util.Scanner;
public class TestAverages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[10];
        int count = 0;
        System.out.print("Enter a test score or 'q' to quit: ");
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                if (count < scores.length) {
                    scores[count] = input.nextDouble();
                    count = count + 1;
                } else {
                    input.nextDouble();
                }
            } else {
                String text = input.next();
                if (text.equals("q") || text.equals("Q")) {
                    break;
                }
            }
            System.out.print("Enter a test score or 'q' to quit: ");
        }
        double total = 0;
        double max = 0;
        if (count > 0) {
            max = scores[0];
        }
        for (int i = 0; i < count; i++) {
            total = total + scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        double average = 0;
        if (count > 0) {
            average = total / count;
        }
        System.out.println();
        System.out.println("Number of scores: " + count);
        System.out.println("Average score: " + average);
        System.out.println("Max score: " + max);
        input.close();
    }
}
