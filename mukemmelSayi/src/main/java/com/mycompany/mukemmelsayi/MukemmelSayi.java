/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mukemmelsayi;

/**
 *
 * @author Rıdvan Keskin
 */
public class MukemmelSayi {

    public static void main(String[] args) {
        int sayi = 28;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("mükemmel sayıdır");
        } else {
            System.out.println("mükemmel sayı değildir");
        }
    }

}
