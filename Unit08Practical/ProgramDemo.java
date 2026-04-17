import org.derryfield.math.Algebra;
public class ProgramDemo {
    public static void main(String[] args) {
        double y = 2.0;
        double x = 12.0;
        double mean = Algebra.harmonicMean(x, y);
        System.out.println(" The harmonic mean of " + x + " and " + y + " is: " + mean);
    }
}