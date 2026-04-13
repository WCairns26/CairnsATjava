public class PartA {
    public static void printSpeed(Bicycle b) {
        System.out.printf("Speed = %02d MPH%n", b.getSpeed());
    }
    public static void main(String[] args) {
        Bicycle regularBike = new Bicycle();
        regularBike.pedal();
        regularBike.pedal();
        regularBike.pedal();
        regularBike.pedal();
        GearedBicycle gearedBike = new GearedBicycle();
        gearedBike.shiftUp();
        gearedBike.pedal();
        gearedBike.pedal();
        System.out.println("Before braking:");
        System.out.print("Regular bike: ");
        printSpeed(regularBike);
        System.out.print("Geared bike: ");
        printSpeed(gearedBike);
        regularBike.brake();
        gearedBike.brake();
        System.out.println();
        System.out.println("After braking once:");
        System.out.print("Regular bike: ");
        printSpeed(regularBike);
        System.out.print("Geared bike: ");
        printSpeed(gearedBike);
        System.out.println("Geared bike current gear = " + gearedBike.getCurrentGear());
    }
}