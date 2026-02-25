public class Counter {
    private int count = 0;

    public int getValue() {
        return count;
    }

    public void count() {
        count = count + 1;
    }

    public void reset() {
        count = 0;
    }
}