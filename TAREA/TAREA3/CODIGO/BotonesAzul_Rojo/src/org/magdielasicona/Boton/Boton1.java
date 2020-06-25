package org.magdielasicona.Boton;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Boton1 extends Thread {

    private static JButton boton1;
    private static boolean colorBoton1;
    private int color = 1;

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(3000);
                if (color == 1) {
                    boton1.setBackground(Color.red);
                    colorBoton1 = true;
                } else if (color == 2) {
                    boton1.setBackground(Color.blue);
                    colorBoton1 = false;
                    color = 0;

                }
                color++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Boton1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void obtenerBoton1(JButton boton) {
        this.boton1 = boton;
    }

    public boolean isColorBoton1() {
        return colorBoton1;
    }

    public void setColorBoton1(boolean colorBoton1) {
        this.colorBoton1 = colorBoton1;
    }

}
