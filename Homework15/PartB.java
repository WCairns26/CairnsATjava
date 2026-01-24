import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[20];
        int currentSize = 0;
        while (true) {
            System.out.print("Enter an integer value or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                if (input.hasNextInt()) {
                    if (currentSize < values.length) {
                        values[currentSize] = input.nextInt();
                        currentSize = currentSize + 1;
                    } else {
                        input.nextInt();
                    }
                } else {
                    input.next();
                }
            }
        }
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Enter a target integer value: ");
        int target = input.nextInt();
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (values[i] == target) {
                count = count + 1;
            }
        }
        System.out.println("The value " + target + " occurs " + count + " times in your original data set.");
        input.close();
    }
}