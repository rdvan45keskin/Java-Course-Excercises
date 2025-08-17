/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arkadassayilar;

/**
 *
 * @author Rıdvan Keskin
 */
public class ArkadasSayilar {

    public static void main(String[] args) {
        int Sayi1 = 1184;
        int Sayi2 = 1210;
        int Bolum2 = 0;
        int Bolum1 = 0;

        for (int i = 1; i < Sayi1; i++) {
            if (Sayi1 % i == 0) {
                Bolum1 = Bolum1 + i;
        }
        }
        for (int k = 1; k < Sayi2; k++) {
            if (Sayi2 % k == 0) {
                Bolum2 = Bolum2 + k;
        }
        }
        
        System.out.println("1.sayının bölenlerinin toplamı " + Bolum1);
        System.out.println("2.sayının bölenlerinin toplamı " + Bolum2);
    
        if(Bolum1==Sayi2 && Bolum2==Sayi1){
        System.out.println("Sayılar arkadaştır");}
        else{
        System.out.println("sayılar arkadaş değildir");}
    }
}
