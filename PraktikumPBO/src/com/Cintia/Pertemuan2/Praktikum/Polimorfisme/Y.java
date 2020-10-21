package com.Cintia.Pertemuan2.Praktikum.Polimorfisme;

public class Y extends X {
    //overriding
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value Y\t: " + value);
    }
}
