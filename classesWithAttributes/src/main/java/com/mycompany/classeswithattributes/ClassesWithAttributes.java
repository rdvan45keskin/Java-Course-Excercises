/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.classeswithattributes;

/**
 *
 * @author Rıdvan Keskin
 */
public class ClassesWithAttributes {

    public static void main(String[] args) {
        Product product = new Product(1,"laptop","monster laptop",25000,5);
//        Product.setName("laptop");
//        product.setId(1);
//        product.setDescription("monster laptop");
//        product.setPrice(25000);
//        product.setStockAmount(5)


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
