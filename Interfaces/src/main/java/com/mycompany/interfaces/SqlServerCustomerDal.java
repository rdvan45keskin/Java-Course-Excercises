package com.mycompany.interfaces;
public class SqlServerCustomerDal implements IRepository,ıCustomerDal{

    @Override
    public void add() {
        System.out.println("SqlServer Eklendi");
    }
    
}
