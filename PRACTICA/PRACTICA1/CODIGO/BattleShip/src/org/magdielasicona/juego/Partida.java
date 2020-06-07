package org.magdielasicona.juego;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;
    private int año;
    private int intentosDisponibles;
    private int direccion[] = new int[4];

    public static Partida getInstancia() {
        if (instanciaPartida == null) {
            instanciaPartida = new Partida();
        }
        return instanciaPartida;
    }
    Scanner entradaNombres = new Scanner(System.in);
    Calendar calendario = new GregorianCalendar();

    public void ingresoNombre() {

        System.out.print("INGRESE SU NICKNAME: ");
        nombreUser = entradaNombres.next();

        listaUsuario[contadorSesion] = nombreUser;
        contadorSesion++;

    }

    public void validacionTablero() {
        if (Tablero.getInstancia().getPortaavion() == 0) {
            if (Tablero.getInstancia().getSubmarino() == 0) {
                if (Tablero.getInstancia().getDestructor() == 0) {
                    if (Tablero.getInstancia().getFragata() == 0) {
                        if (Tablero.getInstancia().getEaster() == 0) {
                            empezarJugar();
                        } else {
                            System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                        }
                    } else {
                        System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                    }
                } else {
                    System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                }

            } else {
                System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
            }
        } else {
            System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
        }
    }

    public void empezarJugar() {
        int opcionDisparar;
        int contadorIntentos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);

        //Intentos
        intentosDisponibles = Controlador.getInstancia().getContadorIntentos();
        contadorIntentos = Controlador.getInstancia().getContadorIntentos();
        do {
            System.out.println("HORA: " + dia + "/" + mes + "/" + año + "    " + hora + ":" + minuto + ":" + segundo);
            System.out.println("");
            System.out.println("BARCOS");
            System.out.println("             " + "HUNDIDOS");
            System.out.println("");
            System.out.println(contadorIntentos + "/" + intentosDisponibles + " INTENTOS");
            System.out.println("");
            System.out.println("-------------------------------------");
            Controlador.getInstancia().visualizarTablero();
            System.out.println("");
            //OPCIONES
            System.out.println("1. LANZAR MISIL");
            System.out.println("2. TERMINAR PARTIDA");
            System.out.print("SELECCIONE UNA OPCION : ");
            opcionDisparar = entradaNombres.nextInt();

            switch (opcionDisparar) {
                case 1:
                    try {

                    if (contadorIntentos == 0) {
                        System.out.println("SE TE ACABARON LOS INTENTOS!!!! ");
                    } else {
                        contadorIntentos--;
                        dispararMisil();
                    }
                } catch (Exception e) {

                }

                //Metodo disparar
                break;
                case 2:
                    //Metodo Abandonar
                    break;
                default:
                    System.out.println("SELECCIONE UNA DE LAS OPCIONES DISPONIBLES!!!!!");
            }
        } while (0 < opcionDisparar && opcionDisparar > 2);

    }

    public void dispararMisil() {
        String pos[];
        String coordenada[];
        String coordenadaAtaque;
        String cadena = "";
        String cor1;
        String cor2;
        int valor;

        int contador;
        System.out.print("INGRESE LA COORDENADA (FILA,COLUMNA): ");
        coordenadaAtaque = entradaNombres.next();

        contador = 0;

        coordenada = coordenadaAtaque.split("-");
        for (int i = 0; i < coordenada.length; i++) {
            cadena = quitarParentesis(coordenada[i]);
            pos = cadena.split(",");
            for (int j = 0; j < pos.length; j++) {

                valor = Integer.parseInt(pos[j]);
                direccion[contador] = valor;
                contador++;
            }

        }
        int a, b;
        a = direccion[0];
        b = direccion[1];

        String valor1 = "";//(0,0)
        String valor2 = "";//(1,1)

        if (Tablero.tableroPrincipal[a][b].equals("O")) {
            //Buscar la coordenada que fue ingresada por obtener la coordenada de ataque
            for (int i = 0; i < 50; i++) {
                if (coordenadaAtaque.equals(Tablero.coordenadaGuardada[i])) {
                    valor1 = Tablero.coordenadaGuardada[i];
                    valor2 = Tablero.coordenadaGuardada[i + 1];

                    if (valor2 == null) {
                        valor2 = valor1;

                    }

                }
            }
        } else if (Tablero.tableroPrincipal[a][b].equals("$")) {
            for (int i = 0; i < 50; i++) {
                if (coordenadaAtaque.equals(Tablero.coordenadaGuardada[i])) {
                    valor1 = Tablero.coordenadaGuardada[i];
                    valor2 = Tablero.coordenadaGuardada[i + 1];

                    if (valor2 == null) {
                        valor2 = valor1;

                    }

                }
            }
        } else if (Tablero.tableroPrincipal[a][b].equals("-")) {
            System.out.println("NO LE DÍO A NINGUN BARCO");
            empezarJugar();
        }

        //------------------------------------------------------
        //busca la coordenada en el tablero
        //------------------------------------------------------------
        if (valor1 == valor2) {
            contador = 0;

            coordenada = valor1.split("-");
            for (int i = 0; i < coordenada.length; i++) {
                cadena = quitarParentesis(coordenada[i]);
                pos = cadena.split(",");
                for (int j = 0; j < pos.length; j++) {

                    valor = Integer.parseInt(pos[j]);
                    direccion[contador] = valor;
                    contador++;
                }

            }
            int x;
            int y;
            x = direccion[0];
            y = direccion[1];

            System.out.println(Tablero.tableroPrincipal[x][y]);

            if (Tablero.tableroPrincipal[x][y].equals("O")) {
                Tablero.tableroPrincipal[x][y] = "X";
                System.out.println("LE DIÓ A UN BARCO");
                empezarJugar();

            } else if (Tablero.tableroPrincipal[x][y].equals("$")) {
                System.out.println("LE DIÓ AL EASTER EGG");
                Tablero.tableroPrincipal[x][y] = "X";
                System.out.println("201801449 Francisco Magdiel Asicona ");
                empezarJugar();

            }

            //-----------------------------------------------------------------
            //Coordenadas diferentes (0,0)-(0,3)
        } else if (valor1 != valor2) {
            
            contador = 0;

            coordenada = valor1.split("-");
            for (int i = 0; i < coordenada.length; i++) {
                cadena = quitarParentesis(coordenada[i]);
                pos = cadena.split(",");
                for (int j = 0; j < pos.length; j++) {

                    valor = Integer.parseInt(pos[j]);
                    direccion[contador] = valor;
                    contador++;
                }

            }
            int aL;
            int bL;
            aL = direccion[0];
            bL = direccion[1];

            //------------------------------------------------------------------
            contador = 0;

            coordenada = valor2.split("-");
            for (int i = 0; i < coordenada.length; i++) {
                cadena = quitarParentesis(coordenada[i]);
                pos = cadena.split(",");
                for (int j = 0; j < pos.length; j++) {

                    valor = Integer.parseInt(pos[j]);
                    direccion[contador] = valor;
                    contador++;
                }

            }
            int cL;
            int dL;
            cL = direccion[0];
            dL = direccion[1];

            if (Tablero.tableroPrincipal[aL][bL] == "O") {
                //(0,2)-(0,4)
                if (aL == cL) {
                    for (int i = bL; i <= dL; i++) {
                        Tablero.tableroPrincipal[aL][i] = "X";
                        System.out.println("LE DIÓ A UN BARCO");
                    }
                    empezarJugar();
                } else if (bL == dL) {
                    for (int j = aL; j <= cL; j++) {
                        Tablero.tableroPrincipal[j][bL] = "X";
                        System.out.println("LE DIÓ A UN BARCO");
                    }
                    empezarJugar();
                }

            }

        }

    }

    public static String quitarParentesis(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);

        }
        return aux;

    }
}
