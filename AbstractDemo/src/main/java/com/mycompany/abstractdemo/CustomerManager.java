package com.mycompany.abstractdemo;
public class CustomerManager {
    
    BaseDatabaseManager databaseManager;
    
    public void getCustomers(){
        databaseManager.getData();
    }
}
