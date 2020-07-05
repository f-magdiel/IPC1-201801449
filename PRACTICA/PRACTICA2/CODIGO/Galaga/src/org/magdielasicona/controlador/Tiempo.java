package org.magdielasicona.controlador;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tiempo extends Thread {

    private static Tiempo instanciaTiempo;

    public static Tiempo getInstancia() {
        if (instanciaTiempo == null) {
            instanciaTiempo = new Tiempo();
        }
        return instanciaTiempo;
    }

    //-------------------------------------
    private static JTextField jTextFieldTiempoConsumido;
    private static JTextField jTextFieldTiempoRestante;
    private static int timer1 = 0;
    private static int timer2 = 240;
    private static boolean señalTiempo = true;
    private static JButton ship;
    private int contadorLlave = 0;

    @Override
    public void run() {

        while (señalTiempo == true) {

            System.out.println("TIMER:" + timer1);
            this.jTextFieldTiempoConsumido.setText(String.valueOf(timer1));
            this.jTextFieldTiempoRestante.setText(String.valueOf(timer2));

            //Camufalje
            if (MenuJuego.getInstancia().isLlavePoder() == false) {
                contadorLlave++;
                if (contadorLlave == 6) {
                    ship.setIcon(setIcono("/Imagenes/space-ship.png", ship));
                    MenuJuego.getInstancia().setLlavePoder(true);
                    Ship.getInstancia().setLlaveAccion(true);
                    contadorLlave = 0;
                }
            }
            if (timer1 == 240) {

                Rayo.getInstancia().setSeñalRayo(false);
                Asteroide.getInstancia().setSeñalAsteroide(false);
                Caracol.getInstancia().setSeñalCaracol(false);
                Corazon.getInstancia().setSeñalCorazon(false);
                Ojo.getInstancia().setSeñalOjo(false);
                Ship.getInstancia().setBanderaShip(false);
                señalTiempo = false;
                JOptionPane.showMessageDialog(null, "FELICIDADES GANO!!!");
            }
            timer2--;
            timer1++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;

    }

    public int getTimer2() {
        return timer2;
    }

    public void setTimer2(int timer2) {
        this.timer2 = timer2;
    }

    public int getTimer1() {
        return timer1;
    }

    public void setTimer1(int timer1) {
        this.timer1 = timer1;
    }

    public void obtenerCamuflajeShip(JButton ship) {
        this.ship = ship;
    }

    public void obtenerJtext1(JTextField tiempoC) {
        this.jTextFieldTiempoConsumido = tiempoC;
    }

    public void obtenerJtext2(JTextField tiempoR) {
        this.jTextFieldTiempoRestante = tiempoR;
    }

    public boolean isSeñalTiempo() {
        return señalTiempo;
    }

    public void setSeñalTiempo(boolean señalTiempo) {
        this.señalTiempo = señalTiempo;
    }

}
