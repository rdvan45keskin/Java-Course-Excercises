import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(2,"Gülcan","Keskin"));
        customers.add(new Customer(1,"Rıdvan","Keskin"));
        customers.add(new Customer(2,"Eğlence","Keskin"));
        customers.add(new Customer(2,"Ünsal","Keskin"));
        
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
