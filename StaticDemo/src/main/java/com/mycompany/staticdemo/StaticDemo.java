package com.mycompany.staticdemo;
public class StaticDemo {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product=new Product();
        product.price=12;
        product.name="Kalem";
        manager.add(product);
    }
}
