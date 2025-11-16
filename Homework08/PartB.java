import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
        double apr = input.nextDouble();
        System.out.print("Enter the balance: ");
        double balance = input.nextDouble();
        double rateInterest = apr / 100.0;
        System.out.println("Year |        Int Earned ($)       |           Balance ($)");
        System.out.println("----------------------------------------------------------------------");
        for (int year = 1; year <= 5; year++) {
            double interest = balance * rateInterest;
            balance = balance + interest;
            System.out.printf("%3d  | %24.2f | %26.2f%n", year, interest, balance);
        }
        input.close();
    }
}


