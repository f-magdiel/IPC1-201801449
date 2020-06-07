/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea1;

import java.util.Scanner;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Main {

    public static void main(String[] args) {
        String name, carne;
        Scanner entrada = new Scanner(System.in);
        int seccionA = 4;
        int seccionB = 5;

        System.out.print("Ingrese la Seccion que desea Asignarse A ó B: ");
        String seccion = entrada.next();
        if (seccion.equals("A")) {
            if (seccionA < 5) {

                System.out.print("Nombre: ");
                name = entrada.next();
                System.out.print("Carne: ");
                carne = entrada.next();

                SeccionA alumno1 = new SeccionA("Magdiel", "201201444");
                SeccionA alumno2 = new SeccionA("Juan", "201301564");
                SeccionA alumno3 = new SeccionA("Pedro", "201201344");
                SeccionA alumno4 = new SeccionA("Oscar", "201101654");
                SeccionA alumno5 = new SeccionA(name, carne);
                
                System.out.println("Seccion A");
                alumno1.mostrarDatos();
                alumno2.mostrarDatos();
                alumno3.mostrarDatos();
                alumno4.mostrarDatos();
                alumno5.mostrarDatos();
                
                
                

            } else {
                System.out.println("Seccion Llena, Intente asignarse en otra seccion");
                if (seccionA == 5 && seccionB == 5) {
                    System.out.println("Ambas Secciones LLenas");
                }
            }
        } else if (seccion.equals("B")) {
            if (seccionB < 5) {
                System.out.print("Nombre: ");
                name = entrada.next();
                System.out.print("Carne: ");
                carne = entrada.next();
                SeccionB estudiante1 = new SeccionB("Marcela", "201801633");
                SeccionB estudiante2 = new SeccionB("Brando", "201501434");
                SeccionB estudiante3 = new SeccionB("Pablo", "201301532");
                SeccionB estudiante4 = new SeccionB("Dylan", "201301545");
                SeccionB estudiante5 = new SeccionB("Javier", "202801434");
                System.out.println("Seccion B");
                estudiante1.mostrarDatos();
                estudiante2.mostrarDatos();
                estudiante3.mostrarDatos();
                estudiante4.mostrarDatos();
                estudiante5.mostrarDatos();
            } else {
                System.out.println("Seccion Llena, Intente asignarse en otra seccion");
                System.out.println("");
                
                
                if (seccionA == 5 && seccionB == 5) {
                    System.out.println("Ambas Secciones LLenas");
                }
            }
        }

    }

}
