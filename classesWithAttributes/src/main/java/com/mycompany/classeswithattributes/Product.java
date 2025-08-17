/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeswithattributes;

/**
 *
 * @author Rıdvan Keskin
 */
public class Product {
public Product(int id, String name, String description ,double price, int stockAmount){
    System.out.println("yapıcı blok calıştı");
}    



//attribute | field

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    //getter 

    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the kod
     */
    public String getKod() {
      return this.name.substring(0,1) + id;
    }

}
