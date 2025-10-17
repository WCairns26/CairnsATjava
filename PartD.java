import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many cookies are you buying?: ");
        int numCookies = input.nextInt();
        double pricePerCookie = 0.99;
        double total = numCookies * pricePerCookie;
        double discount = 0.0;
        if (numCookies > 24) {
            discount = 0.15;
        } else if (numCookies > 12) {
            discount = 0.05;
        } else if (numCookies > 6) {
            discount = 0.025;

        }
        double totalWithDiscount = total - (total * discount);
        System.out.printf("Your total price is: $%.2f%n", totalWithDiscount);
        input.close();

    }
}
