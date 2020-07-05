package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloUno extends Thread {

    private static HiloUno instanciaHiloUno;

    public static HiloUno getInstancia() {
        if (instanciaHiloUno == null) {
            instanciaHiloUno = new HiloUno();
        }
        return instanciaHiloUno;
    }

    private static JButton tbnUno;

    private static boolean banderaHilo1 = true;

    @Override
    public void run() {

        while (banderaHilo1 == true) {
            System.out.println(tbnUno.getX() + "-" + tbnUno.getY());

            tbnUno.setBounds(88, tbnUno.getY()+20, tbnUno.getWidth(), tbnUno.getHeight());
            tbnUno.setBackground(Color.red);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (tbnUno.getY() == 427) {

                tbnUno.setBounds(88, 7, tbnUno.getWidth(), tbnUno.getHeight());
            }
        }
    }

    public void pausa() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obtenerBoton1(JButton uno) {

        this.tbnUno = uno;

    }

    public boolean isBanderaHilo1() {
        return banderaHilo1;
    }

    public void setBanderaHilo1(boolean banderaHilo1) {
        HiloUno.banderaHilo1 = banderaHilo1;
    }

}
