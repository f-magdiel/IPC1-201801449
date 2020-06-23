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
    //VARIABLES IMPORTANTES
    
    private static int punteo=0;
    private static int velocidadObjetos=1100;
    private JButton misil;
    private JButton rayo;

    int posOriginal;
    private boolean banderaMisil = true;

    @Override
    public void run() {
        Random rand = new Random();
        int randomRayo = rand.nextInt(4);
        int randomAsteroide = rand.nextInt(4);
        int randomCaracol = rand.nextInt(4);
        int randomOjo = rand.nextInt(4);
        int randomCorazon = rand.nextInt(4);
        MenuJuego menu = new MenuJuego();
        Rayo raio = new Rayo();
        Asteroide aste = new Asteroide();
        Caracol caracol = new Caracol();
        Corazon corazon = new Corazon();
        Ojo ojo = new Ojo();
        while (banderaMisil == true) {

            misil.setBounds(misil.getX(), misil.getY() - 10, misil.getWidth(), misil.getHeight());

            System.out.println("MISIL:" + misil.getX() + "-" + misil.getY());

            //AREA MISIL
            Area areaMisil = new Area(misil.getBounds());

            //MISIL VRS RAYO
            Area areaRayo = new Area(raio.getRayo().getBounds());

            if (areaMisil.intersects(areaRayo.getBounds2D())) {
                System.out.println("RANDO:" + randomRayo);
                if (velocidadObjetos > 100) {
                    velocidadObjetos= velocidadObjetos -200;
                    System.out.println("VELOCIDA:"+velocidadObjetos);
                }
                if (randomRayo == 0) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(269, -180, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomRayo == 1) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(161, -180, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomRayo == 2) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(377, -180, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                } else if (randomRayo == 3) {
                    System.out.println("COLISION MISIL Y RAYO");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    raio.getRayo().setBounds(485, -180, raio.getRayo().getWidth(), raio.getRayo().getHeight());
                    Rayo.getInstancia().setIndicadorRayo(true);
                    banderaMisil = false;
                }
            }

            //MISIL VRS ASTEROIDE
            Area areaAsteroide = new Area(aste.getAsteroide().getBounds());

            if (areaMisil.intersects(areaAsteroide.getBounds2D())) {
                System.out.println("RANDO:" + randomAsteroide);
                punteo+=100;
                if (randomAsteroide == 0) {
                    System.out.println("COLISION MISIL Y ASTEROIDE");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    aste.getAsteroide().setBounds(269, -90, aste.getAsteroide().getWidth(), aste.getAsteroide().getHeight());
                    Asteroide.getInstancia().setBanderaAsteroide(true);
                    banderaMisil = false;
                } else if (randomAsteroide == 1) {
                    System.out.println("COLISION MISIL Y ASTEROIDE");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    aste.getAsteroide().setBounds(161, -90, aste.getAsteroide().getWidth(), aste.getAsteroide().getHeight());
                    Asteroide.getInstancia().setBanderaAsteroide(true);
                    banderaMisil = false;
                } else if (randomAsteroide == 2) {
                    System.out.println("COLISION MISIL Y ASTEROIDE");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    aste.getAsteroide().setBounds(377, -90, aste.getAsteroide().getWidth(), aste.getAsteroide().getHeight());
                    Asteroide.getInstancia().setBanderaAsteroide(true);
                    banderaMisil = false;
                } else if (randomAsteroide == 3) {
                    System.out.println("COLISION MISIL Y ASTEROIDE");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    aste.getAsteroide().setBounds(485, -90, aste.getAsteroide().getWidth(), aste.getAsteroide().getHeight());
                    Asteroide.getInstancia().setBanderaAsteroide(true);
                    banderaMisil = false;
                }
            }

            //MISIL VRS CARACOL
            Area areaCaracol = new Area(caracol.getCaracol().getBounds());

            if (areaMisil.intersects(areaCaracol.getBounds2D())) {
                System.out.println("RANDO:" + randomCaracol);
                if (velocidadObjetos <1100) {
                    velocidadObjetos= velocidadObjetos + 200;
                    System.out.println("VELOCIDA:"+velocidadObjetos);
                }
                if (randomCaracol == 0) {
                    System.out.println("COLISION MISIL Y CARACOL");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    caracol.getCaracol().setBounds(269, -450, caracol.getCaracol().getWidth(), caracol.getCaracol().getHeight());
                    Caracol.getInstancia().setBanderaCaracol(true);
                    banderaMisil = false;
                } else if (randomCaracol == 1) {
                    System.out.println("COLISION MISIL Y CARACOL");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    caracol.getCaracol().setBounds(161, -450, caracol.getCaracol().getWidth(), caracol.getCaracol().getHeight());
                    Caracol.getInstancia().setBanderaCaracol(true);
                    banderaMisil = false;
                } else if (randomCaracol == 2) {
                    System.out.println("COLISION MISIL Y CARACOL");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    caracol.getCaracol().setBounds(377, -450, caracol.getCaracol().getWidth(), caracol.getCaracol().getHeight());
                    Caracol.getInstancia().setBanderaCaracol(true);
                    banderaMisil = false;
                } else if (randomCaracol == 3) {
                    System.out.println("COLISION MISIL Y CARACOL");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    caracol.getCaracol().setBounds(485, -450, caracol.getCaracol().getWidth(), caracol.getCaracol().getHeight());
                    Caracol.getInstancia().setBanderaCaracol(true);
                    banderaMisil = false;
                }
            }

            //MISIL VRS CORAZON
            Area areaCorazon = new Area(corazon.getCorazon().getBounds());

            if (areaMisil.intersects(areaCorazon.getBounds2D())) {
                System.out.println("RANDO:" + randomCorazon);
                if (randomCorazon == 0) {
                    System.out.println("COLISION MISIL Y CORAZON");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    corazon.getCorazon().setBounds(269, -360, corazon.getCorazon().getWidth(), corazon.getCorazon().getHeight());
                    Corazon.getInstancia().setBanderaCorazon(true);
                    banderaMisil = false;
                } else if (randomCorazon == 1) {
                    System.out.println("COLISION MISIL Y CORAZON");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    corazon.getCorazon().setBounds(161, -360, corazon.getCorazon().getWidth(), corazon.getCorazon().getHeight());
                    Corazon.getInstancia().setBanderaCorazon(true);
                    banderaMisil = false;
                } else if (randomCorazon == 2) {
                    System.out.println("COLISION MISIL Y CORAZON");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    corazon.getCorazon().setBounds(377, -360, corazon.getCorazon().getWidth(), corazon.getCorazon().getHeight());
                    Corazon.getInstancia().setBanderaCorazon(true);
                    banderaMisil = false;
                } else if (randomCorazon == 3) {
                    System.out.println("COLISION MISIL Y CORAZON");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    corazon.getCorazon().setBounds(485, -360, corazon.getCorazon().getWidth(), corazon.getCorazon().getHeight());
                    Corazon.getInstancia().setBanderaCorazon(true);
                    banderaMisil = false;
                }
            }

            //MISIL VRS OJO
            Area areaOjo = new Area(ojo.getOjo().getBounds());

            if (areaMisil.intersects(areaOjo.getBounds2D())) {
                System.out.println("RANDO:" + randomOjo);
                if (randomOjo == 0) {
                    System.out.println("COLISION MISIL Y OJO");
                    misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());
                    ojo.getOjo().setBounds(269, -270, ojo.getOjo().getWidth(), ojo.getOjo().getHeight());
                    Ojo.getInstancia().setBanderaOjo(true);
                    banderaMisil = false;
                } else if (randomOjo == 1) {
                    System.out.println("COLISION MISIL Y OJO");
                    misil.setBounds(-800, 550, misil.getWidth(), misil.getHeight());
                    ojo.getOjo().setBounds(161, -270, ojo.getOjo().getWidth(), ojo.getOjo().getHeight());
                    Ojo.getInstancia().setBanderaOjo(true);
                    banderaMisil = false;
                } else if (randomOjo == 2) {
                    System.out.println("COLISION MISIL Y OJO");
                    misil.setBounds(-800, 650, misil.getWidth(), misil.getHeight());
                    ojo.getOjo().setBounds(377, -270, ojo.getOjo().getWidth(), ojo.getOjo().getHeight());
                    Ojo.getInstancia().setBanderaOjo(true);
                    banderaMisil = false;
                } else if (randomOjo == 3) {
                    System.out.println("COLISION MISIL Y OJO");
                    misil.setBounds(-800, 750, misil.getWidth(), misil.getHeight());
                    ojo.getOjo().setBounds(485, -270, ojo.getOjo().getWidth(), ojo.getOjo().getHeight());
                    Ojo.getInstancia().setBanderaOjo(true);
                    banderaMisil = false;
                }
            }

            if (misil.getY() == -90) {
                misil.setBounds(-800, 450, misil.getWidth(), misil.getHeight());

                banderaMisil = false;
            }
            try {
                Thread.sleep(150);

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

    public int getVelocidadObjetos() {
        return velocidadObjetos;
    }

    public void setVelocidadObjetos(int velocidadObjetos) {
        this.velocidadObjetos = velocidadObjetos;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    

}
