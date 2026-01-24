import java.util.Arrays;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
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
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            System.out.print("*");
        }
        System.out.println();
        Arrays.sort(values, 0, currentSize);
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        input.close();
    }
}