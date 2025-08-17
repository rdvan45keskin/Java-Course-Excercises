/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miniprojeasalsayi;

/**
 *
 * @author Rıdvan Keskin
 */
public class MiniProjeAsalSayi {

    public static void main(String[] args) {
    int sayi = 22;
    int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
            sayac++;
            }
        }
        
        if(sayac==0){
        System.out.println("asaldır");}
        else{
        System.out.println("asal değildir");}
    }
}
//i değişkeni en küçük asal sayı olan 2 den başlayarak sayi değerine kadar
//tek tek döngüde denenip sayının bu değerlere bölmediği bakılır
//eğer bölünüyorsa sayı 1 artırılır
//eğer ki hiçbir sayı bölünmezse sayac değeri 0 kalır ve yazdırırken sayac değeri
//0 kalırsa o sayının asal olduğunu yazdırırız çünkü sayı hiçbir sayıya bölünmediği
//için sayac 0 kalmıştır.