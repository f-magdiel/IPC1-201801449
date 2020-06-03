package org.magdielasicona.juego;

import java.util.Scanner;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tablero {

    private static Tablero instanciaTablero;

    public static Tablero getInstancia() {
        if (instanciaTablero == null) {
            instanciaTablero = new Tablero();
        }
        return instanciaTablero;
    }
    //Variables
    private String[][] tableroPrincipal = new String[10][10];
    private String[] coordenada;
    private String[] cadenacoordenada;
    private int x;
    private int y;
    private int portaavion = 1;
    private int submarino = 3;
    private int destructor = 3;
    private int fragata = 2;
    private int easter = 1;

    private String posicionbarcos;

    Scanner entradaopcion = new Scanner(System.in);

    public void creandoTablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroPrincipal[i][j] = " ";

            }
        }

        //Imprimiendo el Tablero Vacio
        System.out.println("******************TABLERO VACIO*******************");
        for (int i = 0; i < 10; i++) {
            System.out.print("    " + i + "");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {

                System.out.print("| " + tableroPrincipal[i][j] + " |");

            }
            System.out.println("");
        }

    }

    public void asignarBarcos() {
        int opcioninsertar;
        do {
            System.out.println("");
            System.out.println("************BARCOS DISPONIBLES*************");
            System.out.println("*      1. INSERTAR PORTAAVION = " + portaavion + "         *");
            System.out.println("*      2. INSERTAR SUBMARINO  = " + submarino + "         *");
            System.out.println("*      3. INSERTAR DESTRUCTOR = " + destructor + "         *");
            System.out.println("*      4. INSERTAR FRAGATA    = " + fragata + "         *");
            System.out.println("*      5. INSERTAR EASTER EGG = " + easter + "         *");
            System.out.println("*      6. SALIR AL SUBMENU                *");
            System.out.println("*******************************************");
            System.out.println("");

            opcioninsertar = entradaopcion.nextInt();

            switch (opcioninsertar) {
                case 1:
                    if (opcioninsertar == 1) {
                        portaavion = portaavion - 1;

                        posicionPortaavion();
                    }

                    break;
                case 2:
                    System.out.println("Opcion 1");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

                default:
                    System.out.println("INGRESE UNA DE LAS OPCIONES DISPONIBLES!!!!!");
                    break;
            }

            //for tablero lleno
        } while (0 < opcioninsertar && opcioninsertar > 6);

    }

    public void posicionPortaavion() {
        System.out.print("INGRESE LA POSICION DEL PORTAAVION: ");
        posicionbarcos = entradaopcion.next();
        
        String cadena = "";
        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            System.out.println(cadenacoordenada[i]);

        }
       

    }
}
