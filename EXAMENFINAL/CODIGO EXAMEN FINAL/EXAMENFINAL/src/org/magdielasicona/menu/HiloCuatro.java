/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class HiloCuatro extends Thread {

    private static HiloCuatro instanciaHiloCuatro;

    public static HiloCuatro getInstancia() {
        if (instanciaHiloCuatro == null) {
            instanciaHiloCuatro = new HiloCuatro();
        }
        return instanciaHiloCuatro;
    }

    private static boolean banderaHilo4 = true;
    private static JButton boton4;

    @Override
    public void run() {
        pausar();
        boton4.setBounds(88, 7, boton4.getWidth(), boton4.getHeight());
        while (banderaHilo4 == true) {
            boton4.setBounds(88, boton4.getY() + 20, boton4.getWidth(), boton4.getHeight());
            boton4.setBackground(Color.red);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCuatro.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (boton4.getY() == 427) {

                boton4.setBounds(88, 7, boton4.getWidth(), boton4.getHeight());
            }
        }
    }

    public void obtenerBoton4(JButton btn4) {
        this.boton4 = btn4;
    }

    public void pausar() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  boolean isBanderaHilo4() {
        return banderaHilo4;
    }

    public  void setBanderaHilo4(boolean banderaHilo4) {
        HiloCuatro.banderaHilo4 = banderaHilo4;
    }
    
}
