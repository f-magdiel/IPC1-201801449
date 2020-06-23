package org.magdielasicona.controlador;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Caracol extends Thread {

    private static Caracol instanciaCaracol;

    public static Caracol getInstancia() {
        if (instanciaCaracol == null) {
            instanciaCaracol = new Caracol();
        }
        return instanciaCaracol;
    }
    //---------------------------
    private static JButton caracol;
    private static boolean banderaCaracol = false;

    @Override
    public void run() {
        while (true) {
            Random rand = new Random();
            int locacion = rand.nextInt(4);

            caracol.setBounds(caracol.getX(), caracol.getY() + 10, caracol.getWidth(), caracol.getHeight());
             
            //CUANDO ES IMPACTADO
            if (this.banderaCaracol == true) {
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Caracol.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.banderaCaracol = false;
            }
            //CUANDO SOLO PASA DE LARGO
            if (caracol.getY() == 560) {
                System.out.println("RANDO:" + locacion);
                if (locacion == 0) {
                    caracol.setBounds(161, caracol.getY() - 660, caracol.getWidth(), caracol.getHeight());
                    retrasoCaracol();
                } else if (locacion == 1) {
                    caracol.setBounds(269, caracol.getY() - 660, caracol.getWidth(), caracol.getHeight());
                    retrasoCaracol();
                } else if (locacion == 2) {
                    caracol.setBounds(377, caracol.getY() - 660, caracol.getWidth(), caracol.getHeight());
                    retrasoCaracol();
                } else if (locacion == 3) {
                    caracol.setBounds(485, caracol.getY() - 660, caracol.getWidth(), caracol.getHeight());
                    retrasoCaracol();
                }
            }
            //VELOCIDAD
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Caracol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void retrasoCaracol() {

        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Caracol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lanzarCaracol(JButton caracol) {
        this.caracol = caracol;
    }

    public JButton getCaracol() {
        return caracol;
    }

    public void setCaracol(JButton caracol) {
        this.caracol = caracol;
    }

    public boolean isBanderaCaracol() {
        return banderaCaracol;
    }

    public void setBanderaCaracol(boolean banderaCaracol) {
        this.banderaCaracol = banderaCaracol;
    }

}
