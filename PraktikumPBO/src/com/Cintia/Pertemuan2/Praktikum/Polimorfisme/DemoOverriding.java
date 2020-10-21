package com.Cintia.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Tidur");
        subClass.getValue("Jajan");
    }
}
