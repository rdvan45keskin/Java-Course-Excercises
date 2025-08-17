/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Rıdvan Keskin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        int number = 8;
        boolean asal = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                asal = false;
            }
        }

        if (asal) {
            System.out.println("asaldır");
        } else {
            System.out.println("asal değildir");

        }
    }
}
