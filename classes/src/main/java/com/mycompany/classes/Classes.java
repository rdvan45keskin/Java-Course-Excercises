/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classes;

/**
 *
 * @author Rıdvan Keskin
 */
public class Classes {

    public static void main(String[] args) {
        //referance type
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    

//value
    int sayi1 = 10;
    int sayi2 = 20;
    sayi2 = sayi1;
    sayi1 = 30;
    System.out.println(sayi2);

int[] sayilar1 = new int[] {1,2,3};
int[] sayilar2 = new int[] {4,5,6};
sayilar2 = sayilar1;
sayilar1[0]=10;
        System.out.println(sayilar2[0]);






    }
}
