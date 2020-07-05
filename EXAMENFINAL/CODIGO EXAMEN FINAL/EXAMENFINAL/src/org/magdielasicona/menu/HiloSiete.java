package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloSiete extends Thread {

    private static HiloSiete instanciaHiloSiete;

    public static HiloSiete getInstancia() {
        if (instanciaHiloSiete == null) {
            instanciaHiloSiete = new HiloSiete();
        }
        return instanciaHiloSiete;
    }

    private static boolean banderaHilo7 = true;
    private static JButton boton7;

    @Override
    public void run() {
        pausar();
        boton7.setBounds(88, 7, boton7.getWidth(), boton7.getHeight());
        while (banderaHilo7 == true) {
            boton7.setBounds(88, boton7.getY() + 20, boton7.getWidth(), boton7.getHeight());
            boton7.setBackground(Color.red);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSiete.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton7.getY() == 427) {
                boton7.setBounds(88, 7, boton7.getWidth(), boton7.getHeight());
            }

        }
    }

    public void obtenerBoton7(JButton btn7) {
        this.boton7 = btn7;
    }

    public void pausar() {
        try {
            Thread.sleep(19000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isBanderaHilo7() {
        return banderaHilo7;
    }

    public void setBanderaHilo7(boolean banderaHilo7) {
        HiloSiete.banderaHilo7 = banderaHilo7;
    }

}
