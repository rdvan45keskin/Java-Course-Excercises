/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.haftaningunleri;

/**
 *
 * @author Rıdvan Keskin
 */
public class HaftaninGunleri {

    public static void main(String[] args) {
       int gun = 6;
        switch (gun) {
            case 1:
                System.out.println("bugün pazartesi");
                break;
            case 2:
                System.out.println("bugün salı");
                break;
            case 3:
                System.out.println("bugün carsamba");
                break;
            case 4:
                System.out.println("bugün persembe");
                break;
            case 5:
                System.out.println("bugün cuma");
                break;
            case 6:
                System.out.println("bugün cumartesi");
                break;
            case 7:
                System.out.println("bugün pazar");
                break;
            default:
                System.out.println("hata");
                break;
/*
                int gun = 3;
                switch (gun) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("hafta ici");
                        break;
                    case 6:
                    case 7:
                        System.out.println("hafta sonu");
                        break;
                    default:
                        System.out.println("hata");
                        break;
                }

        }
*/
    }

