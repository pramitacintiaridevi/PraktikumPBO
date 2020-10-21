package com.Cintia.Pertemuan2.Tugas;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Baim");
        Club club3 = new Club("Adit", "Belum menjadi Juara di hatimu");
        Club club4 = new Club("Irpan", 2020, "Stadion yang besar");
        Club club5 = new Club("Dani", 2017, "Stadion Purbalingga", 01, "Pernah juara ternyata");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
