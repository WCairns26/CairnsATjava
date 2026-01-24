import java.util.Arrays;
public class PartC {
    public static int linearSearch(int[] array, int tgtVal) {
        int pos = 0;
        boolean found = false;
        while (pos < array.length && found == false) {
            if (array[pos] == tgtVal) {
                found = true;
            } else {
                pos = pos + 1;
            }
        }
        if (found == true) {
            return pos;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int Size = 10000;
        int Tests = 10;
        int[] data = new int[Size];
        for (int i = 0; i < data.length; i++) {
            int val = (int)(Math.random() * Size) + 1;
            data[i] = val;
        }
        int[] targets = new int[Tests];
        for (int i = 0; i < targets.length; i++) {
            targets[i] = (int)(Math.random() * Size) + 1;
        }
        System.out.println("Array size = " + Size);
        System.out.println("Targets tested = " + Tests);
        System.out.println();
        for (int i = 0; i < targets.length; i++) {
            int t = targets[i];
            long start = System.nanoTime();
            int index = linearSearch(data, t);
            long end = System.nanoTime();
            long time = end - start;
            if (index >= 0) {
                System.out.println("Linear search target " + t + " found at index " + index + " in " + time + " ns");
            } else {
                System.out.println("Linear search target " + t + " not found in " + time + " ns");
            }
        }
        System.out.println();
        Arrays.sort(data);
        for (int i = 0; i < targets.length; i++) {
            int t = targets[i];
            long start2 = System.nanoTime();
            int index2 = Arrays.binarySearch(data, t);
            long end2 = System.nanoTime();
            long time2 = end2 - start2;
            if (index2 >= 0) {
                System.out.println("Binary search target " + t + " found at index " + index2 + " in " + time2 + " ns");
            } else {
                System.out.println("Binary search target " + t + " not found in " + time2 + " ns");
            }
        }
    }
}