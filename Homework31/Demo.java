public class Demo {
    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Will Cairns", 2008);
        BaseballCard card2 = new BaseballCard("Will Cairns", 2008);
        System.out.println(card1);
        System.out.println(card1.equals(card2));
    }
}
