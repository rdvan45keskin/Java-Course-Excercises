package com.mycompany.overriding;
public class KonutKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.50;
    }
}
