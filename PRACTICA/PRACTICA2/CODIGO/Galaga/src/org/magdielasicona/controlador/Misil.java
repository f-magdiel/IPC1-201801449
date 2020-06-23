package org.magdielasicona.controlador;

import java.awt.Image;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
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
public class Misil extends Thread {

    private static Misil instanciaMisil;

    public static Misil getInstancia() {
        if (instanciaMisil == null) {
            instanciaMisil = new Misil();
        }
        return instanciaMisil;
    }

    private JButton misil;
    private JButton rayo;

    

    int posOriginal;
    private boolean banderaMisil = true;

    @Override
    public void run() {
        Random rand = new Random();
        int randomObjeto = rand.nextInt(4);
        Rayo raio = new Rayo();
        while (banderaMisil == true) {

            misil.setBounds(misil.getX(), misil.getY() - 10, misil.getWidth(), misil.getHeight());

            System.out.println("MISIL:" + misil.getX() + "-" + misil.getY());
            Area areaMisil = new Area(misil.getBounds());
            Area areaRayo = new Area(raio.getRayo().getBounds());

            if (areaMisil.intersects(areaRayo.getBounds2D())) {
                System.out.println("RANDO:"+randomObjeto);
                if (randomObjeto == 0) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(269, -90, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomObjeto == 1) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(161, -90, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomObjeto == 2) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(377, -90, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomObjeto == 3) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(485, -90, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                }
            }

            if (misil.getY() == -90) {
                misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());

                banderaMisil = false;
            }
            try {
                Thread.sleep(500);

            } catch (Exception e) {
            }
        }

    }

    public void lanzarMisil(JButton misil) {
        this.misil = misil;

    }

    public void obtenerRayo(JButton rayo) {
        this.rayo = rayo;
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;

    }

    public boolean isBanderaMisil() {
        return banderaMisil;
    }

    public void setBanderaMisil(boolean banderaMisil) {
        this.banderaMisil = banderaMisil;
    }

}
