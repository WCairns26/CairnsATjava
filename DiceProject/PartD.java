import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        String choice = "";
        while (!choice.equals("q")) {
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            choice = in.nextLine();
            if (choice.equals("r")) {
                die.roll();
                System.out.println("die was rolled. value = " + die.getValue());
            }
            else if (choice.equals("d")) {
                int value = die.getValue();
                System.out.println("+-------+");
                if (value == 1) {
                    System.out.println("|       |");
                    System.out.println("|   0   |");
                    System.out.println("|       |");
                }
                else if (value == 2) {
                    System.out.println("| 0     |");
                    System.out.println("|       |");
                    System.out.println("|     0 |");
                }
                else if (value == 3) {
                    System.out.println("| 0     |");
                    System.out.println("|   0   |");
                    System.out.println("|     0 |");
                }
                else if (value == 4) {
                    System.out.println("| 0   0 |");
                    System.out.println("|       |");
                    System.out.println("| 0   0 |");
                }
                else if (value == 5) {
                    System.out.println("| 0   0 |");
                    System.out.println("|   0   |");
                    System.out.println("| 0   0 |");
                }
                else if (value == 6) {
                    System.out.println("| 0   0 |");
                    System.out.println("| 0   0 |");
                    System.out.println("| 0   0 |");
                }
                System.out.println("+-------+");
            }
            else if (choice.equals("q")) {
                System.out.println("Bye!");
            }
        }
        in.close();
    }
}