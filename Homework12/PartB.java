import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter third number: ");
        double c = input.nextDouble();

        double answer = smallest(a, b, c);

        System.out.println("Smallest is: " + answer);

        input.close();
    }

    public static double smallest(double x, double y, double z) {
        double smallestValue = x;

        if (y < smallestValue) {
            smallestValue = y;
        }

        if (z < smallestValue) {
            smallestValue = z;
        }

        return smallestValue;
    }
}
