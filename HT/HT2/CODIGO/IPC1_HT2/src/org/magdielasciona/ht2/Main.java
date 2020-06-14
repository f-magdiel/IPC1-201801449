package org.magdielasciona.ht2;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Main {

    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Rony", "Shire", 4);
        Caballo caballo2 = new Caballo("Aldo", "Cuarto de Milla", 5);

        Avion avion1 = new Avion(3, "Latam", "B89");
        Avion avion2 = new Avion(60, "Boeing", "A320");

        Coche auto1 = new Coche("Ford", 2010, "Camioneta");
        Coche auto2 = new Coche("Audi", 2015, "A6 allroad quattro.");

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
