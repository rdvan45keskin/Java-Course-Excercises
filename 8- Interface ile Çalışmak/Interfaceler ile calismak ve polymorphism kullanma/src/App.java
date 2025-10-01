public class App {

    //classlar birden fazla interfaceyi implement edebilir
    //sadece 1 tane class extends edilebilir
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
