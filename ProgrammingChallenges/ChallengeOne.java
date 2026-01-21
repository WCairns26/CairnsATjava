import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String phrase = input.nextLine();
        phrase = phrase.trim();
        phrase = phrase.toLowerCase();
        String clean = "";
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch != ' ') {
                clean = clean + ch;
            }
        }
        boolean isPalindrome = true;
        int left = 0;
        int right = clean.length() - 1;
        while (left < right && isPalindrome) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("The Entered word or phrase is a Palindrome");
        } else {
            System.out.println("The Entered word or phrase is not a Palindrome");
        }
        input.close();
    }
}