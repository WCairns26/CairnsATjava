import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Unit7test {
    public static void main(String[] args) throws FileNotFoundException {
        File iFile = new File("mathmeet.txt");
        Scanner in = new Scanner(iFile);
        double sum = 0.0;
        int scoresNum = 0;
        System.out.println("Name               | School                  | Score");
        System.out.println("------------------------------------------------------");
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int firstCom = line.indexOf(",");
            int secondCom = line.indexOf(",", firstCom + 1);
            String name = line.substring(0, firstCom);
            String school = line.substring(firstCom + 2, secondCom);
            String stringScore = line.substring(secondCom + 2);
            double score = Double.parseDouble(stringScore);
            sum = sum + score;
            scoresNum = scoresNum + 1;
            System.out.print(name + "    | ");
            System.out.print(school + "    | ");
            System.out.printf("%.1f%n", score);
        }
        in.close();
        System.out.println("------------------------------------------------------");
        double avg = sum / scoresNum;
        System.out.printf("Average Score: %.1f%n", avg);
    }
}
