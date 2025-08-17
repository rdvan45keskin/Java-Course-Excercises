package com.mycompany.abstractclass;
public class AbstractClass {

    public static void main(String[] args) {
        WomanGamerCalculator womanGamerCalculator = new WomanGamerCalculator();
        womanGamerCalculator.gameOver();
        
        GameCalculator gameCalculator = new WomanGamerCalculator();
        gameCalculator.hesapla();
    }
}
