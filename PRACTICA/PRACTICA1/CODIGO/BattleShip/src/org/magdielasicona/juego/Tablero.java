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
    public static String[] coordenadaGuardada = new String[50];/////AQUI ME Quede

    private int coordenada[] = new int[4];
    public int contadorCoordenada = 0;
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
        //Crando el tablero asignadno " " para cada vector
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroPrincipal[i][j] = "-";

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
                    correctorFueraPortaavion();
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
                    correctorFueraSubmarino();
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
                    correctorFueraDestructor();
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
            coordenadaGuardada[contadorCoordenada] = cadenacoordenada[i];
            contadorCoordenada++;

            cadena = quitarParentesis(cadenacoordenada[i]);

            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }
        contadorCoordenada++;
        coordenadaGuardada[contadorCoordenada] = " ";

        aP = coordenada[0];
        bP = coordenada[1];
        cP = coordenada[2];                     //Dar posicion original(en a,b,c,d)y no recorrer todo
        dP = coordenada[3];

        //Horizontal 
        if (aP == cP) {

            if (tableroPrincipal[aP][0] == "-") {
                if (tableroPrincipal[aP][1] == "-") {
                    if (tableroPrincipal[aP][2] == "-") {
                        if (tableroPrincipal[aP][3] == "-") {
                            for (int i = bP; i <= dP; i++) {
                                tableroPrincipal[aP][i] = "O";//Principal
                            }
                        } else {
                            portaavion = 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        portaavion = 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }

                } else {
                    portaavion = 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }
            } else {
                portaavion = 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
            }

            //Vertical
        } else if (bP == dP) {

            if (tableroPrincipal[bP][0] == "-") {
                if (tableroPrincipal[bP][1] == "-") {
                    if (tableroPrincipal[bP][2] == "-") {
                        if (tableroPrincipal[bP][3] == "-") {
                            for (int k = aP; k <= cP; k++) {
                                tableroPrincipal[k][bP] = "O";
                            }
                        } else {
                            portaavion = 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        portaavion = 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }
                } else {
                    portaavion = 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }

            } else {
                portaavion = 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
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
        int cont = 2;

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            coordenadaGuardada[contadorCoordenada] = cadenacoordenada[i];
            contadorCoordenada++;
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }
        contadorCoordenada++;
        coordenadaGuardada[contadorCoordenada] = " ";

        aS = coordenada[0];
        bS = coordenada[1];
        cS = coordenada[2];
        dS = coordenada[3];

        if (aS == cS) {

            if (tableroPrincipal[aS][0] == "-") {
                if (tableroPrincipal[aS][1] == "-") {
                    if (tableroPrincipal[aS][2] == "-") {
                        if (tableroPrincipal[aS][3] == "-") {
                            for (int i = bS; i <= dS; i++) {
                                tableroPrincipal[aS][i] = "O";//Principal
                            }
                        } else {
                            submarino = submarino + 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        submarino = submarino + 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }

                } else {
                    submarino = submarino + 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }
            } else {
                submarino = submarino + 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
            }

            //Vertical
        } else if (bS == dS) {

            if (tableroPrincipal[bS][0] == "-") {
                if (tableroPrincipal[bS][1] == "-") {
                    if (tableroPrincipal[bS][2] == "-") {
                        if (tableroPrincipal[bS][3] == "-") {
                            for (int k = aS; k <= cS; k++) {
                                tableroPrincipal[k][bS] = "O";
                            }
                        } else {
                            submarino = submarino + 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        submarino = submarino + 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }
                } else {
                    submarino = submarino + 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }

            } else {
                submarino = submarino + 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
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
            coordenadaGuardada[contadorCoordenada] = cadenacoordenada[i];
            contadorCoordenada++;
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }
        contadorCoordenada++;
        coordenadaGuardada[contadorCoordenada] = " ";

        aD = coordenada[0];
        bD = coordenada[1];
        cD = coordenada[2];
        dD = coordenada[3];

        //Horizontal 
        if (aD == cD) {

            if (tableroPrincipal[aD][0] == "-") {
                if (tableroPrincipal[aD][1] == "-") {
                    if (tableroPrincipal[aD][2] == "-") {
                        if (tableroPrincipal[aD][3] == "-") {
                            for (int i = bD; i <= dD; i++) {
                                tableroPrincipal[aD][i] = "O";//Principal
                            }
                        } else {
                            destructor = destructor + 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        destructor = destructor + 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }

                } else {
                    destructor = destructor + 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }
            } else {
                destructor = destructor + 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
            }

            //Vertical
        } else if (bD == dD) {

            if (tableroPrincipal[bD][0] == "-") {
                if (tableroPrincipal[bD][1] == "-") {
                    if (tableroPrincipal[bD][2] == "-") {
                        if (tableroPrincipal[bD][3] == "-") {
                            for (int k = aD; k <= cD; k++) {
                                tableroPrincipal[k][bD] = "O";
                            }
                        } else {
                            destructor = destructor + 1;
                            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                        }
                    } else {
                        destructor = destructor + 1;
                        System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                    }
                } else {
                    destructor = destructor + 1;
                    System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
                }

            } else {
                destructor = destructor + 1;
                System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
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
        System.out.print("INGRESE LA POSICION DEL FRAGATA (a,b): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";
        
        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            coordenadaGuardada [contadorCoordenada] = cadenacoordenada[i];
            System.out.println(contadorCoordenada);
            contadorCoordenada++;
            
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }
        contadorCoordenada++;
        coordenadaGuardada[contadorCoordenada] = " ";

        aF = coordenada[0];
        bF = coordenada[1];

        //Solo es una coordenada
        if (tableroPrincipal[aF][bF] == "-") {
            tableroPrincipal[aF][bF] = "O";

        } else {
            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
            fragata = fragata + 1;
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
        System.out.print("INGRESE LA POSICION DEL EASTER EGG (a,b): ");
        posicionbarcos = entradaopcion.next();
        this.contador = 0;
        String cadena = "";

        cadenacoordenada = posicionbarcos.split("-");
        for (int i = 0; i < cadenacoordenada.length; i++) {
            coordenadaGuardada [contadorCoordenada] = cadenacoordenada[i];
            System.out.println(contadorCoordenada);
            contadorCoordenada++;
            
            cadena = quitarParentesis(cadenacoordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                x = Integer.parseInt(pos[j]);

                coordenada[contador] = x;
                contador++;
            }

        }
        contadorCoordenada++;
        coordenadaGuardada[contadorCoordenada] = " ";

        aE = coordenada[0];
        bE = coordenada[1];

        //Solo es una coordenada
        if (tableroPrincipal[aE][bE] == "-") {
            tableroPrincipal[aE][bE] = "$";

        } else {
            System.out.println("ERROR, SE SOBRE PUSO EN UN BARCO!!!!!");
            easter = 1;
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
        if (aP == cP) { //(0,1)-(0,2)

            for (int k = bP; k <= dP; k++) {

                tableroPrincipal[aP][k] = "-";
            }

            //Vertical
        } else if (bP == dP) { //(0,1)-(3,1)

            for (int k = aP; k <= cP; k++) {
                tableroPrincipal[k][bP] = "-";
            }

            //Coordenda fuera de rango
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

    public void correctorFueraPortaavion() {
        try {
            aP = coordenada[0];
            bP = coordenada[1];
            cP = coordenada[2];
            dP = coordenada[3];
            //Horizontal 
            if (aP == cP) { //(0,1)-(0,2)

                for (int k = bP; k <= dP; k++) {

                    tableroPrincipal[aP][k] = "-";
                }

                //Vertical
            } else if (bP == dP) { //(0,1)-(3,1)

                for (int k = aP; k <= cP; k++) {
                    tableroPrincipal[k][bP] = "-";
                }

                //Coordenda fuera de rango
            }
        } catch (Exception e) {
        }
    }

    public void correctorFueraSubmarino() {
        try {
            aS = coordenada[0];
            bS = coordenada[1];
            cS = coordenada[2];
            dS = coordenada[3];
            //Horizontal 
            if (aS == cS) { //(0,1)-(0,2)

                for (int k = bS; k <= dS; k++) {

                    tableroPrincipal[aS][k] = "-";
                }

                //Vertical
            } else if (bS == dS) { //(0,1)-(3,1)

                for (int k = aS; k <= cS; k++) {
                    tableroPrincipal[k][bS] = "-";
                }

                //Coordenda fuera de rango
            }
        } catch (Exception e) {
        }
    }

    public void correctorFueraDestructor() {
        try {
            aD = coordenada[0];
            bD = coordenada[1];
            cD = coordenada[2];
            dD = coordenada[3];
            //Horizontal 
            if (aD == cD) { //(0,1)-(0,2)

                for (int k = bD; k <= dD; k++) {

                    tableroPrincipal[aD][k] = "-";
                }

                //Vertical
            } else if (bD == dD) { //(0,1)-(3,1)

                for (int k = aD; k <= cD; k++) {
                    tableroPrincipal[k][bD] = "-";
                }

                //Coordenda fuera de rango
            }
        } catch (Exception e) {
        }
    }
    
    
    public void abadonarPartida(){
    
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
    
    public void setearValoresTablero(){
     //seteano el tablero
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroPrincipal[i][j] = "-";

            }
        }
        for (int j = 0; j < 50; j++) {
            coordenadaGuardada[j] =" ";
        }
        
        
        //seteando valores de barcos
        Tablero.getInstancia().setPortaavion(1);
        Tablero.getInstancia().setSubmarino(3);
        Tablero.getInstancia().setDestructor(3);
        Tablero.getInstancia().setFragata(2);
        Tablero.getInstancia().setEaster(1);
        
        //seteando valores
        contadorCoordenada =0;
        contador =0;
        x=0;
        
     aP=0;
     bP=0;
     cP=0;
     dP=0;

     aS=0;
     bS=0;
     cS=0;
     dS=0;

     aD=0;
     bD=0;
     cD=0;
     dD=0;

     aF=0;
     bF=0;

     aE=0;
     bE=0;
        
    }

}
