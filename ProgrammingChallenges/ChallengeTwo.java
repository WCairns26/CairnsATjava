public class ChallengeTwo {
    public static void main(String[] args) {
        int dieOne = 0;
        int dieTwo = 1;
        while (dieOne != dieTwo) {
            dieOne = (int)(Math.random() * 6) + 1;
            dieTwo = (int)(Math.random() * 6) + 1;
            System.out.println("Die 1 rolled: " + dieOne);
            System.out.println("Die 2 rolled: " + dieTwo);
            System.out.println("----------------");
        }
    }
}