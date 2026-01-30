public class PartB {
    public static void main(String[] args) {
        int[][] first = {
            {8, 6, 7},
            {5, 3, 0}
        };
        int[][] second = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };
        System.out.println("First Array:");
        print(first);
        System.out.println("Second Array:");
        print(second);
    }
    public static void print(int[][] values) {
        for (int row = 0; row < values.length; row++) {
            for (int column = 0; column < values[0].length; column++) {
                System.out.print(values[row][column]);
                if (column < values[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}