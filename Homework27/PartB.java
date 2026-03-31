import java.util.Scanner;
import org.derryfield.math.Geometry;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one side length of the square: ");
        double sideVal = input.nextDouble();
        double perimeterVal = Geometry.get_perimeter_square(sideVal);
        double areaVal = Geometry.get_area_square(sideVal);
        System.out.println("The perimeter is " + perimeterVal);
        System.out.println("The area is " + areaVal);
        input.close();
    }
}