/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sayibulma;

/**
 *
 * @author Rıdvan Keskin
 */
public class SayiBulma {

    public static void main(String[] args) {
        /*    int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 8;
        
        boolean varMi=false;
        
        for (int sayi : sayilar) {
         if(sayi==aranacak){
         varMi = true;
         break;
         }
        }
 if(varMi){
 System.out.println("sayi mevcuttur");}
 else{
 System.out.println("sayı mevcut değildir");}
         */
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 8;
        boolean doğru=false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                doğru=true;
            }

        }
    if(doğru){
        System.out.println("sayı vardır");
    }else{
        System.out.println("sayı yoktur");}
    
    }
}
