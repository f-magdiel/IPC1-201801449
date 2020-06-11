
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Linea {
    private String nombreLinea;
    private  double porcentajePolizaLinea;

    public Linea(String nombreLinea, String porcentajePolizaLinea) {
        this.nombreLinea = nombreLinea;
        this.porcentajePolizaLinea = Double.parseDouble(porcentajePolizaLinea);
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public double getPorcentajePolizaLinea() {
        return porcentajePolizaLinea;
    }

    public void setPorcentajePolizaLinea(double porcentajePolizaLinea) {
        this.porcentajePolizaLinea = porcentajePolizaLinea;
    }
    
    
}
