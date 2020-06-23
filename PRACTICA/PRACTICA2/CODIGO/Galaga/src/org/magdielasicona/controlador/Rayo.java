package org.magdielasicona.controlador;

import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Rayo extends Thread {

    private static Rayo instanciaRayo;

    public static Rayo getInstancia() {
        if (instanciaRayo == null) {
            instanciaRayo = new Rayo();
        }
        return instanciaRayo;
    }
    //---------------------------------
    private static JButton rayo;
    
   
    int posY;
    int posX;
    private static boolean indicadorRayo = false;
    private static boolean señalRayo = true;

    @Override
    public void run() {

        while (señalRayo == true) {
            Random rand = new Random();
            int locacion = rand.nextInt(4);
            rayo.setBounds(rayo.getX(), (rayo.getY()) + 10, rayo.getWidth(), rayo.getHeight());
            posY = rayo.getY();
            posX = rayo.getX();
            System.out.println("RAYO:" + posX + "-" + posY);
            
            //Es impacatado por misil
            if (this.indicadorRayo == true) {
                
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Rayo.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.indicadorRayo = false;
            }
            //Cuando solo pasa de largo
            if (posY == 560) {
                System.out.println("RANDOM:" + locacion);
                if (locacion == 0) {
                    rayo.setBounds(161, rayo.getY() - 660, rayo.getWidth(), rayo.getHeight());
                    retrasoRayo();
                } else if (locacion == 1) {
                    rayo.setBounds(269, rayo.getY() - 660, rayo.getWidth(), rayo.getHeight());
                    retrasoRayo();
                } else if (locacion == 2) {
                    rayo.setBounds(377, rayo.getY() - 660, rayo.getWidth(), rayo.getHeight());
                    retrasoRayo();
                } else if (locacion == 3) {
                    rayo.setBounds(485, rayo.getY() - 660, rayo.getWidth(), rayo.getHeight());
                    retrasoRayo();
                }
            }
            
            //VELOCIDAD
            try {
                Thread.sleep(Misil.getInstancia().getVelocidadObjetos());
            } catch (InterruptedException ex) {
                Logger.getLogger(Rayo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void retrasoRayo() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }

    }

    public void lanzarRayo(JButton rayo) {
        this.rayo = rayo;

    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;

    }

    
    public JButton getRayo() {
        return rayo;
    }

    public void setRayo(JButton rayo) {
        this.rayo = rayo;
    }

    public boolean isSeñalRayo() {
        return señalRayo;
    }

    public void setSeñalRayo(boolean señalRayo) {
        this.señalRayo = señalRayo;
    }

    
    public boolean isIndicadorRayo() {
        return indicadorRayo;
    }

    public void setIndicadorRayo(boolean indicadorRayo) {
        this.indicadorRayo = indicadorRayo;
    }

}
