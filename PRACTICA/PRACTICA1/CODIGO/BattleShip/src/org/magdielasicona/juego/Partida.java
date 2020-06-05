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
                    contadorIntentos--;
                    if (contadorIntentos == 0) {
                        System.out.println("SE TE ACABARON LOS INTENTOS!!!! ");
                    } else {
                        dispararMisil();
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
        String cadena="";
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
        int a,b;
            a = direccion[0];
            b = direccion[1];
            
            

    }

    public static String quitarParentesis(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);
            

        }
        return aux;

    }
}
