package com.mycompany.abstractdemo;
public class AbstractDemo {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SQLDatabaseManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.databaseManager = new MySQLDatabaseManager();
        customerManager.getCustomers();
    }
}
