package org.magdielasciona.ht2;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Caballo implements Transporte {

    private String nombreCaballo;
    private String razaCaballo;
    private int edadCaballo;

    public Caballo(String nombreCaballo, String razaCaballo, int edadCaballo) {
        this.nombreCaballo = nombreCaballo;
        this.razaCaballo = razaCaballo;
        this.edadCaballo = edadCaballo;
    }

    @Override
    public void avanzar() {
        System.out.println("AVANCE-CABALLO-"+getNombreCaballo()+"-"+getRazaCaballo()+"-"+getEdadCaballo());
    }

    @Override
    public void frenar() {
       System.out.println("FRENE-CABALLO-"+getNombreCaballo()+"-"+getRazaCaballo()+"-"+getEdadCaballo());
    }

    public String getNombreCaballo() {
        return nombreCaballo;
    }

    public void setNombreCaballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    public String getRazaCaballo() {
        return razaCaballo;
    }

    public void setRazaCaballo(String razaCaballo) {
        this.razaCaballo = razaCaballo;
    }

    public int getEdadCaballo() {
        return edadCaballo;
    }

    public void setEdadCaballo(int edadCaballo) {
        this.edadCaballo = edadCaballo;
    }

}
