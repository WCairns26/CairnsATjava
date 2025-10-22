import java.util.Scanner;
public class partA {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Is today Monday? (true/false): ");
    boolean isMonday = input.nextBoolean();
    System.out.print("What is the age of the customer?: ");
    int age = input.nextInt();
    System.out.print("How much did their meal cost?: ");
    double mealCost = input.nextDouble();
    double discount = 0.0;
    if (isMonday) {
        if (age < 13) discount = 0.075;
        else if (age >= 50) discount = 0.15;
        else discount = 0.05;
    }
    else {
        if (age < 13) discount = 0.05;
        else if (age >= 50) discount = 0.075;
    
    }
    double finalCost = mealCost - (mealCost * discount);
    System.out.printf("The final cost of the meal is: $%.2f%n", finalCost);
    input.close();
    }
}