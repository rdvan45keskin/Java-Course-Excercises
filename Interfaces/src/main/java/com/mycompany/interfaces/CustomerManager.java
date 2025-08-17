package com.mycompany.interfaces;
public class CustomerManager {
    private ıCustomerDal customerDal;
    public CustomerManager(ıCustomerDal ICDall){
    this.customerDal=ICDall;
    }
    public void add(){
        customerDal.add();
    }
}
