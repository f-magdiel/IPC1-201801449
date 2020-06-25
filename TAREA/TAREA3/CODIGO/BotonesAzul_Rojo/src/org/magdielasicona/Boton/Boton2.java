package org.magdielasicona.Boton;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Boton2 extends Thread {

    private static JButton boton2;
    private static boolean colorBoton2;
    private int color = 1;

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(3000);
                if (color == 1) {
                    boton2.setBackground(Color.blue);
                    colorBoton2 = true;
                } else if (color == 2) {
                    boton2.setBackground(Color.red);
                    colorBoton2 = false;
                    color = 0;
                }
                color++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Boton1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void obtenerBoton2(JButton boton) {
        this.boton2 = boton;
    }

    public boolean isColorBoton2() {
        return colorBoton2;
    }

    public void setColorBoton2(boolean colorBoton2) {
        this.colorBoton2 = colorBoton2;
    }

}
