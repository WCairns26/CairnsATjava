public class BaseballCard {
    String name;
    int year;
    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return "BaseballCard[name = " + name + ", year = " + year + "]";
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballCard)) {
            return false;
        }
        BaseballCard otherCard = (BaseballCard) obj;
        if (this.name.equals(otherCard.name) && this.year == otherCard.year) {
            return true;
        } else {
            return false;
        }
    }
}