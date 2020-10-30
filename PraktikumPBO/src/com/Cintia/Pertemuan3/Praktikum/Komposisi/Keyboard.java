package com.Cintia.Pertemuan3.Praktikum.Komposisi;

public class Keyboard {

    // Attributes
    private String brand;
    private String type;

    // Constructor
    public Keyboard(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Brand\t: " + brand);
        System.out.println("- Type\t: " + type);
        System.out.println();
    }
}
