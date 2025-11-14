import java.util.Scanner;
public class ticketing {
    enum CustomerType { BABY, CHILD, ADULT, SENIOR }
    enum DayOfWeek { MON, TUE, WED, THU, FRI, SAT, SUN }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("name: ");
        String nameOfCustomer = input.nextLine();
        if (nameOfCustomer.length() == 0) {
            System.err.println("Error: Invalid name. Stopping program.");
            return;
        }
        System.out.print("day: ");
        String dayInput = input.nextLine();
        String dayProper = dayInput.toUpperCase();
        DayOfWeek day = DayOfWeek.MON;
        boolean dayIsValid = false;
        if (dayProper.equals("MON") ||
            (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("MON")) ||
            dayProper.equals("MONDAY")) {
            day = DayOfWeek.MON;
            dayIsValid = true;
        } else if (dayProper.equals("TUE") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("TUE")) ||
                   dayProper.equals("TUESDAY")) {
            day = DayOfWeek.TUE;
            dayIsValid = true;
        } else if (dayProper.equals("WED") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("WED")) ||
                   dayProper.equals("WEDNESDAY")) {
            day = DayOfWeek.WED;
            dayIsValid = true;
        } else if (dayProper.equals("THU") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("THU")) ||
                   dayProper.equals("THURSDAY")) {
            day = DayOfWeek.THU;
            dayIsValid = true;
        } else if (dayProper.equals("FRI") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("FRI")) ||
                   dayProper.equals("FRIDAY")) {
            day = DayOfWeek.FRI;
            dayIsValid = true;
        } else if (dayProper.equals("SAT") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("SAT")) ||
                   dayProper.equals("SATURDAY")) {
            day = DayOfWeek.SAT;
            dayIsValid = true;
        } else if (dayProper.equals("SUN") ||
                   (dayProper.length() >= 3 && dayProper.substring(0, 3).equals("SUN")) ||
                   dayProper.equals("SUNDAY")) {
            day = DayOfWeek.SUN;
            dayIsValid = true;
        }

        if (!dayIsValid) {
            System.err.println("Error: Invalid day. Stopping program.");
            return;
        }
        System.out.print("time: ");
        String timeInput = input.nextLine();

        if (timeInput.length() != 5) {
            System.err.println("Error: Invalid time. Stopping program.");
            return;
        }
        if (!timeInput.substring(2, 3).equals(":")) {
            System.err.println("Error: Invalid time. Stopping program.");
            return;
        }

        String timeHour = timeInput.substring(0, 2);
        String timeMinute = timeInput.substring(3, 5);

        int hour = Integer.parseInt(timeHour);
        int minute = Integer.parseInt(timeMinute);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.err.println("Error: Invalid time. Stopping program.");
            return;
        }
        System.out.print("age: ");
        if (!input.hasNextInt()) {
            System.err.println("Error: Invalid age. Stopping program.");
            return;
        }
        int ageOfCustomer = input.nextInt();
        if (ageOfCustomer < 0) {
            System.err.println("Error: Invalid age. Stopping program.");
            return;
        }
        input.nextLine();
        System.out.print("student (y/n)?: ");
        String studentInput = input.nextLine();
        String studentProper = studentInput.toUpperCase();

        boolean studentPrice;
        if (studentProper.equals("Y") || studentProper.equals("YES") || studentProper.equals("TRUE")) {
            studentPrice = true;
        } else if (studentProper.equals("N") || studentProper.equals("NO") || studentProper.equals("FALSE")) {
            studentPrice = false;
        } else {
            System.err.println("Error: Invalid input. Stopping program.");
            return;
        }
        boolean weekendPrice = (day == DayOfWeek.SAT || day == DayOfWeek.SUN);
        double basePrice;
        if (weekendPrice) {
            basePrice = 80.00;
        } else {
            boolean morningRush = (hour >= 6 && hour <= 7);
            boolean eveningRush = (hour >= 16 && hour <= 17);
            if (morningRush || eveningRush) {
                basePrice = 100.00;
            } else {
                basePrice = 90.00;
            }
        }

        boolean rushPrice = false;
        if (!weekendPrice) {
            if ((hour >= 6 && hour <= 7) || (hour >= 16 && hour <= 17)) {
                rushPrice = true;
            }
        }
        CustomerType custType;
        if (ageOfCustomer <= 2) {
            custType = CustomerType.BABY;
        } else if (ageOfCustomer <= 12) {
            custType = CustomerType.CHILD;
        } else if (ageOfCustomer <= 59) {
            custType = CustomerType.ADULT;
        } else {
            custType = CustomerType.SENIOR;
        }
        double ageDiscount;
        if (custType == CustomerType.BABY) {
            ageDiscount = 1.0;
        } else if (custType == CustomerType.CHILD) {
            ageDiscount = 0.20;
        } else if (custType == CustomerType.SENIOR) {
            ageDiscount = 0.25;
        } else {
            ageDiscount = 0.0;
        }

        double agePrice = basePrice * (1.0 - ageDiscount);
        double ageSavings = basePrice - agePrice;
        double studentSavings = 0.0;
        double totalPrice;

        if (custType == CustomerType.BABY) {
            totalPrice = 0.0;
            ageSavings = basePrice;
            agePrice = 0.0;
        } else {
            if (studentPrice) {
                studentSavings = agePrice * 0.05;
            }
            totalPrice = agePrice - studentSavings;
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Name:    " + nameOfCustomer);
        System.out.println("Day:     " + day.name());
        System.out.println("Time:    " + timeInput);
        System.out.println("--------------------------------------------");
        System.out.printf("Base Price:         $%10.2f %s%n",
                basePrice,
                rushPrice ? "(RUSH HOUR FARE)" : "");
        System.out.printf("Age Discount:       $%10.2f (%s)%n",
                ageSavings,
                custType.name());

        double studentDiscount = (custType == CustomerType.BABY || !studentPrice) ? 0.0 : -studentSavings;
        System.out.printf("Student Discount:   $%10.2f%n", studentDiscount);
        System.out.println("--------------------------------------------");
        System.out.printf("Final Cost:         $%10.2f%n", totalPrice);
        System.out.println("--------------------------------------------");
        input.close();
    }
}
