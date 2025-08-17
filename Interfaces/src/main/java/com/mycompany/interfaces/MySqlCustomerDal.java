package com.mycompany.interfaces;
public class MySqlCustomerDal implements ıCustomerDal,IRepository {
    @Override
    public void add(){
        System.out.println("MySql Eklendi");
    }
}
