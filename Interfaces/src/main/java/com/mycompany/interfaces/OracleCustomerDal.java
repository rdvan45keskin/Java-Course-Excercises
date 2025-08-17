package com.mycompany.interfaces;
public class OracleCustomerDal implements ıCustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
    
}
