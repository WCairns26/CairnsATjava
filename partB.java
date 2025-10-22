import java.util.Scanner;
enum CustomerType {Child, Adult, Senior}
public class partB {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Is today Monday? (true/false): ");
    boolean isMonday = input.nextBoolean();
    System.out.print("What is the age of the customer?: ");
    int age = input.nextInt();
    System.out.print("How much did their meal cost?: ");
    double mealCost = input.nextDouble();
    
    CustomerType type;
    if (age < 13) {
        type = CustomerType.Child;
    } else if (age >= 50) {
        type = CustomerType.Senior;
    } else {
        type = CustomerType.Adult;
    }
    double discount = 0.0;
    if (isMonday) {
        switch (type) {
            case Child:
                discount = 0.075;
                break;
            case Senior:
                discount = 0.15;
                break;
            case Adult:
                discount = 0.05;
                break;
        }
    } else {
        switch (type) {
            case Child:
                discount = 0.05;
                break;
            case Senior:
                discount = 0.075;
                break;
            case Adult:
                discount = 0.0;
                break;
        }
    }
    double finalCost = mealCost - (mealCost * discount);
    System.out.printf("The final cost of the meal is: $%.2f%n", finalCost);
    input.close();
}
}
    

