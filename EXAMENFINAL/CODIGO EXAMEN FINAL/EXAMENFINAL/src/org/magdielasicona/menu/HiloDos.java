package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloDos extends Thread {

    private static HiloDos instanciaHiloDos;

    public static HiloDos getInstancia() {
        if (instanciaHiloDos == null) {
            instanciaHiloDos = new HiloDos();
        }
        return instanciaHiloDos;
    }

    private static boolean banderaHilo2 = true;
    private static JButton boton2;

    @Override
    public void run() {

        pausar();
        while (banderaHilo2 == true) {

            boton2.setBounds(88, boton2.getY() + 20, boton2.getWidth(), boton2.getHeight());
            boton2.setBackground(Color.red);
//            System.out.println(boton2.getX() + "-" + boton2.getY());
//            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton2.getY() == 427) {

                boton2.setBounds(88, 7, boton2.getWidth(), boton2.getHeight());
            }
        }
    }

    public void obtenerBoton2(JButton btn2) {
        this.boton2 = btn2;
    }

    public void pausar() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  boolean isBanderaHilo2() {
        return banderaHilo2;
    }

    public void setBanderaHilo2(boolean banderaHilo2) {
        HiloDos.banderaHilo2 = banderaHilo2;
    }

}
