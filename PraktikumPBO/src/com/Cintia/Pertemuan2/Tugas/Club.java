package com.Cintia.Pertemuan2.Tugas;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahun, juara;

    //overloading club 1
    public Club() {
    }

    //overloading club 2
    public Club(String nama) {
        this.nama = nama;
    }

    //overloading club 3
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    //overloading club 4
    public Club(String nama, int tahun, String stadion) {
        this.nama = nama;
        this.tahun = tahun;
        this.stadion = stadion;
    }

    //overloading club 5
    public Club(String nama, int tahun, String stadion, int juara, String deskripsi) {
        this.nama = nama;
        this.tahun = tahun;
        this.stadion = stadion;
        this.juara = juara;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        if (nama == null){
            nama = "Langit";
        }
        if (stadion == null){
            stadion = "Gor Purwokerto";
        }
        if (deskripsi == null){
            deskripsi = "Juara lari dari kenyataan yang pedih";
        }
        if (tahun == 0){
            tahun = 2019;
        }
        if (juara == 0){
            juara = 1;
        }
        System.out.println("Nama          : " + nama);
        System.out.println("Juara         : " + juara);
        System.out.println("Deskripsi     : " + deskripsi);
        System.out.println("Tahun Berdiri : " + tahun);
        System.out.println("Stadion       : " + stadion);
        System.out.println();
    }
}
