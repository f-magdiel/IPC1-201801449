
package org.magdielasicona.principal;

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
    
    
    public void crearTablero(){}
    public void reporteCompleto(){}
    public void reporteVictorias(){}
    public void salir(){}
    
}
