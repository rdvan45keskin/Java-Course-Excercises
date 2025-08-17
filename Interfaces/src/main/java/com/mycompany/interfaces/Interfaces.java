package com.mycompany.interfaces;
public class Interfaces {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
        
    }
}
