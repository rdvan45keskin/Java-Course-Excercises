/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recapdemo_classes;

import java.util.Arrays;

/**
 *
 * @author Rıdvan Keskin
 */
public class ReCapDemo_Classes {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 =dortIslem.Topla(3, 4);
        
        int sonuc2 =dortIslem.Cıkar(3, 4);
        
        int sonuc3 =dortIslem.Carp(3, 4);
        
        int sonuc4 =dortIslem.Bol(3, 4);
        
        
        int[] Sonuclar = new int[]{sonuc1,sonuc2,sonuc3,sonuc4};
        System.out.println(Arrays.toString(Sonuclar));
    }
}
