package com.Cintia.Pertemuan1.Praktikum.Class;

public class Mahasiswa {
    String nama;
    int nim;

    public Mahasiswa() {}

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }
    public  void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
}
