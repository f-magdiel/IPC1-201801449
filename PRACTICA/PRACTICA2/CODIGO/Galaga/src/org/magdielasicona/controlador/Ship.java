package org.magdielasicona.controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Ship extends Thread {

    private static Ship instanciaShip;

    public static Ship getInstancia() {
        if (instanciaShip == null) {
            instanciaShip = new Ship();
        }
        return instanciaShip;
    }
    //------------------------------------
    private JButton ship;
    private static boolean banderaShip = true;
    private static int vidaShip = 3;
    private static int poderShip = 0;
    private static JTextField jTextFieldVida;
    private static boolean llaveAccion = true;

    @Override
    public void run() {
        Asteroide asteroide = new Asteroide();
        Misil misil = new Misil();
        Rayo rayo = new Rayo();
        Asteroide aste = new Asteroide();
        Caracol cara = new Caracol();
        Corazon cora = new Corazon();
        Ojo ojo = new Ojo();
        while (banderaShip == true) {
            System.out.println("NAVE SIGUE");
            if (llaveAccion == true) {
                Area areaShip = new Area(ship.getBounds());
                Area areaAste = new Area(asteroide.getAsteroide().getBounds());
                if (areaShip.intersects(areaAste.getBounds2D())) {
                    asteroide.getAsteroide().setBounds(ship.getX(), -110, asteroide.getAsteroide().getWidth(), asteroide.getAsteroide().getHeight());
                    vidaShip -= 1;
                    this.jTextFieldVida.setText(String.valueOf(vidaShip));
                    if (vidaShip == 0) {

                        Rayo.getInstancia().setSeñalRayo(false);
                        Asteroide.getInstancia().setSeñalAsteroide(false);
                        Caracol.getInstancia().setSeñalCaracol(false);
                        Corazon.getInstancia().setSeñalCorazon(false);
                        Ojo.getInstancia().setSeñalOjo(false);
                        Tiempo.getInstancia().setSeñalTiempo(false);
                        this.banderaShip = false;
                        JOptionPane.showMessageDialog(null, "GAME OVER, INTENTA OTRA VEZ :-(!!");

                    }
                }
            }
        }

    }

    public void obtenerShip(JButton ship) {
        this.ship = ship;
    }

    public void obtenerJtextVidaship(JTextField vida) {
        this.jTextFieldVida = vida;
    }

    public JButton getShip() {
        return ship;
    }

    public void setShip(JButton ship) {
        this.ship = ship;
    }

    public boolean isBanderaShip() {
        return banderaShip;
    }

    public void setBanderaShip(boolean banderaShip) {
        this.banderaShip = banderaShip;
    }

    public int getVidaShip() {
        return vidaShip;
    }

    public void setVidaShip(int vidaShip) {
        this.vidaShip = vidaShip;
    }

    public int getPoderShip() {
        return poderShip;
    }

    public void setPoderShip(int poderShip) {
        this.poderShip = poderShip;
    }

    public boolean isLlaveAccion() {
        return llaveAccion;
    }

    public void setLlaveAccion(boolean llaveAccion) {
        this.llaveAccion = llaveAccion;
    }

}
