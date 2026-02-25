import java.util.Scanner;
public class PartB {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter cake = new Counter();
        Counter pie = new Counter();
        System.out.println("Enter c for cake, p for pie, q to quit.");
        String choice = "";
        boolean done = false;
        while (!done) {
            System.out.print("Choice: ");
            choice = in.nextLine();
            if (choice.equals("c")) {
                cake.count();
            } else if (choice.equals("p")) {
                pie.count();
            } else if (choice.equals("q")) {
                done = true;
            } else {
                System.out.println("Please enter c, p, or q.");
            }
        }
        System.out.println("Cake votes: " + cake.getValue());
        System.out.println("Pie votes: " + pie.getValue());
        in.close();
    }
}