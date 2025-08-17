package com.mycompany.packagesdemo;
import com.mycompany.packagesdemo.Matematik.DortIslem;
import java.util.Scanner;
public class PackagesDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınız: ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+isim);
        
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(3, 5));
    }
}
