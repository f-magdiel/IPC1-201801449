package org.magdielasicona.principal;

import java.util.Scanner;
import org.magdielasicona.juego.Tablero;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MenuPrincipal {

    private static MenuPrincipal instanciaMenu;

    public static MenuPrincipal getInstancia() {
        if (instanciaMenu == null) {
            instanciaMenu = new MenuPrincipal();
        }
        return instanciaMenu;
    }

    SubMenu subMenu = SubMenu.getInstancia();

    Scanner entrada = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        int opcionmenu;
        do {
            System.out.println("");
            System.out.println("        MENU PRINCIPAL");
            System.out.println("********************************");
            System.out.println("*    1. CREAR TABLERO          *");
            System.out.println("*    2. REPORTE COMPLETO       *");
            System.out.println("*    3. REPORTE VICTORIAS      *");
            System.out.println("*    4. SALIR                  *");
            System.out.println("********************************");
            System.out.println("");
            System.out.print("INGRESE UNA OPCION: ");
            opcionmenu = entrada.nextInt();

            switch (opcionmenu) {
                case 1:
                    Tablero.getInstancia().rellenandoTablero();
                    subMenu.crearTablero();
                    
                    break;
                case 2:
                    subMenu.reporteCompleto();
                    mostrarMenuPrincipal();
                    break;
                case 3:
                    subMenu.reporteVictorias();
                    mostrarMenuPrincipal();
                    break;
                case 4:

                    System.out.println("SE SALIÓ DEL JUEGO");
                    System.exit(0);
                    break;
                default:
                    System.out.println("INGRESE UNA DE LAS OPCIONES DISPONIBLES!!!!!");
            }
        } while (0 < opcionmenu && opcionmenu > 4);

    }

}
