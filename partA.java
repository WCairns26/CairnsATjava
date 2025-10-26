import java.util.Scanner;
public class partA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temperature = input.nextDouble();
        char unit = input.next().charAt(0);
        double tempCelsius;
        if (unit == 'F' || unit == 'f') {
            tempCelsius = (temperature - 32) * 5 / 9;
        } else {
            tempCelsius = temperature;
        }
        if (tempCelsius <= 0) {
            System.out.printf("At a temperature of %.2f %c, water is in a solid state.%n", temperature, unit);
        } else if (tempCelsius >= 100) {
            System.out.printf("At a temperature of %.2f %c, water is in a gaseous state.%n", temperature, unit);
        } else {
            System.out.printf("At a temperature of %.2f %c, water is in a liquid state.%n", temperature, unit);
        }
        input.close();


    }
}
