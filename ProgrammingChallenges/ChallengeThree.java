import java.util.Scanner;
public class ChallengeThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        }
        if (prime == true) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                }
            }
        }
        if (prime == true) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
        input.close();
    }
}
