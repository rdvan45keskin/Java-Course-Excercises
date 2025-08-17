package com.mycompany.staticdemo;
public class ProductManager {
    public void add(Product product){
        ProductValidator Validator = new ProductValidator();
        if(Validator.isValid(product)){
            System.out.println("Eklendi...");
        }else{
            System.out.println("Eklenemedi");
        }
    }
}
