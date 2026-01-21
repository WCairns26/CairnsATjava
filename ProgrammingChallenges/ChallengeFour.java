import java.util.Scanner;
public class ChallengeFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value between 0 and 20: ");
        int value = input.nextInt();
        int percent = value * 5;
        System.out.print("Progress: [");
        for (int i = 0; i < 20; i++) {
            if (i < value) {
                System.out.print("#");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("] " + percent + "%");
        input.close();
    }
}
