/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switchdemo;

/**
 *
 * @author Rıdvan Keskin
 */
public class SwitchDemo {

    public static void main(String[] args) {
      char grade = 'A';
      
      switch(grade){
          case 'A':
              System.out.println("Mükemmel : Geçtiniz");
              break;
          case 'B':
              System.out.println("Çokzel : Geçtiniz");
              break;
          case 'C':
              System.out.println("İyi : Geçtiniz");
              break;
          case 'D':
              System.out.println("Fena değil : Geçtiniz");
              break;
          case 'F':
              System.out.println("Maalesef Kaldınız");
              break;
              default:
              System.out.println("Geçersiz not girdiniz");
              break;
      
      }
    }
}
