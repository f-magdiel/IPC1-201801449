
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Mecanica {
    private String nombreActividadMecanica;
    private double precioMecanica;
    
    public Mecanica(String nombreMecanica, String precioMecanica){
    this.nombreActividadMecanica = nombreMecanica;
    this.precioMecanica = Double.parseDouble(precioMecanica);
    
    }

    public String getNombreActividadMecanica() {
        return nombreActividadMecanica;
    }

    public void setNombreActividadMecanica(String nombreActividadMecanica) {
        this.nombreActividadMecanica = nombreActividadMecanica;
    }

    public double getPrecioMecanica() {
        return precioMecanica;
    }

    public void setPrecioMecanica(double precioMecanica) {
        this.precioMecanica = precioMecanica;
    }
    
    
}
