public class PartB {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
        double total = 0;
        for (double n : numbers) {
            System.out.println(n);
            total = total + n;
        }
        double average = total / numbers.length;
        System.out.println("The average is " + average);
    }
}