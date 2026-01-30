import java.util.Arrays;
public class PartB {
    public static void main(String[] args) {
        double avg1 = average(10, 8, 9);
        System.out.println(avg1);
        double[] scores = { 100, 90, 80, 100, 80 };
        double[] copy = Arrays.copyOf(scores, scores.length);
        double avg2 = average(copy);
        System.out.println(avg2);
    }
    public static double average(double... values) {
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        if (values.length > 0) {
            return total / values.length;
        } else {
            return 0;
        }
    }
}