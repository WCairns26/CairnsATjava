import java.util.Arrays;
public class PartOne {
    public static void swap(int a, int b, int[] array) {
        boolean validA = true;
        boolean validB = true;
        if (a < 0 || a >= array.length) {
            validA = false;
        }
        if (b < 0 || b >= array.length) {
            validB = false;
        }
        if (validA == false || validB == false) {
            return;
        }
        int tempVal = array[a];
        array[a] = array[b];
        array[b] = tempVal;
    }
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}