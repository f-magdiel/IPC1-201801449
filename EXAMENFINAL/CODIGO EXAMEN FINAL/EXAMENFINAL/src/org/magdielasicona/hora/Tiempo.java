package org.magdielasicona.hora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.magdielasicona.menu.HiloCinco;
import org.magdielasicona.menu.HiloCuatro;
import org.magdielasicona.menu.HiloDos;
import org.magdielasicona.menu.HiloSeis;
import org.magdielasicona.menu.HiloSiete;
import org.magdielasicona.menu.HiloTres;
import org.magdielasicona.menu.HiloUno;

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

    private static JTextField hora;
    private static int cont = 20;
    private static boolean banderaTiempo = true;

    @Override
    public void run() {
        while (banderaTiempo == true) {
            if (cont == 0) {
                HiloUno.getInstancia().setBanderaHilo1(false);
                HiloDos.getInstancia().setBanderaHilo2(false);
                HiloTres.getInstancia().setBanderaHilo3(false);
                HiloCuatro.getInstancia().setBanderaHilo4(false);
                HiloCinco.getInstancia().setBanderaHilo5(false);
                HiloSeis.getInstancia().setBanderaHilo6(false);
                HiloSiete.getInstancia().setBanderaHilo7(false);
                this.banderaTiempo = false;
            }
            this.hora.setText(String.valueOf(cont));
            cont--;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void obtenerTiempo(JTextField tiempo) {
        this.hora = tiempo;
    }

}
