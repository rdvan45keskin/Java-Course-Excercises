/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.necapdemo2;

/**
 *
 * @author Rıdvan Keskin
 */
public class NeCapDemo2 {

    public static void main(String[] args) {
        double[] myList = {8.8, 2.1, 3.6, 7.9};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam = " + total);
        System.out.println("En buyuk = " + max);
    }
}
