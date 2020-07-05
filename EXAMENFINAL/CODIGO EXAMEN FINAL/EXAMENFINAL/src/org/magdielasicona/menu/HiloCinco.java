package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloCinco extends Thread {

     private static HiloCinco instanciaHiloCinco;

    public static HiloCinco getInstancia() {
        if (instanciaHiloCinco == null) {
            instanciaHiloCinco = new HiloCinco();
        }
        return instanciaHiloCinco;
    }
    
    private static boolean banderaHilo5 = true;
    private static JButton boton5;

    @Override
    public void run() {
        pausar();
        boton5.setBounds(88, 7, boton5.getWidth(), boton5.getHeight());
        while (banderaHilo5 == true) {
            boton5.setBounds(88, boton5.getY() + 20, boton5.getWidth(), boton5.getHeight());
            boton5.setBackground(Color.red);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCinco.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton5.getY() == 427) {
                boton5.setBounds(88, 7, boton5.getWidth(), boton5.getHeight());
            }
        }
    }

    public void obtenerBoton5(JButton btn5) {
        this.boton5 = btn5;
    }

    public void pausar() {
        try {
            Thread.sleep(13000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  boolean isBanderaHilo5() {
        return banderaHilo5;
    }

    public  void setBanderaHilo5(boolean banderaHilo5) {
        HiloCinco.banderaHilo5 = banderaHilo5;
    }
    
}
