import java.time.LocalDate;
import java.time.LocalTime;
public class PartA {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Today's date is " + today);
        System.out.println("The time is " + time);
    }
}
// the java.time package contains both classes, and the parent package is java