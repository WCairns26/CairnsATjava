import java.util.Scanner;
public class PartA {
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score from 0-100: ");
        String text = in.nextLine();
        int score;
        try {
            score = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        if (score < 0 || score > 100) {
            throw new NumberFormatException();
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score = -1;
        boolean valid = false;
        while (!valid) {
            try {
                score = getQuizScore(keyboard);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid quiz score.");
            }
        }
        System.out.println("Valid score: " + score);
        keyboard.close();
    }
}