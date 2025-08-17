/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sesliharfler;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author Rıdvan Keskin
 */
public class SesliHarfler {

    public static void main(String[] args) {
        char harf = 'U';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}
