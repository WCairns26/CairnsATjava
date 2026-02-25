import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("Enter a filename to read (or # to quit): ");
            String name = keyboard.nextLine();
            if (name.equals("#")) {
                System.out.println("Goodbye");
                done = true;
            } else {
                try {
                    File iFile = new File(name);
                    Scanner in = new Scanner(iFile);
                    while (in.hasNext()) {
                        String word = in.next();
                        System.out.println(word);
                    }
                    in.close();
                    done = true;
                } catch (FileNotFoundException e) {
                    System.out.println("Error, File not found");
                }
            }
        }
        keyboard.close();
    }
}