import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("sales_by_cat.txt");
        Scanner in = new Scanner(iFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int c1 = line.indexOf(",");
            int c2 = line.indexOf(",", c1 + 1);
            String dept = line.substring(0, c1).trim();
            String manager = line.substring(c1 + 1, c2).trim();
            String salesString = line.substring(c2 + 1).trim();
            double sales = 0.0;
            Scanner test = new Scanner(salesString);
            if (test.hasNextDouble()) {
                sales = test.nextDouble();
            } else {
                sales = 0.0;
            }
            test.close();
            System.out.printf("%s | %s | $ %.2f%n", dept, manager, sales);
        }
        in.close();
    }
}