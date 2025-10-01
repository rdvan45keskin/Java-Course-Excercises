public class App {
    public static void main(String[] args) throws Exception {
        // ---Yöntem 1---
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

        // ---Yöntem 2---
        // CustomerManager customerManager = new CustomerManager(new SqlServerDatabaseManager());
        // customerManager.getCustomers();
    }
}
