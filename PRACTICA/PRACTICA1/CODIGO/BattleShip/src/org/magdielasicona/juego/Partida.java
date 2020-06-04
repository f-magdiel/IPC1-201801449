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
    
    
    public void empezarJugar(){
        
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);
        do {
            System.out.println("HORA: "+dia+"/"+mes+"/"+año+"    "+hora+":"+minuto+":"+segundo);
            
        } while (true);
        
    
    }

}
