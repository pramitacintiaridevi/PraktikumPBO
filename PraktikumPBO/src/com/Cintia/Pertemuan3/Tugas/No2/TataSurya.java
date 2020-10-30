package com.Cintia.Pertemuan3.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class TataSurya {
    public static void main(String[] args) {

        SolarSystem sol = new SolarSystem("Sol", "Tata Surya");

        Planet planet1 = new Planet(101, 0, "Merkurius");
        Planet planet2 = new Planet(102, 1, "Venus");
        Planet planet3 = new Planet(103, 2, "Bumi");
        Planet planet4 = new Planet(104, 3, "Mars");
        Planet planet5 = new Planet(201, 4, "Jupiter");
        Planet planet6 = new Planet(202, 5, "Saturnus");
        Planet planet7 = new Planet(203, 6, "Uranus");
        Planet planet8 = new Planet(204, 7, "Neptunus");


        List<Planet> planets = new ArrayList<>();


        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);

        sol.setPlanets(planets);

        sol.getData();
    }
}
