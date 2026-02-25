import java.util.ArrayList;
public class CashRegister {
    private ArrayList<Double> items;
    public CashRegister() {
        items = new ArrayList<Double>();
    }
    public void addItem(double price) {
        items.add(price);
    }
    public void removeItem() {
        if (items.size() > 0) {
            items.remove(items.size() - 1);
        }
    }
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i);
        }
        return total;
    }
    public int getCount() {
        return items.size();
    }
    public void clear() {
        items.clear();
    }
}