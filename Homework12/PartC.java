import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        int count = countVowels(phrase);
        System.out.println("Number of vowels: " + count);
        input.close();
    }
    public static int countVowels(String phrase) {
        int total = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (isVowel(ch) == true) {
                total = total + 1;
            }
        }
        return total;
    }
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
        return false;
    }
}

