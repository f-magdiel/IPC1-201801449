
package org.magdielasicona.juego;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Partida {
    
     private static Partida instanciaPartida;

    public static Partida getInstancia() {
        if (instanciaPartida == null) {
            instanciaPartida = new Partida();
        }
        return instanciaPartida;
    }
    
}
