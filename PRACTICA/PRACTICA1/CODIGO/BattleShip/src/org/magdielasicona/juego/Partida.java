package org.magdielasicona.juego;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import org.magdielasicona.principal.MenuPrincipal;
import org.magdielasicona.principal.SubMenu;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Partida {

    private static Partida instanciaPartida;

    private int contadorSesion = 0;
    private int contadorAbandonar = 0;
    private int contadorVictoria = 0;

    public static String[] listaUsuario = new String[50];//guardado usuario
    public static String[] estadoPartida = new String[50];//guardando estado partida gano, perdio, abandono
    public static int[] intentosPartida = new int[50];//guardando intentos de lanzar misil
    public static int[] barcosHundidos = new int[50];// guardando cantidad de barcos hundidos

    private int barcosDestruidos = 0;
    private String nombreUser;
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;
    private int año;
    private int intentosDisponibles = Controlador.getInstancia().getContadorIntentos();
    private int resultadoIntentos;
    private int direccion[] = new int[4];

    public static Partida getInstancia() {
        if (instanciaPartida == null) {
            instanciaPartida = new Partida();
        }
        return instanciaPartida;
    }
    Scanner entradaNombres = new Scanner(System.in);
    Calendar calendario = new GregorianCalendar();

    public void resetarGeneral() {
        
        Tablero.getInstancia().setearValoresTablero();
        Controlador.getInstancia().setearValoresControlador();
        setearValoresPartida();
    }

    public void validacionAbandonar() {
        System.out.println(":-(, Adios: " + listaUsuario[contadorSesion]);
        estadoPartida[contadorSesion] = "ABANDONÓ";
        barcosHundidos[contadorSesion] = barcosDestruidos;
        intentosPartida[contadorSesion] = resultadoIntentos;
        contadorSesion++;
        resetarGeneral();
        MenuPrincipal.getInstancia().mostrarMenuPrincipal();
    }

    public void validacionIniciarJugar() {

        if (intentosDisponibles == 0) {
            System.out.println(":-(, PERDIÓ LA PARTIDA: " + listaUsuario[contadorSesion]);
            estadoPartida[contadorSesion] = "PERDIÓ";
            barcosHundidos[contadorSesion] = barcosDestruidos;
            intentosPartida[contadorSesion] = resultadoIntentos;
            contadorSesion++;
            resetarGeneral();
            MenuPrincipal.getInstancia().mostrarMenuPrincipal();

        } else if (barcosDestruidos == 9) {
            System.out.println("FELICIDADES GANÓ: " + listaUsuario[contadorSesion]);
            estadoPartida[contadorSesion] = "GANO";
            barcosHundidos[contadorSesion] = barcosDestruidos;
            intentosPartida[contadorSesion] = resultadoIntentos;
            contadorSesion++;
            resetarGeneral();
            MenuPrincipal.getInstancia().mostrarMenuPrincipal();
        } else {

            empezarJugar();

        }
    }

    public void ingresoNombre() {

        System.out.print("INGRESE SU NICKNAME: ");
        nombreUser = entradaNombres.next();

        listaUsuario[contadorSesion] = nombreUser;

    }

    public void validacionTablero() {
        if (Tablero.getInstancia().getPortaavion() == 0) {
            if (Tablero.getInstancia().getSubmarino() == 0) {
                if (Tablero.getInstancia().getDestructor() == 0) {
                    if (Tablero.getInstancia().getFragata() == 0) {
                        if (Tablero.getInstancia().getEaster() == 0) {
                            ingresoNombre();

                            validacionIniciarJugar();

                        } else {
                            System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                            SubMenu.getInstancia().crearTablero();

                        }
                    } else {
                        System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                        SubMenu.getInstancia().crearTablero();
                    }
                } else {
                    System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                    SubMenu.getInstancia().crearTablero();
                }

            } else {
                System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
                SubMenu.getInstancia().crearTablero();
            }
        } else {
            System.out.println("ERROR, EL TABLERO ESTÁ INCOMPLETO!!!!!");
            SubMenu.getInstancia().crearTablero();
        }
    }

    public void empezarJugar() {
        int opcionDisparar;

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);

        //Intentos
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("HORA: " + dia + "/" + mes + "/" + año + "    " + hora + ":" + minuto + ":" + segundo);
            System.out.println("");
            System.out.println(barcosDestruidos+"/"+"9"+"  BARCOS HUNDIDOS");

            System.out.println("");
            System.out.println(intentosDisponibles + "/" + Controlador.getInstancia().getContadorIntentos() + " INTENTOS");
            System.out.println("");
            System.out.println("-------------------------------------");
            Controlador.getInstancia().visualizarTablero();
            System.out.println("");
            //OPCIONES
            System.out.println("1. LANZAR MISIL");
            System.out.println("2. TERMINAR PARTIDA");
            System.out.print("SELECCIONE UNA OPCION : ");
            opcionDisparar = entradaNombres.nextInt();
            intentosDisponibles--;

            switch (opcionDisparar) {
                case 1:
                    //Metodo disparar
                    dispararMisil();

                    break;
                case 2:
                    //Metodo Abandonar
                    validacionAbandonar();
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
        int aDireccion, bDireccion;
        int valor;

        int contador;
        System.out.print("INGRESE LA COORDENADA (FILA,COLUMNA): ");
        coordenadaAtaque = entradaNombres.next();
        resultadoIntentos++;
        
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
        //valores de X y Y, que son ingresados por el usuario para atacar
        aDireccion = direccion[0];
        bDireccion = direccion[1];

        
        if (Tablero.tableroPrincipal[aDireccion][bDireccion] == "O") {
            //Buscar la coordenada que fue ingresada por obtener la coordenada de ataque
            //Variable para almarcenar las coordenada en par
            String valor1 = null;//(0,0)
            String valor2 = null;//(1,1)

            for (int i = 0; i < 100; i+=3) {

                valor1 = Tablero.coordenadaGuardada[i];
                valor2 = Tablero.coordenadaGuardada[i + 1];
                
                
                int aVal, bVal, cVal, dVal;
                char a;
                char b;
                char c;
                char d;
                a = valor1.charAt(1);
                b = valor1.charAt(3);
                c = valor2.charAt(1);
                d = valor2.charAt(3);

                aVal = Character.getNumericValue(a);
                bVal = Character.getNumericValue(b);
                cVal = Character.getNumericValue(c);
                dVal = Character.getNumericValue(d);

               

                //Horizontal
                if (aDireccion == aVal && aDireccion == cVal) {
                    
                    if (bDireccion >= bVal && bDireccion <= dVal) {
                        for (int k = bVal; k <= dVal; k++) {
                            Tablero.tableroPrincipal[aVal][k] = "X";
                            if (dVal==k) {
                                barcosDestruidos++;
                                valor1 ="";
                                valor2 ="";
                                validacionIniciarJugar();
                            }
                        }

                    }
                } 
                //vertical
                if (bDireccion == bVal && bDireccion == dVal) {
                    if (aDireccion >= aVal && aDireccion <= cVal) {
                        for (int j = aVal; j <= cVal; j++) {
                            Tablero.tableroPrincipal[j][bDireccion] = "X";
                            if (cVal==j) {
                                barcosDestruidos++;
                                valor1 ="";
                                valor2 ="";
                                validacionIniciarJugar();
                            }
                        }

                    }
                }

            }
        } else if (Tablero.tableroPrincipal[aDireccion][bDireccion].equals("$")) {
            Tablero.tableroPrincipal[aDireccion][bDireccion] = "X";
            System.out.println("201801449 FRANCISCO MAGDIEL ASICONA MATEO");
            validacionIniciarJugar();

        } else if (Tablero.tableroPrincipal[aDireccion][bDireccion].equals("-")) {
            System.out.println("");
            System.out.println("NO LE DIÓ A NINGUN BARCO");
            validacionIniciarJugar();
        }

        
    }

    public static String quitarParentesis(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);

        }
        return aux;

    }

    public int getContadorSesion() {
        return contadorSesion;
    }

    public void setContadorSesion(int contadorSesion) {
        this.contadorSesion = contadorSesion;
    }

    public int getContadorAbandonar() {
        return contadorAbandonar;
    }

    public void setContadorAbandonar(int contadotAbandonar) {
        this.contadorAbandonar = contadotAbandonar;
    }

    public int getContadorVictoria() {
        return contadorVictoria;
    }

    public void setContadorVictoria(int contadorVictoria) {
        this.contadorVictoria = contadorVictoria;
    }

    public int getIntentosDisponibles() {
        return intentosDisponibles;
    }

    public void setIntentosDisponibles(int intentosDisponibles) {
        this.intentosDisponibles = intentosDisponibles;
    }

    public void setearValoresPartida() {
        nombreUser = " ";
        barcosDestruidos = 0;
        resultadoIntentos = 0;
        intentosDisponibles = Controlador.getInstancia().getContadorIntentos();

        for (int i = 0; i < direccion.length; i++) {
            direccion[i] = 0;
        }
    }
}
