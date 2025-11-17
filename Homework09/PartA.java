import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double testScore;
        double totalScore = 0.0;
        int numberScore = 0;
        System.out.println("To get the average of your test scores, input them one at a time. Input a negative value to stop the program and receive your average.");
        System.out.print("Input a test score: ");
        testScore = input.nextDouble();
        while (testScore >= 0) {
            totalScore = totalScore + testScore;
            numberScore = numberScore + 1;
            System.out.print("Input a test score: ");
            testScore = input.nextDouble();
        }
        if (numberScore > 0) {
            double averageScore = totalScore / numberScore;
            System.out.println("You input " + numberScore + " scores.");
            System.out.println("Average score: " + averageScore);
        } else {
            System.out.println("No average, no valid scores input.");
        }
        input.close();
    }
}