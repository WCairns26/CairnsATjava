import java.util.Scanner;
public class partB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
        input.close();
    }
}
