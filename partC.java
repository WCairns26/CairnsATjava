import java.util.Scanner;
public class partC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three strings: ");
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();
        String first, second, third;
        if (str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0) {
            first = str1;
            if (str2.compareTo(str3) <= 0) {
                second = str2;
                third = str3;
            } else {
                second = str3;
                third = str2;
            }
        } else if (str2.compareTo(str1) <= 0 && str2.compareTo(str3) <= 0) {
            first = str2;
            if (str1.compareTo(str3) <= 0) {
                second = str1;
                third = str3;
            } else {
                second = str3;
                third = str1;
            }
        } else {
            first = str3;
            if (str1.compareTo(str2) <= 0) {
                second = str1;
                third = str2;
            } else {
                second = str2;
                third = str1;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        input.close();
    }
    
}
