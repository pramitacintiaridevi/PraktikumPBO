package com.Cintia.Pertemuan3.Praktikum.Asosiasi;

public class Mahasiswa {
    private int NIM;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(int NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
