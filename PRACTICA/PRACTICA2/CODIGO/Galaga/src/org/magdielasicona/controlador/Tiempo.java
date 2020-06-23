package org.magdielasicona.controlador;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tiempo extends Thread {

    private static Tiempo instanciaTiempo;

    public static Tiempo getInstancia() {
        if (instanciaTiempo == null) {
            instanciaTiempo = new Tiempo();
        }
        return instanciaTiempo;
    }

    //-------------------------------------
    private static int timer = 1;
    private static boolean señalTiempo = true;

    @Override
    public void run() {
        MenuJuego menu = new MenuJuego();
        while (señalTiempo == true) {

            System.out.println("TIMER:" + timer);
            menu.obterTiempo(timer);
            timer++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isSeñalTiempo() {
        return señalTiempo;
    }

    public void setSeñalTiempo(boolean señalTiempo) {
        this.señalTiempo = señalTiempo;
    }

}
