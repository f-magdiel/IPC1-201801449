
package org.magdielasicona.controlador;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Asteroide extends Thread{
    private static Asteroide instanciaAsteroide;

    public static Asteroide getInstancia() {
        if (instanciaAsteroide == null) {
            instanciaAsteroide = new Asteroide();
        }
        return instanciaAsteroide;
    }
    
    
    //___________________________________
    private static JButton asteroide;
    private  static boolean banderaAsteroide = false;
    
    
    @Override
    public void run(){
    while(true){
        Random rand = new Random();
        int locacion = rand.nextInt(4);
    asteroide.setBounds(asteroide.getX(),asteroide.getY()+10, asteroide.getWidth(), asteroide.getHeight());
        System.out.println("Asteroide:"+asteroide.getX()+"-"+asteroide.getY());
        
        //Es impacatado por misil
            if (this.banderaAsteroide == true) {
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Rayo.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.banderaAsteroide = false;
            }
        
        
       //Cuando pasa de largo
        if (asteroide.getY()==560) {
            System.out.println("RANDOM:" + locacion);
                if (locacion == 0) {
                    asteroide.setBounds(161, asteroide.getY() - 660, asteroide.getWidth(), asteroide.getHeight());
                    retrasoAsteroide();
                } else if (locacion == 1) {
                    asteroide.setBounds(269, asteroide.getY() - 660, asteroide.getWidth(), asteroide.getHeight());
                    retrasoAsteroide();
                } else if (locacion == 2) {
                    asteroide.setBounds(377, asteroide.getY() - 660, asteroide.getWidth(), asteroide.getHeight());
                    retrasoAsteroide();
                } else if (locacion == 3) {
                    asteroide.setBounds(485, asteroide.getY() - 660, asteroide.getWidth(), asteroide.getHeight());
                    retrasoAsteroide();
                }
        }
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Rayo.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
    }
    
    public void retrasoAsteroide() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

    }

    
    public void lanzarAsteroide(JButton asteroide){
    this.asteroide = asteroide;
    
    }

    public  JButton getAsteroide() {
        return asteroide;
    }

    public  void setAsteroide(JButton asteroide) {
        Asteroide.asteroide = asteroide;
    }

    public boolean isBanderaAsteroide() {
        return banderaAsteroide;
    }

    public void setBanderaAsteroide(boolean banderaAsteroide) {
        Asteroide.banderaAsteroide = banderaAsteroide;
    }

    
    
}
