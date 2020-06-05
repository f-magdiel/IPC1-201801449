package org.magdielasicona.juego;

import org.magdielasicona.principal.SubMenu;
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
    public static String[][] tableroPrincipal = new String[10][10];
    public static String[] coordenadaGuardada = new String[20];/////AQUI ME Quede

    private int coordenada[] = new int[4];

    private int x;
    private int contador = 0;
    private int portaavion = 1;
    private int submarino = 3;
    private int destructor = 3;
    private int fragata = 2;
    private int easter = 1;
    private int tamañoCoordenada = 0;

    public static int aP;
    public static int bP;
    public static int cP;
    public static int dP;

    public static int aS;
    public static int bS;
    public static int cS;
    public static int dS;

    public static int aD;
    public static int bD;
    public static int cD;
    public static int dD;

    public static int aF;
    public static int bF;

    public static int aE;
    public static int bE;

    public int getTamaño() {
        return tamañoCoordenada;
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
                    try {
                    if (portaavion == 0) {
                        reemplezadorPortaavion();
                        System.out.println("SE REEMPLAZARÁ EL PORTAAVION!!!!!!");

                        portaavion = 0;
                        posicionPortaavion();
                        asignarBarcos();
                    } else {
                        portaavion = portaavion - 1;
                        posicionPortaavion();
                        asignarBarcos();

                    }
                } catch (Exception e) {
                    System.out.println("ERROR, COORDENADA FUERA DE RANGO!!!!");
                    portaavion = 1;
                    asignarBarcos();

                }

                break;
                case 2:
                    try {
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
                } catch (Exception e) {
                    System.out.println("ERROR, COORDENADA FUERA DE RANGO!!!!");
                    submarino = 3;
                    asignarBarcos();

                }

                break;
                case 3:
                    try {
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
                } catch (Exception e) {
                    System.out.println("ERROR, COORDENADA FUERA DE RANGO!!!!");
                    destructor = 3;
                    asignarBarcos();

                }

                break;
                case 4:
                    try {
                    if (fragata == 0) {
                        System.out.println("ERROR, YA SE INSERTARON TODAS LAS FRAGATAS!!!!!");
                        fragata = 0;
                        asignarBarcos();

                    } else {
                        fragata = fragata - 1;
                        asignarFragata();
                        asignarBarcos();
                    }
                } catch (Exception e) {
                    System.out.println("ERROR, COORDENADA FUERA DE RANGO!!!!");
                    fragata = 2;
                    asignarBarcos();

                }

                break;
                case 5:
                    
                    try {
                    if (easter == 0) {
                        reemplezarEgg();
                        System.out.println("SE REEMPLAZARA EL EASTER EGG!!!!!!");
                        easter = 0;
                        asignarEaster();
                        asignarBarcos();

                    } else {
                        easter = easter - 1;
                        asignarEaster();
                        asignarBarcos();
                    }
                } catch (Exception e) {
                    System.out.println("ERROR, COORDENADA FUERA DE RANGO!!!!");
                    easter = 1;
                    asignarBarcos();

                }

                break;
                case 6:

                    SubMenu.getInstancia().crearTablero();

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

        aP = coordenada[0];
        bP = coordenada[1];
        cP = coordenada[2];
        dP = coordenada[3];

        //Horizontal 
        if (aP == cP) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aP][bP]) {
                        for (int k = bP; k <= dP; k++) {

                            tableroPrincipal[aP][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (bP == dP) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aP][bP]) {
                        for (int k = aP; k <= cP; k++) {
                            tableroPrincipal[k][bP] = "O";
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

        aS = coordenada[0];
        bS = coordenada[1];
        cS = coordenada[2];
        dS = coordenada[3];

        //Horizontal 
        if (aS == cS) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aS][bS]) {
                        for (int k = bS; k <= dS; k++) {

                            tableroPrincipal[aS][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (bS == dS) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aS][bS]) {
                        for (int k = aS; k <= cS; k++) {
                            tableroPrincipal[k][bS] = "O";
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

        aD = coordenada[0];
        bD = coordenada[1];
        cD = coordenada[2];
        dD = coordenada[3];

        //Horizontal 
        if (aD == cD) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aD][bD]) {
                        for (int k = bD; k <= dD; k++) {

                            tableroPrincipal[aD][k] = "O";
                        }

                    }
                }
            }
            //Vertical
        } else if (bD == dD) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aD][bD]) {
                        for (int k = aD; k <= cD; k++) {
                            tableroPrincipal[k][bD] = "O";
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
        System.out.print("INGRESE LA POSICION DEL FRAGATA (a,b)-(c,d): ");
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

        aF = coordenada[0];
        bF = coordenada[1];

        //Solo es una coordenada
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tableroPrincipal[i][j] == tableroPrincipal[aF][bF]) {
                    tableroPrincipal[aF][bF] = "O";
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

        String pos[];
        String[] cadenacoordenada;
        System.out.print("INGRESE LA POSICION DEL EASTER EGG (a,b)-(c,d): ");
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

        aE = coordenada[0];
        bE = coordenada[1];

        //Solo es una coordenada
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tableroPrincipal[i][j] == tableroPrincipal[aE][bE]) {
                    tableroPrincipal[aE][bE] = "$";
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

    public static String quitarParentesis(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);

        }
        return aux;

    }

    public void reemplezadorPortaavion() {
        aP = coordenada[0];
        bP = coordenada[1];
        cP = coordenada[2];
        dP = coordenada[3];
        //Horizontal 
        if (aP == cP) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aP][bP]) {
                        for (int k = bP; k <= dP; k++) {

                            tableroPrincipal[aP][k] = " ";
                        }

                    }
                }
            }
            //Vertical
        } else if (bP == dP) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tableroPrincipal[i][j] == tableroPrincipal[aP][bP]) {
                        for (int k = aP; k <= cP; k++) {
                            tableroPrincipal[k][bP] = " ";
                        }
                    }
                }
            }
            //Coordenda fuera de rango
        } else {
            System.out.println("INGRESE UNA COORDENADA VÁLIDA!!!!!");
        }
    }

    public void reemplezarEgg() {
        aE = coordenada[0];
        bE = coordenada[1];

        //Solo es una coordenada
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tableroPrincipal[i][j] == tableroPrincipal[aE][bE]) {
                    tableroPrincipal[aE][bE] = " ";
                    break;
                }
            }
        }
    }

    public String[][] getTableroPrincipal() {
        return tableroPrincipal;
    }

    public void setTableroPrincipal(String[][] tableroPrincipal) {
        this.tableroPrincipal = tableroPrincipal;
    }

    public int getPortaavion() {
        return portaavion;
    }

    public void setPortaavion(int portaavion) {
        this.portaavion = portaavion;
    }

    public int getSubmarino() {
        return submarino;
    }

    public void setSubmarino(int submarino) {
        this.submarino = submarino;
    }

    public int getDestructor() {
        return destructor;
    }

    public void setDestructor(int destructor) {
        this.destructor = destructor;
    }

    public int getFragata() {
        return fragata;
    }

    public void setFragata(int fragata) {
        this.fragata = fragata;
    }

    public int getEaster() {
        return easter;
    }

    public void setEaster(int easter) {
        this.easter = easter;
    }

}
