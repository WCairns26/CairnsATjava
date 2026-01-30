import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[50];
        int currentSize = 0;
        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String text = input.nextLine();
            if (text.equals("q") || text.equals("Q")) {
                break;
            }
            if (currentSize < words.length) {
                words[currentSize] = text;
                currentSize = currentSize + 1;
            }
        }
        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(words[i]);
        }
        cleanup(words);
        System.out.println("Modified array...");
        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(words[i]);
        }
        input.close();
    }
    public static void cleanup(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                String s = array[i];
                s = s.trim();
                s = s.toLowerCase();
                if (s.length() > 0) {
                    String first = s.substring(0, 1).toUpperCase();
                    String rest = "";
                    if (s.length() > 1) {
                        rest = s.substring(1);
                    }
                    s = first + rest;
                }
                array[i] = s;
            }
        }
    }
}