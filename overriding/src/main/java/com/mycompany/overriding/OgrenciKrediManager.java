package com.mycompany.overriding;
public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.05;
    }
}
