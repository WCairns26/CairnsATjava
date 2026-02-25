import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister cr = new CashRegister();
        String input = "";
        while (!input.equals("q")) {
            System.out.print("Enter price, or t, d, c, q: ");
            input = in.nextLine();
            if (input.equals("t")) {
                System.out.println("Items: " + cr.getCount());
                System.out.printf("Total: $%.2f%n", cr.getTotal());
            } else if (input.equals("d")) {
                cr.removeItem();
            } else if (input.equals("c")) {
                cr.clear();
            } else if (input.equals("q")) {
            } else {
                try {
                    double price = Double.parseDouble(input);
                    cr.addItem(price);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry.");
                }
            }
        }
        in.close();
    }
}