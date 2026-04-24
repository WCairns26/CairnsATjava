public class Card2 {
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    private Suit suit;
    private Rank rank;
    public Card2() {
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
    public Card2(Suit suit, Rank rank) {
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
        String rankString;
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
            rankString = "2";
        } else if (rank == Rank.THREE) {
            rankString = "3";
        } else if (rank == Rank.FOUR) {
            rankString = "4";
        } else if (rank == Rank.FIVE) {
            rankString = "5";
        } else if (rank == Rank.SIX) {
            rankString = "6";
        } else if (rank == Rank.SEVEN) {
            rankString = "7";
        } else if (rank == Rank.EIGHT) {
            rankString = "8";
        } else if (rank == Rank.NINE) {
            rankString = "9";
        } else if (rank == Rank.TEN) {
            rankString = "T";
        } else if (rank == Rank.JACK) {
            rankString = "J";
        } else if (rank == Rank.QUEEN) {
            rankString = "Q";
        } else if (rank == Rank.KING) {
            rankString = "K";
        } else {
            rankString = "A";
        }
        return "" + suitChar + rankString;
    }
    public int getBlackjackValue() {
        if (rank == Rank.TWO) {
            return 2;
        } else if (rank == Rank.THREE) {
            return 3;
        } else if (rank == Rank.FOUR) {
            return 4;
        } else if (rank == Rank.FIVE) {
            return 5;
        } else if (rank == Rank.SIX) {
            return 6;
        } else if (rank == Rank.SEVEN) {
            return 7;
        } else if (rank == Rank.EIGHT) {
            return 8;
        } else if (rank == Rank.NINE) {
            return 9;
        } else if (rank == Rank.TEN || rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING) {
            return 10;
        } else {
            return 11;
        }
    }
}