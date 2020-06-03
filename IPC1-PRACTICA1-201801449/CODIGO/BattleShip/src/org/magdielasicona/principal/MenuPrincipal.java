
package org.magdielasicona.principal;

import java.util.Scanner;

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
    
    
    Scanner entrada = new Scanner(System.in);
    public void mostrarMenuPrincipal(){
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
            opcionmenu = entrada.nextInt();
            
            switch(opcionmenu){
                case 1:
                    System.out.println("Selecciono 1");
                    break;
                case 2: 
                    System.out.println("Selecciono 2");
                    break;
                case 3:
                    System.out.println("Selecciono 3");
                    break;
                case 4:
                    System.out.println("Selecciono 4");
                    break;
                default:
                    System.out.println("Ingrese una de las Opciones Disponibles!!!!!");
            }
        } while (0<opcionmenu && opcionmenu >4);
        
    
    }
    
}
