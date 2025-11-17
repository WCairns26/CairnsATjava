public class PartC {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        while (count < 1000) {
            int number = (int) (Math.random() * 10) + 1;
            total = total + number;
            count = count + 1;
        }
        double average = (double) total / 1000;
        System.out.println("The average of the 1000 random numbers is: " + average);
    }
}
//Yes, the average produced by this makes sense for 2 reasons. First, since there are so many more random numbers being generated, in theory, they should each appear (close to) the same number of times. Logically, this would mean that the average would be very close to 5.5(this is the case), which is the average of all the numbers from 1 to 10. Second, there are more decimal places in the average since we are working with 1000 numbers, as opposed to to 10, which mathematically creates a more exact average, and thereby more decimal places.