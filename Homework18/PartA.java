import java.util.ArrayList;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        while (true) {
            System.out.print("Enter a name, or enter # to quit: ");
            String text = input.nextLine();
            if (text.equals("#")) {
                break;
            }
            names.add(text);
        }
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        input.close();
    }
}