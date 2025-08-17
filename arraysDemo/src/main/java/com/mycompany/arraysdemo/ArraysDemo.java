/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arraysdemo;

/**
 *
 * @author Rıdvan Keskin
 */
public class ArraysDemo {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "engin";
        ogrenciler[1] = "derin";
        ogrenciler[2] = "salih";

        for (int i = 0; i < ogrenciler.length; i += 1) {
            System.out.println(ogrenciler[i]);
        }
    
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);}
    
    
    }
    

}
        
