package org.magdielasicona.controlador;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Corazon extends Thread {
    private static Corazon instanciaCorazon;

    public static Corazon getInstancia() {
        if (instanciaCorazon == null) {
            instanciaCorazon = new Corazon();
        }
        return instanciaCorazon;
    }
    //-----------------------------------

    private static JButton corazon;
    private static boolean banderaCorazon;

    @Override
    public void run() {
        while (true) {
            Random rand = new Random();
            int locacion = rand.nextInt(4);

            corazon.setBounds(corazon.getX(), corazon.getY() + 10, corazon.getWidth(), corazon.getHeight());

            System.out.println("RAYO:" + corazon.getX() + "-" + corazon.getY());
            //CUANDO ES IMPACTADO
            if (this.banderaCorazon == true) {
                try {
                    Thread.sleep(14000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corazon.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.banderaCorazon = false;
            }

            //CUANDO SOLO PASA DE LARGO
            if (corazon.getY() == 560) {
                System.out.println("RANDO:" + locacion);
                if (locacion == 0) {
                    corazon.setBounds(161, corazon.getY() - 660, corazon.getWidth(), corazon.getHeight());
                    retrasoCorazon();
                } else if (locacion == 1) {
                    corazon.setBounds(269, corazon.getY() - 660, corazon.getWidth(), corazon.getHeight());
                    retrasoCorazon();
                } else if (locacion == 2) {
                    corazon.setBounds(377, corazon.getY() - 660, corazon.getWidth(), corazon.getHeight());
                    retrasoCorazon();
                } else if (locacion == 3) {
                    corazon.setBounds(485, corazon.getY() - 660, corazon.getWidth(), corazon.getHeight());
                    retrasoCorazon();
                }
            }
            try {
                //VELOCIDAD
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Corazon.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void retrasoCorazon() {

        try {
            Thread.sleep(14000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Corazon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lanzarCorazon(JButton corazon) {
        this.corazon = corazon;
    }

    public JButton getCorazon() {
        return corazon;
    }

    public void setCorazon(JButton corazon) {
        this.corazon = corazon;
    }

    public boolean isBanderaCorazon() {
        return banderaCorazon;
    }

    public void setBanderaCorazon(boolean banderaCorazon) {
        this.banderaCorazon = banderaCorazon;
    }

}
