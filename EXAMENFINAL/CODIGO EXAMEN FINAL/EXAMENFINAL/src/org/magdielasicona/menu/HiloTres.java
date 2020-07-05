package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloTres extends Thread {

     private static HiloTres instanciaHiloTres;

    public static HiloTres getInstancia() {
        if (instanciaHiloTres == null) {
            instanciaHiloTres = new HiloTres();
        }
        return instanciaHiloTres;
    }
    
    private static boolean banderaHilo3 = true;
    private static JButton boton3;

    @Override
    public void run() {

        pausar();
        while (banderaHilo3 == true) {
            boton3.setBounds(88, boton3.getY() + 20, boton3.getWidth(), boton3.getHeight());
            boton3.setBackground(Color.red);
            
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTres.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton3.getY() == 427) {

                boton3.setBounds(88, 7, boton3.getWidth(), boton3.getHeight());
            }
        }
    }

    public void obtenerBoton3(JButton btn3) {
        this.boton3 = btn3;
    }

    public void pausar() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  boolean isBanderaHilo3() {
        return banderaHilo3;
    }

    public  void setBanderaHilo3(boolean banderaHilo3) {
        HiloTres.banderaHilo3 = banderaHilo3;
    }
    
}
