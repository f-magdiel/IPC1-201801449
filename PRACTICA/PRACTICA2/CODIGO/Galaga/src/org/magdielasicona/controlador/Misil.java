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

        Rayo raio = new Rayo();
        while (banderaMisil == true) {

            misil.setBounds(misil.getX(), misil.getY() - 1, misil.getWidth(), misil.getHeight());

            System.out.println("MISIL:" + misil.getX() + "-" + misil.getY());
            System.out.println("RAYO:" + rayo.getX() + "-" + rayo.getY());
            System.out.println("");
            if ((misil.getX() == raio.getRayo().getX()) && (misil.getY() == raio.getRayo().getY())) {
                System.out.println("COLISION MISIL Y RAYO");
                rayo.setBounds(269, -82, rayo.getWidth(), rayo.getHeight());

                // misil.setIcon(setIcono("/Imagenes/Invisibilidad.png", misil));
                banderaMisil = false;
            }

            if (misil.getY() == -82) {

                misil.setIcon(setIcono("/Imagenes/Invisibilidad.png", misil));
                banderaMisil = false;
            }
            try {
                Thread.sleep(100);

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
