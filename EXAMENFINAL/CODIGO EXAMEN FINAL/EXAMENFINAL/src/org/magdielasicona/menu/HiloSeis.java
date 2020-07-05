package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloSeis extends Thread {
 private static HiloSeis instanciaHiloSeis;

    public static HiloSeis getInstancia() {
        if (instanciaHiloSeis == null) {
            instanciaHiloSeis = new HiloSeis();
        }
        return instanciaHiloSeis;
    }
    private static boolean banderaHilo6 = true;
    private static JButton boton6;

    @Override
    public void run() {
        pausar();
        boton6.setBounds(88, 7, boton6.getWidth(), boton6.getHeight());
        while (banderaHilo6 == true) {
            boton6.setBounds(88, boton6.getY() + 20, boton6.getWidth(), boton6.getHeight());
            boton6.setBackground(Color.red);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSeis.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton6.getY() == 427) {
                boton6.setBounds(88, 7, boton6.getWidth(), boton6.getHeight());
            }

        }
    }

    public void obtenerBoton6(JButton btn6) {
        this.boton6 = btn6;
    }

    public void pausar() {
        try {
            Thread.sleep(16000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  boolean isBanderaHilo6() {
        return banderaHilo6;
    }

    public  void setBanderaHilo6(boolean banderaHilo6) {
        HiloSeis.banderaHilo6 = banderaHilo6;
    }
    
}
