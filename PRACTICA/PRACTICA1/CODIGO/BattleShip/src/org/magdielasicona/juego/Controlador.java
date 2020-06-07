
package org.magdielasicona.juego;

import java.util.Scanner;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Controlador {
    
     private static Controlador instanciaControlador;
     private int contadorIntentos = 3;
     
     
     
     
    public static Controlador getInstancia() {
        if (instanciaControlador == null) {
            instanciaControlador = new Controlador();
        }
        return instanciaControlador;
    }
    
    Scanner entradaJugar = new Scanner(System.in);
    
    //METODOS
    
    public void cantidadDeIntentos(){
        System.out.println("CANTIDAD DE INTENTOS PREDETERMINADO: "+contadorIntentos);
        System.out.print("INGRESE LA CANTIDAD DE INTENTOS: ");
        contadorIntentos = entradaJugar.nextInt();
        System.out.println("NUEVA CANTIDAD DE INTENTOS: "+contadorIntentos);
    }
    
    
    
    public void visualizarTablero(){
    System.out.println("******************TABLERO LLENADO*******************");
        for (int i = 0; i < 10; i++) {
            System.out.print("    " + i + "");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                
                System.out.print("| " + Tablero.tableroPrincipal[i][j] + " |");

            }
            System.out.println("");
        }
    }
    
    public void reiniciarTablero(){
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Tablero.tableroPrincipal[i][j] = " ";

            }
        }
    
        System.out.println("TABLERO REINICIADO EXITOSAMENTE!!!!!!!");
    
    }
    //GET y SET
    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }
    
    public void setearValoresControlador(){
    contadorIntentos=10;
    }
}
