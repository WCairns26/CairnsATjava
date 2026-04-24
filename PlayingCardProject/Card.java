public class Card {
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    private Suit suit;
    private Rank rank;
    public Card() {
        int suitNumber = (int) (Math.random() * 4);
        int rankNumber = (int) (Math.random() * 13);
        if (suitNumber == 0) {
            suit = Suit.SPADE;
        } else if (suitNumber == 1) {
            suit = Suit.HEART;
        } else if (suitNumber == 2) {
            suit = Suit.CLUB;
        } else {
            suit = Suit.DIAMOND;
        }
        if (rankNumber == 0) {
            rank = Rank.TWO;
        } else if (rankNumber == 1) {
            rank = Rank.THREE;
        } else if (rankNumber == 2) {
            rank = Rank.FOUR;
        } else if (rankNumber == 3) {
            rank = Rank.FIVE;
        } else if (rankNumber == 4) {
            rank = Rank.SIX;
        } else if (rankNumber == 5) {
            rank = Rank.SEVEN;
        } else if (rankNumber == 6) {
            rank = Rank.EIGHT;
        } else if (rankNumber == 7) {
            rank = Rank.NINE;
        } else if (rankNumber == 8) {
            rank = Rank.TEN;
        } else if (rankNumber == 9) {
            rank = Rank.JACK;
        } else if (rankNumber == 10) {
            rank = Rank.QUEEN;
        } else if (rankNumber == 11) {
            rank = Rank.KING;
        } else {
            rank = Rank.ACE;
        }
    }
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public String getFace() {
        char suitChar;
        char rankChar;
        if (suit == Suit.SPADE) {
            suitChar = '\u2660';
        } else if (suit == Suit.HEART) {
            suitChar = '\u2661';
        } else if (suit == Suit.CLUB) {
            suitChar = '\u2663';
        } else {
            suitChar = '\u2662';
        }
        if (rank == Rank.TWO) {
            rankChar = '2';
        } else if (rank == Rank.THREE) {
            rankChar = '3';
        } else if (rank == Rank.FOUR) {
            rankChar = '4';
        } else if (rank == Rank.FIVE) {
            rankChar = '5';
        } else if (rank == Rank.SIX) {
            rankChar = '6';
        } else if (rank == Rank.SEVEN) {
            rankChar = '7';
        } else if (rank == Rank.EIGHT) {
            rankChar = '8';
        } else if (rank == Rank.NINE) {
            rankChar = '9';
        } else if (rank == Rank.TEN) {
            rankChar = 'T';
        } else if (rank == Rank.JACK) {
            rankChar = 'J';
        } else if (rank == Rank.QUEEN) {
            rankChar = 'Q';
        } else if (rank == Rank.KING) {
            rankChar = 'K';
        } else {
            rankChar = 'A';
        }
        return "" + suitChar + rankChar;
    }
    public static void main(String[] args) {
        Card card1 = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("The following card should be the queen of hearts,");
        System.out.println(card1.getFace());
        System.out.println("10 random cards...");
        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println(randomCard.getFace());
        }
    }
}