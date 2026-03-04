public class PartC {
    public static void main(String[] args) {
       Customer.lastSerialUsed = 100;
       Customer c1 = new Customer("Sal's Deli");
       c1.addSale(100);
       Customer c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());
   }
//What is the output of the following code and why?
//The output is:
//150.0
//150.0
//This is the output because since the program states "Customer c2 = c1;", both c1 and c2 now reference the same object, being "Customer". So, when "totalSales" goes from 100 to 150, both c1 and c2 are assigned the "totalSales" value.
}
