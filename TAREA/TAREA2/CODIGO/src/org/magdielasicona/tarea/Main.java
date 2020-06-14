/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.tarea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Main {

    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Pony", "Pura Sangre", 5);
        Caballo caballo2 = new Caballo("Lisa", "Frosen", 5);

        Avion avion1 = new Avion(34, "Condor", "A3050");
        Avion avion2 = new Avion(2, "Sky", "BA89");

        Coche auto1 = new Coche("Ferrari", 2019, "Carrera");
        Coche auto2 = new Coche("Toyota", 2015, "Carga");

        caballo1.avanzar();
        caballo1.frenar();
        System.out.println("");
        caballo2.avanzar();
        caballo2.frenar();
        System.out.println("");
        avion1.avanzar();
        avion1.frenar();
        System.out.println("");
        avion2.avanzar();
        avion2.frenar();
        System.out.println("");
        auto1.avanzar();
        auto1.frenar();
        System.out.println("");
        auto2.avanzar();
        auto2.frenar();
        

    }
}
