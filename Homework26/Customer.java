public class Customer {
    private String companyName;
    private double totalSales;
    private int numberSales;
    private int regionCode;
    private int serialNumber;
    public static int lastSerialUsed = 0;
    public Customer(String name, int regionCode) {
        companyName = name;
        totalSales = 0;
        numberSales = 0;
        this.regionCode = regionCode;
        lastSerialUsed = lastSerialUsed + 1;
        serialNumber = lastSerialUsed;
    }
    public Customer(String name) {
        companyName = name;
        totalSales = 0;
        numberSales = 0;
        regionCode = 1;
        lastSerialUsed = lastSerialUsed + 1;
        serialNumber = lastSerialUsed;
    }
    public String getName() {
        return companyName;
    }
    public void setName(String new_name) {
        companyName = new_name;
    }
    public void setRegion(int new_region) {
        regionCode = new_region;
    }
    public int getRegion() {
        return regionCode;
    }
    public void addSale(double amount) {
        this.totalSales = this.totalSales + amount;
        this.numberSales = this.numberSales + 1;
    }
    public double getSales() {
        return totalSales;
    }
    public int getNumber() {
        return numberSales;
    }
    public double getAverage() {

        if (numberSales == 0) {
            return 0;
        }
        return totalSales / numberSales;
    }
    public int getSerial() {
        return serialNumber;
    }
    public static double getTaxRate(int regionCode) {
        if (regionCode == 1) {
            return 0.0;
        }
        else if (regionCode == 2) {
            return 0.055;
        }
        else if (regionCode == 3) {
            return 0.060;
        }
        else if (regionCode == 4) {
            return 0.0625;
        }
        else {
            return 0.0;
        }
    }
    public void clearSales() {
        totalSales = 0;
        numberSales = 0;
    }
}