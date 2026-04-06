public class Die { //PartC
    private int value;
    public Die() {
        value = 1;
    }
    public Die(int initValue) {
        value = initValue;
    }
    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }
    public int getValue() {
        return value;
    }
}