/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recapdemo1;

/**
 *
 * @author Rıdvan Keskin
 */
public class RecapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 28;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;
        
        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        
        System.out.println("en büyük = "+enBuyuk);
    }
}
