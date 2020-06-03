package ipc1_ht1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class IPC1_HT1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random Alumnos = new Random();
        int seccionB = Alumnos.nextInt(16);
        int seccionA = Alumnos.nextInt(16);
        
        System.out.println("--------Secciones Disponibles----------\nSeccion: A \nSeccion: B\n---------------------------------------");
        System.out.println("Seleccionar sección deseada: A ó B");
        String seccion = entrada.next();

        if (seccion.equals("A")) {
            if (seccionA < 15) {
                System.out.println("Asignacion Exitosa!!!");
                System.out.println("Cantidad de Alumnos asignados: " + seccionA);
            } else {
                System.out.println("La sección esta llena, Intente asignarse en otra sección.");
                System.out.println("Cantidad de Alumnos asignados: " + seccionA);
                if (seccionA == 15 && seccionB == 15) {
                    System.out.println("Ambas Secciones estan Llenas!!!!!!!");
                }
            }
        } else if (seccion.equals("B")) {
            if (seccionB < 15) {
                System.out.println("Asignacion Exitosa!!!");
                System.out.println("Cantidad de Alumnos asignados: " + seccionB);
            } else {
                System.out.println("La sección esta llena, Intente asignarse en otra sección.");
                System.out.println("Cantidad de Alumnos asignados: " + seccionB);
                if (seccionA == 15 && seccionB == 15) {
                    System.out.println("Ambas Secciones estan Llenas!!!!!!!!");
                }
            }
        }

    }

}
