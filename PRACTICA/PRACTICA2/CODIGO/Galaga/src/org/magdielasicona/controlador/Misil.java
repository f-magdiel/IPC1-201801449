package org.magdielasicona.controlador;

import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Misil extends Thread {

    JButton misil;
    int posOriginal;
    boolean bandera = true;

    @Override
    public void run() {

        while (bandera ==true) {
            posOriginal = misil.getY();
            misil.setBounds(misil.getX(), misil.getY() - 10, misil.getWidth(), misil.getHeight());
           
            System.out.println(misil.getY());
            if (misil.getY()==4) {
                bandera = false;
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

}
