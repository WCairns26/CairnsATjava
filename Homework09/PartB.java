import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        int numE = 0;
        for (int i = 0; i < phrase.length(); i = i + 1) {
            char letter = phrase.charAt(i);
            if (letter == 'e') {
                numE = numE + 1;
            }
        }
        System.out.println("The letter e occurs " + numE + " times in this phrase.");
        input.close();
    }
}
