public class PartA { 
    public static void main(String[] args) {
        double percentLeft = 100.0;
        int totalYears = 0;
        while (percentLeft > 1.0) {
            percentLeft = percentLeft / 2.0;
            totalYears = totalYears + 30;
        }
        System.out.println("It takes " + totalYears + " years before 99% of the original cesium is gone");
        System.out.printf("After " + totalYears + " years, there will be %.2f%% of the original cesium left.", percentLeft);
    }
}

