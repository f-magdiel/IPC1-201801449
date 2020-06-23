package org.magdielasicona.controlador;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Ojo extends Thread {

    private static Ojo instanciaOjo;

    public static Ojo getInstancia() {
        if (instanciaOjo == null) {
            instanciaOjo = new Ojo();
        }
        return instanciaOjo;
    }

//------------------------------------
    private static JButton ojo;
    private static boolean banderaOjo = false;
    private static boolean señalOjo = true;

    @Override
    public void run() {
        while (señalOjo == true) {
            Random rand = new Random();
            int locacion = rand.nextInt(4);

            ojo.setBounds(ojo.getX(), ojo.getY() + 10, ojo.getWidth(), ojo.getHeight());
            System.out.println("OJO:" + ojo.getX() + "-" + ojo.getY());

            //CUANDO ES IMPACTADO
            if (this.banderaOjo == true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ojo.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.banderaOjo = false;
            }

            //CUANDO SOLO PASA DE LARGO
            if (ojo.getY() == 560) {
                System.out.println("RANDO:" + locacion);
                if (locacion == 0) {
                    ojo.setBounds(161, ojo.getY() - 660, ojo.getWidth(), ojo.getHeight());
                    retrasoOjo();

                } else if (locacion == 1) {
                    ojo.setBounds(269, ojo.getY() - 660, ojo.getWidth(), ojo.getHeight());
                    retrasoOjo();

                } else if (locacion == 2) {
                    ojo.setBounds(377, ojo.getY() - 660, ojo.getWidth(), ojo.getHeight());
                    retrasoOjo();

                } else if (locacion == 3) {
                    ojo.setBounds(485, ojo.getY() - 660, ojo.getWidth(), ojo.getHeight());
                    retrasoOjo();
                }
            }

            //VELOCIDAD
            try {

                Thread.sleep(Misil.getInstancia().getVelocidadObjetos());
            } catch (InterruptedException ex) {
                Logger.getLogger(Ojo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void retrasoOjo() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ojo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lanzarOjo(JButton ojo) {
        this.ojo = ojo;
    }

    public JButton getOjo() {
        return ojo;
    }

    public void setOjo(JButton ojo) {
        this.ojo = ojo;
    }

    public boolean isBanderaOjo() {
        return banderaOjo;
    }

    public void setBanderaOjo(boolean banderaOjo) {
        this.banderaOjo = banderaOjo;
    }

    public boolean isSeñalOjo() {
        return señalOjo;
    }

    public void setSeñalOjo(boolean señalOjo) {
        this.señalOjo = señalOjo;
    }

}
