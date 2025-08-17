//bizim çalışanımız
package com.mycompany.interfacedemo;
public class Worker implements IWorkable,IEatable,IPayable{

    @Override
    public void work() {
        System.out.println("İşçi Çalıştı");
    }

    @Override
    public void eat() {
        System.out.println("İşçi yedi");
    }

    @Override
    public void pay() {
        System.out.println("İşçi para aldı");
    }
    
}
