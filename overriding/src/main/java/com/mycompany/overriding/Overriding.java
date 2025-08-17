package com.mycompany.overriding;
public class Overriding {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
            {new OgrenciKrediManager(),new TarimKrediManager(),new KonutKrediManager()};
    
        for (BaseKrediManager krediManager: krediManagers){
            double miktar=krediManager.hesapla(10000);
            System.out.println(krediManager.getClass().getSimpleName() + " kredisinin miktarı: " + miktar);
        }
    }
}
