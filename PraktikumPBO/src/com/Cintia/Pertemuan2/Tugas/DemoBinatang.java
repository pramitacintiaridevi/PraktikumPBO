package com.Cintia.Pertemuan2.Tugas;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        Burung subclass = new Burung();
        Iwak subbclass = new Iwak();
        Kucing subclasss = new Kucing();

        System.out.println("Sifat - Sifat Binatang :\n");
        superclass.getNama("Babi hutan");
        System.out.println();
        subclass.getNama("Burung Puyuh");
        subclass.BuwungPuyoh();
        System.out.println();
        subbclass.getNama("Iwak Mas Koki");
        subbclass.IwakMas();
        System.out.println();
        subclasss.getNama("Oyen");
        subclasss.KucingGarong();
    }
}
