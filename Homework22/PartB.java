import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("birthyears.txt");
        Scanner in = new Scanner(iFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int comma = line.indexOf(",");
            String name = line.substring(0, comma);
            String yearString = line.substring(comma + 1);
            try {
                int year = Integer.parseInt(yearString);
                System.out.println(name + " was born in " + year + ".");
            } catch (NumberFormatException e) {
                System.out.println("I do not know what year " + name + " was born.");
            }
        }
        in.close();
    }
}