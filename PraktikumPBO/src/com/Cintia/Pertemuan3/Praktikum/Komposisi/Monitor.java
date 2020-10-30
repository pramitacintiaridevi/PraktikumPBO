package com.Cintia.Pertemuan3.Praktikum.Komposisi;

public class Monitor {
    // Attributes
    private String brand;
    private String size;
    private String refreshRate;

    // Constructor
    public Monitor(String brand, String size, String refreshRate) {
        this.brand = brand;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Brand\t\t\t: " + brand);
        System.out.println("- Size\t\t\t: " + size);
        System.out.println("- Refresh Rate\t: " + refreshRate);
        System.out.println();
    }
}
