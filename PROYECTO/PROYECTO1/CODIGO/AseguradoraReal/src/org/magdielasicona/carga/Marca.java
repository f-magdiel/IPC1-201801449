
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Marca {
    
    private String nombreMarca;
    private double porcentajePolizaMarca;

    public Marca(String nombreMarca, String porcentajePolizaMarca) {
        this.nombreMarca = nombreMarca;
        this.porcentajePolizaMarca = Double.parseDouble(porcentajePolizaMarca);
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public double getPorcentajePolizaMarca() {
        return porcentajePolizaMarca;
    }

    public void setPorcentajePolizaMarca(double porcentajePolizaMarca) {
        this.porcentajePolizaMarca = porcentajePolizaMarca;
    }
    
    
}
