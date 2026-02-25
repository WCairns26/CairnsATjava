import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("customerdata.txt");
        Scanner in = new Scanner(iFile);
        in.useDelimiter("[,\\s\\n]+");
        System.out.println("---------------------------------------");
        System.out.println(" ID | Name | Balance");
        System.out.println("---------------------------------------");
        while (in.hasNext()) {
            int id = in.nextInt();
            String name = in.next();
            double balance = in.nextDouble();
            System.out.printf("%06d | %s | $ %,.2f%n", id, name, balance);
        }
        in.close();
    }
}