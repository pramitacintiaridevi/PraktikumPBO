package com.Cintia.Pertemuan3.Praktikum.Komposisi;

public class CPU {

    // Attributes
    private String processor;
    private String GPU;
    private String RAM;

    // Constructor
    public CPU(String processor, String GPU, String RAM) {
        this.processor = processor;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t: " + GPU);
        System.out.println("- RAM\t: " + RAM);
        System.out.println();
    }
}
