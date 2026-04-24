import java.util.ArrayList;
import java.util.Scanner;
public class Blackjack {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
        }
    }
    public static int getScore(ArrayList<Card2> hand) {
        int score = 0;
        int aceCount = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card2 current = hand.get(i);
            score = score + current.getBlackjackValue();
            if (current.getRank() == Card2.Rank.ACE) {
                aceCount++;
            }
        }
        while (score > 21 && aceCount > 0) {
            score = score - 10;
            aceCount--;
        }
        return score;
    }
    public static void printDealerHand(ArrayList<Card2> dealerHand, boolean hideSecondCard) {
        System.out.print("Dealer: ");
        for (int i = 0; i < dealerHand.size(); i++) {
            if (i == 1 && hideSecondCard) {
                System.out.print("##");
            } else {
                System.out.print(dealerHand.get(i).getFace());
            }
            if (i < dealerHand.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void printPlayerHand(ArrayList<Card2> playerHand) {
        System.out.print("Player: ");
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.print(playerHand.get(i).getFace());
            if (i < playerHand.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void printHands(ArrayList<Card2> dealerHand, ArrayList<Card2> playerHand, boolean hideSecondCard) {
        printDealerHand(dealerHand, hideSecondCard);
        printPlayerHand(playerHand);
    }
    public static boolean hasBlackjack(ArrayList<Card2> hand) {
        return hand.size() == 2 && getScore(hand) == 21;
    }
    public static void playHand(Scanner in) {
        ArrayList<Card2> dealerHand = new ArrayList<Card2>();
        ArrayList<Card2> playerHand = new ArrayList<Card2>();
        dealerHand.add(new Card2());
        dealerHand.add(new Card2());
        playerHand.add(new Card2());
        playerHand.add(new Card2());
        clearScreen();
        printHands(dealerHand, playerHand, true);
        System.out.println();
        boolean dealerBlackjack = hasBlackjack(dealerHand);
        boolean playerBlackjack = hasBlackjack(playerHand);
        if (dealerBlackjack && !playerBlackjack) {
            clearScreen();
            printHands(dealerHand, playerHand, false);
            System.out.println("Dealer drew 21. You lose.");
            return;
        } else if (!dealerBlackjack && playerBlackjack) {
            clearScreen();
            printHands(dealerHand, playerHand, false);
            System.out.println("You drew 21. You win.");
            return;
        } else if (dealerBlackjack && playerBlackjack) {
            clearScreen();
            printHands(dealerHand, playerHand, false);
            System.out.println("Draw. No winner.");
            return;
        }
        while (true) {
            System.out.print("Enter H to hit or S to stand: ");
            String choice = in.nextLine().toUpperCase();
            if (choice.equals("H")) {
                playerHand.add(new Card2());
                clearScreen();
                printHands(dealerHand, playerHand, true);
                System.out.println();
                if (getScore(playerHand) > 21) {
                    System.out.println("Player busts. Dealer wins.");
                    return;
                }
            } else if (choice.equals("S")) {
                break;
            }
        }
        clearScreen();
        printHands(dealerHand, playerHand, false);
        System.out.println();
        delay(500);
        while (getScore(dealerHand) < 17) {
            dealerHand.add(new Card2());
            clearScreen();
            printHands(dealerHand, playerHand, false);
            System.out.println();
            delay(500);
        }
        int dealerScore = getScore(dealerHand);
        int playerScore = getScore(playerHand);
        if (dealerScore > 21) {
            System.out.println("Dealer busts. You win.");
        } else if (playerScore > dealerScore) {
            System.out.println("Your score is higher than the dealer's score. You win.");
        } else if (dealerScore > playerScore) {
            System.out.println("Dealer's score is higher than your score. You lose.");
        } else {
            System.out.println("Draw. No winner.");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            playHand(in);
            System.out.println();
            System.out.print("Enter P to play again or Q to quit: ");
            String choice = in.nextLine().toUpperCase();
            if (choice.equals("Q")) {
                break;
            }
        }
        in.close();
    }
}