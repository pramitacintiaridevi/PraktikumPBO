package com.Cintia.Pertemuan3.Praktikum.Komposisi;

public class Mouse {

    // Attributes
    private String brand;
    private String dpi;

    // Constructor
    public Mouse(String brand, String dpi) {
        this.brand = brand;
        this.dpi = dpi;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Brand\t: " + brand);
        System.out.println("- DPI\t: " + dpi);
        System.out.println();
    }
}
