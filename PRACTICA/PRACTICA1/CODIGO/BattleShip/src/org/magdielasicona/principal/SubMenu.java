package org.magdielasicona.principal;

import java.util.Scanner;
import org.magdielasicona.juego.Controlador;
import org.magdielasicona.juego.Partida;
import org.magdielasicona.juego.Tablero;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class SubMenu {

    private static SubMenu instanciaSubMenu;
    
    public static SubMenu getInstancia() {
        if (instanciaSubMenu == null) {
            instanciaSubMenu = new SubMenu();
        }
        return instanciaSubMenu;
    }
 
    Scanner entradasub = new Scanner(System.in);
    
  

    public void crearTablero() {
    
        int opcionsubmenu;
        do {
            System.out.println("             SUBMENU ");
            System.out.println("****************************************");
            System.out.println("*    1. INGRESAR BARCOS                *");
            System.out.println("*    2. CAMBIAR CANTIDAD DE INTENTOS   *");
            System.out.println("*    3. INICIAR JUEGO                  *");
            System.out.println("*    4. VISUALIZAR TABLERO             *");
            System.out.println("*    5. REINICIAR TABLERO              *");
            System.out.println("*    6. REGRESA EL MENU PRINCIPAL      *");
            System.out.println("****************************************");
            System.out.println("");
            opcionsubmenu = entradasub.nextInt();

            switch (opcionsubmenu) {
                case 1:
                    Tablero.getInstancia().creandoTablero();
                    Tablero.getInstancia().asignarBarcos();
                    break;
                case 2:
                    Controlador.getInstancia().cantidadDeIntentos();
                    crearTablero();
                    break;
                case 3:
                    try{
                        
                   Partida.getInstancia().validacionTablero();
                   Partida.getInstancia().empezarJugar(); //DEMO
                    
                   
                   
                    }catch(Exception e){
                    
                    }
                    
                    break;
                case 4:
                    Controlador.getInstancia().visualizarTablero();
                    crearTablero();
                    break;
                case 5:
                   Controlador.getInstancia().reiniciarTablero();
                   crearTablero();
                    break;
                case 6:
                    MenuPrincipal.getInstancia().mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("INGRESE UNA DE LAS OPCIONES DISPONIBLES!!!!!");

            }

        } while (0<opcionsubmenu && opcionsubmenu >6);

    }

    public void reporteCompleto() {
        System.out.println("********************REPORTE COMPLETO********************");
        System.out.println("NICKNAME      ESTADO       INTENTOS      BARCOS HUNDIDOS");
        for (int i = 0; i <Partida.getInstancia().getContadorSesion(); i++) {
            System.out.println(Partida.listaUsuario[i]+"          "+Partida.estadoPartida[i]+"            "+Partida.intentosPartida[i]+"                "+Partida.barcosHundidos[i]);
        }
        
    }

    public void reporteVictorias() {
        
        //Ordenamiento Burbuja
        int aux;
        String auxL;
        String auxE;
        for (int i = 0; i < (Partida.getInstancia().getContadorSesion()-1); i++) {
            for (int j = 0; j < (Partida.getInstancia().getContadorSesion()-1); j++) {
                if (Partida.intentosPartida[j]>Partida.intentosPartida[i+j]) {
                    aux = Partida.intentosPartida[j];
                    Partida.intentosPartida[j] = Partida.intentosPartida[j+1];
                    Partida.intentosPartida[j+1]=aux;
                    
                    auxL = Partida.listaUsuario[j];
                    Partida.listaUsuario[j]=Partida.listaUsuario[j+1];
                    Partida.listaUsuario[j+1] = auxL;
                    
                    auxE = Partida.estadoPartida[j];
                    Partida.estadoPartida[j]=Partida.estadoPartida[j+1];
                    Partida.estadoPartida[j+1] = auxE;
                }
            }
        }
         System.out.println("********************REPORTE VICTORIAS********************");
         System.out.println("NICKNAME                 ESTADO                  INTENTOS      ");
         for (int k = 0; k < Partida.getInstancia().getContadorSesion(); k++) {
             if ("GANO"==Partida.estadoPartida[k]) {
                 System.out.println(Partida.listaUsuario[k]+"   "+Partida.estadoPartida[k]+" "+Partida.intentosPartida[k]);
             }
        }
    }

    

}
