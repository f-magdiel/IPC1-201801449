package org.magdielasicona.principal;

import java.util.Scanner;
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
            System.out.println("*    5. REGRESAR AL MENU PRINCIPAL     *");
            System.out.println("****************************************");
            System.out.println("");
            opcionsubmenu = entradasub.nextInt();

            switch (opcionsubmenu) {
                case 1:
                    Tablero.getInstancia().creandoTablero();
                    Tablero.getInstancia().asignarBarcos();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                   MenuPrincipal.getInstancia().mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("INGRESE UNA DE LAS OPCIONES DISPONIBLES!!!!!");

            }

        } while (0<opcionsubmenu && opcionsubmenu >5);

    }

    public void reporteCompleto() {
        System.out.println("ReporteCompleto");
    }

    public void reporteVictorias() {
        System.out.println("ReporteVictorias");
    }

    

}
