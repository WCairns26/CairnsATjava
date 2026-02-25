import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File qFile = new File("quizzes.txt");
        Scanner quizIn = new Scanner(qFile);
        PrintWriter out = new PrintWriter("quizzesMod.txt");
        double sum = 0.0;
        int amount = 0;
        int quizNumber = 0;
        while (quizIn.hasNextDouble()) {
            double score = quizIn.nextDouble();
            out.printf("Quiz %03d: %.2f%n", quizNumber, score);
            sum = sum + score;
            amount = amount + 1;
            quizNumber = quizNumber + 1;
        }
        out.println("----------------");
        double avg = 0.0;
        if (amount > 0) {
            avg = sum / amount;
        }
        out.printf("Average: %.2f%n", avg);
        quizIn.close();
        out.close();
    }
}