//dışardan çalışanımız
package com.mycompany.interfacedemo;
public class OutsourceWorker implements IWorkable{

    @Override
    public void work() {
        System.out.println("Dış işçi çalıştı");
    }
    
}
