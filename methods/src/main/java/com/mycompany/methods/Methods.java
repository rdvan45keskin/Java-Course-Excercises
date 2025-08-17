/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methods;

/**
 *
 * @author Rıdvan Keskin
 */
public class Methods {

    public static void main(String[] args) {
         sayiBulmaca();
         
    }
    public static void sayiBulmaca(){
            int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak = 20;
        boolean varMi=false;
                
        for(int sayi : sayilar){
        if(sayi==aranacak){
        varMi=true;
        break;
        }
        }        
    if(varMi){
        mesajVer("sayi vardir :"+aranacak);
    }else{
        mesajVer("sayi yoktur :"+aranacak);}
    }
    public static void mesajVer(String mesaj){
    System.out.println(mesaj);   
    }


}

