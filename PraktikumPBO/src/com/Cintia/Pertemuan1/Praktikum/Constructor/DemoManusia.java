package com.Cintia.Pertemuan1.Praktikum.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new  Manusia[3];

        Manusia manusia1 = new Manusia(); // construktur pertama
        manusia1.setNama("devi");
        manusia1.setUmur(20);

        Manusia manusia2 = new Manusia("safril", 15); //construktur kedua
        Manusia manusia3 = new Manusia("resita",21);//construktur ketiga


        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Character ");
            System.out.println(" Nama\t: "+x.getNama());
            System.out.println("Umur\t:"+ x.getUmur());
        }
    }
}
