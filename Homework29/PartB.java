public class PartB {
    public static void main(String[] args) {
        Employee Ed = new Employee("Ed", 50000);
        Manager Deidra = new Manager("Deidra", 65000, 7500);
        System.out.printf("%s : salary = $ %,.2f; annual income = $ %,.2f%n",
                Ed.getName(), Ed.getSalary(), Ed.getAnnualIncome());
        System.out.printf("%s : salary = $ %,.2f; annual income = $ %,.2f%n",
                Deidra.getName(), Deidra.getSalary(), Deidra.getAnnualIncome());
    }
}