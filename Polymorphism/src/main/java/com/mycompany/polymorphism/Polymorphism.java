package com.mycompany.polymorphism;
public class Polymorphism {

    public static void main(String[] args) {
        /*BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabeseLogger()};
        for (BaseLogger logger:loggers){
            logger.Log("Log mesajı");
        }*/
    CustomerManager customerManager = new CustomerManager(new DatabeseLogger());
    customerManager.ekle();
    
    
    
    }
}
