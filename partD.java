import java.util.Scanner;
public class partD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 3999: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            input.close();
            return;
        }
        int number = input.nextInt();
        if (number < 1 || number > 3999) {
            System.out.println("Invalid input.Please enter an integer from 1 to 3999.");
        } else {
            int thousands = number / 1000;
            int hundreds = (number % 1000) / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            String romanNumeral = "";
            if (thousands == 1) {
                romanNumeral += "M";
            } else if (thousands == 2) {
                romanNumeral += "MM";
            } else if (thousands == 3) {
                romanNumeral += "MMM";
            }
            if (hundreds == 9) {
                romanNumeral += "CM";
            } else if (hundreds >= 5) {
                romanNumeral += "D";
                if (hundreds == 6) {
                    romanNumeral += "C";
                } else if (hundreds == 7) {
                    romanNumeral += "CC";
                } else if (hundreds == 8) {
                    romanNumeral += "CCC";
                }
            } else if (hundreds == 4) {
                romanNumeral += "CD";
            } else if (hundreds == 3) {
                romanNumeral += "CCC";
            } else if (hundreds == 2) {
                romanNumeral += "CC";
            } else if (hundreds == 1) {
                romanNumeral += "C";
            }
            if (tens == 9) {
                romanNumeral += "XC";
            } else if (tens >= 5) {
                romanNumeral += "L";
                if (tens == 6) {
                    romanNumeral += "X";
                } else if (tens == 7) {
                    romanNumeral += "XX";
                } else if (tens == 8) {
                    romanNumeral += "XXX";
                }
            } else if (tens == 4) {
                romanNumeral += "XL";
            } else if (tens == 3) {
                romanNumeral += "XXX";
            } else if (tens == 2) {
                romanNumeral += "XX";
            } else if (tens == 1) {
                romanNumeral += "X";
            }
            if (ones == 9) {
                romanNumeral += "IX";
            } else if (ones >= 5) {
                romanNumeral += "V";
                if (ones == 6) {
                    romanNumeral += "I";
                } else if (ones == 7) {
                    romanNumeral += "II";
                } else if (ones == 8) {
                    romanNumeral += "III";
                }
            } else if (ones == 4) {
                romanNumeral += "IV";
            } else if (ones == 3) {
                romanNumeral += "III";
            } else if (ones == 2) {
                romanNumeral += "II";
            } else if (ones == 1) {
                romanNumeral += "I";
            }
            System.out.println(number + " in Roman numerals is: " + romanNumeral);

        }
        input.close();
    }

}
