
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Repuesto {
    private String nombreRepuesto;
    private double precioRepuesto;

    public Repuesto(String nombreRepuesto, String precioRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
        this.precioRepuesto = Double.parseDouble(precioRepuesto);
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public double getPrecioRepuesto() {
        return precioRepuesto;
    }

    public void setPrecioRepuesto(double precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }
    
    
}
