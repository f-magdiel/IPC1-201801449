package org.magdielasicona.juego;

import java.util.Scanner;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Partida {

    private static Partida instanciaPartida;
    private int contadorSesion = 0;
    public static String[] listaUsuario = new String[50];
    private String nombreUser;

    public static Partida getInstancia() {
        if (instanciaPartida == null) {
            instanciaPartida = new Partida();
        }
        return instanciaPartida;
    }
    Scanner entradaNombres = new Scanner(System.in);

    public void ingresoNombre() {

        System.out.print("INGRESE SU NICKNAME: ");
        nombreUser = entradaNombres.next();

        listaUsuario[contadorSesion] = nombreUser;
        contadorSesion++;
        for (int i = 0; i < 10; i++) {
            System.out.println(listaUsuario[i]);
        }

    }

}
