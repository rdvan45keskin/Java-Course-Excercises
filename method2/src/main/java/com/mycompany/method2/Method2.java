/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.method2;

/**
 *
 * @author Rıdvan Keskin
 */
public class Method2 {

    public static void main(String[] args) {
         String mesaj ="bugün hava cok güzel.";
         String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
    int sayi = topla(5,7);
        System.out.println(sayi);
    double rakam = birlestir(2.8,7.2);
        System.out.println(rakam);
    int toplam = topla2(1,2,3,4,5,6,7,8,9,0);
        System.out.println(toplam);
    
    }
   
    public static void ekle(){
            System.out.println("eklendi");
    }

    public static void sil() {
    System.out.println("silindi");
    }

    public static void güncelle(){
    System.out.println("güncellendi");
    }
    
    public static int topla(int sayi1,int sayi2){
       return sayi1+sayi2;
    }

    public static String sehirVer(){
    return "ankara";
    }

    public static double birlestir(double a,double b){
    return(a+b);
    }

    public static int topla2(int... sayilar){
    int toplam=0;
        for(int sayi:sayilar){
    toplam+=sayi;
    }
    return toplam;
    }



}
