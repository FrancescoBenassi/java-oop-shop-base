package org.lessons.java.shop;

public class Prodotto {

    int code;
    String name;
    String description;
    int price;
    int iva;
        
    public Prodotto(String name, String description, int price, int iva){
        double doubleRandomNumber = Math.random() * 1000;
        this.code = (int)doubleRandomNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


}
