package org.magdielasicona.controlador;

import java.awt.Image;
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
    private static JButton rayo;
    private JButton misil;
    int posY;
    int posX;
    private static boolean indicadorRayo = false;
    private boolean banderaRayo = true;

    @Override
    public void run() {

        while (true) {

            rayo.setBounds(rayo.getX(), (rayo.getY()) + 10, rayo.getWidth(), rayo.getHeight());
            posY = rayo.getY();
            posX = rayo.getX();
            System.out.println("RAYO:" + posX + "-" + posY);
            if (this.indicadorRayo == true) {
                System.out.println("SI");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Rayo.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.indicadorRayo = false;
            }

            if (posY == 560) {
                rayo.setBounds(rayo.getX(), rayo.getY() - 660, rayo.getWidth(), rayo.getHeight());
                retrasoRayo();
            }
            try {
                Thread.sleep(1000);
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

    public void obtenerMisil(JButton misil) {
        this.misil = misil;
    }

    public JButton getRayo() {
        return rayo;
    }

    public void setRayo(JButton rayo) {
        this.rayo = rayo;
    }

    public boolean isBanderaRayo() {
        return banderaRayo;
    }

    public void setBanderaRayo(boolean banderaRayo) {
        this.banderaRayo = banderaRayo;
    }

    public boolean isIndicadorRayo() {
        return indicadorRayo;
    }

    public void setIndicadorRayo(boolean indicadorRayo) {
        this.indicadorRayo = indicadorRayo;
    }

}
