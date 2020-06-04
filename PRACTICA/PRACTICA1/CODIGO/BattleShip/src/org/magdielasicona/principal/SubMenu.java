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
                    Partida.getInstancia().empezarJugar();
                    Partida.getInstancia().ingresoNombre();
                    Partida.getInstancia().validacionTablero();
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
        System.out.println("ReporteCompleto");
    }

    public void reporteVictorias() {
        System.out.println("ReporteVictorias");
    }

    

}
