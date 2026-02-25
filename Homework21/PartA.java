import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("Top5Unemployment.txt");
        Scanner in = new Scanner(iFile);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int c1 = line.indexOf(",");
            int c2 = line.indexOf(",", c1 + 1);
            int c3 = line.indexOf(",", c2 + 1);
            String country = line.substring(0, c1).trim();
            String rateString = line.substring(c1 + 1, c2).trim();
            String rankString = line.substring(c2 + 1, c3).trim();
            String region = line.substring(c3 + 1).trim();
            double rate = Double.parseDouble(rateString);
            int rank = Integer.parseInt(rankString);
            System.out.printf("Ranked # %d: %s | %.2f%% | %s%n", rank, country, rate, region);
        }
        System.out.println("---------------------------------------------------------------");
        in.close();
    }
}