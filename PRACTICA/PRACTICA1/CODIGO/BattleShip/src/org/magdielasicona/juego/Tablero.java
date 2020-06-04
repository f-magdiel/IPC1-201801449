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

    private int coordenada[] = new int[4];

    private int x;
    private int contador = 0;
    private int portaavion = 1;
    private int submarino = 3;
    private int destructor = 3;
    private int fragata = 2;
    private int easter = 1;
    private int tamaño;

    public int getTamaño() {
        return tamaño;
    }

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

                    if (portaavion == 0) {
                        System.out.println("SE REEMPLAZARÁ EL PORTAAVION!!!!!!");

                        portaavion = 0;
                        posicionPortaavion();
                        asignarBarcos();
                    } else {
                        portaavion = portaavion - 1;
                        posicionPortaavion();
                        asignarBarcos();

                    }

                    break;
                case 2:

                    if (submarino == 0) {
                        System.out.println("ERROR, YA SE INSERTARON TODOS LOS SUBMARINOS!!!!!");
                        submarino = 0;
                        asignarBarcos();
                        //Visualizar tablero

                    } else {
                        submarino = submarino - 1;
                        asignarSubmarino();
                        asignarBarcos();
                    }

                    break;
                case 3:

                    if (destructor == 0) {
                        System.out.println("ERROR, YA SE INSERTARON TODOS LOS DESTRUCTORES!!!!!");
                        destructor = 0;
                        asignarBarcos();
                        //Visualizar tablero
                    } else {
                        destructor = destructor - 1;
                        asignarDestructor();
                        asignarBarcos();
                    }
                    break;
                case 4:
                    if (fragata == 0) {
                        System.out.println("ERROR, YA SE INSERTARON TODOS LOS DESTRUCTORES!!!!!");
                        fragata = 0;
                        asignarBarcos();

                    } else {
                        fragata = fragata - 1;
                        asignarFragata();
                        asignarBarcos();
                    }
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
        String pos[];
        String[] cadenacoordenada;
        System.out.print("INGRESE LA POSICION DEL PORTAAVION (a,b)-(c,d): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }

        int a, b, c, d;
        a = coordenada[0];
        b = coordenada[1];
        c = coordenada[2];
        d = coordenada[3];

        //Horizontal 
        if (a == c) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = b; k <= d; k++) {

                            tableroPrincipal[a][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (b == d) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = a; k <= c; k++) {
                            tableroPrincipal[k][b] = "O";
                        }
                    }
                }
            }
            //Coordenda fuera de rango
        } else {
            System.out.println("INGRESE UNA COORDENADA VÁLIDA!!!!!");
        }

        System.out.println("******************TABLERO LLENADO*******************");
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

    public void asignarSubmarino() {
        String pos[];
        String[] cadenacoordenada;
        System.out.print("INGRESE LA POSICION DEL SUBMARINO (a,b)-(c,d): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }

        int a, b, c, d;
        a = coordenada[0];
        b = coordenada[1];
        c = coordenada[2];
        d = coordenada[3];

        //Horizontal 
        if (a == c) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = b; k <= d; k++) {

                            tableroPrincipal[a][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (b == d) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = a; k <= c; k++) {
                            tableroPrincipal[k][b] = "O";
                        }
                    }
                }
            }
            //Coordenda fuera de rango
        } else {
            System.out.println("INGRESE UNA COORDENADA VÁLIDA!!!!!");
        }

        System.out.println("******************TABLERO LLENADO*******************");
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

    public void asignarDestructor() {
        String pos[];
        String[] cadenacoordenada;
        System.out.print("INGRESE LA POSICION DEL DESTRUCTOR (a,b)-(c,d): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }

        int a, b, c, d;
        a = coordenada[0];
        b = coordenada[1];
        c = coordenada[2];
        d = coordenada[3];

        //Horizontal 
        if (a == c) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = b; k <= d; k++) {

                            tableroPrincipal[a][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (b == d) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                        for (int k = a; k <= c; k++) {
                            tableroPrincipal[k][b] = "O";
                        }
                    }
                }
            }
            //Coordenda fuera de rango
        } else {
            System.out.println("INGRESE UNA COORDENADA VÁLIDA!!!!!");
        }

        System.out.println("******************TABLERO LLENADO*******************");
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

    public void asignarFragata() {

        String pos[];
        String[] cadenacoordenada;
        System.out.print("INGRESE LA POSICION DEL DESTRUCTOR (a,b)-(c,d): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }

        int a, b;
        a = coordenada[0];
        b = coordenada[1];

        //Solo es una coordenada
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tableroPrincipal[i][j] == tableroPrincipal[a][b]) {
                    tableroPrincipal[a][b] = "O";
                    break;
                }
            }
        }

        System.out.println("******************TABLERO LLENADO*******************");
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

    public void asignarEaster() {
    }

    public static String quitarParentesis(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);

        }
        return aux;

    }
}
