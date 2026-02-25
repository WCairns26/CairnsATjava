import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("characters.txt");
        Scanner in = new Scanner(iFile);
        int amount = 0;
        int letters = 0;
        int digits = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                System.out.print(c);
                amount = amount + 1;
                if (Character.isLetter(c)) {
                    letters = letters + 1;
                } else if (Character.isDigit(c)) {
                    digits = digits + 1;
                }
            }
            System.out.println();
            amount = amount + 1;
        }
        in.close();
        System.out.println("amount = " + amount);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}