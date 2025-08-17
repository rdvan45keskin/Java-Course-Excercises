/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loopdemo;

/**
 *
 * @author Rıdvan Keskin
 */


public class LoopDemo {

public static void main(String[] args) {
    //for
    for(int i=2;i<=10;i+=2){
        System.out.println(i);

    }
    System.out.println("döngü bitti");

    //while
    int i=2;
    while(i<=10){
        System.out.println(i);
        i+=2;
    }
    System.out.println("while döngüsü bitti");

    //do while
    int k=1;
    do{
    System.out.println(k);
    k+=2;
    }while(k<10);
       System.out.println("do-while döngüsü bitti");
    
}
}

