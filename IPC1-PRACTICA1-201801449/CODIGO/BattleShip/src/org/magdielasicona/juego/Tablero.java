
package org.magdielasicona.juego;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tablero {
    
     private static Tablero instanciaTablero;

    public static Tablero getInstancia() {
        if (instanciaTablero == null) {
            instanciaTablero = new Tablero();
        }
        return instanciaTablero;
    }
    
    private String[][] tableroPrincipal;
    
    
}
