
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Uso {
    private  String nombreUso;
    private double porcentajePolizaUso;

    public Uso(String nombreUso, String porcentajePolizaUso) {
        this.nombreUso = nombreUso;
        this.porcentajePolizaUso = Double.parseDouble(porcentajePolizaUso);
        
    }

    public String getNombreUso() {
        return nombreUso;
    }

    public void setNombreUso(String nombreUso) {
        this.nombreUso = nombreUso;
    }

    public double getPorcentajePolizaUso() {
        return porcentajePolizaUso;
    }

    public void setPorcentajePolizaUso(double porcentajePolizaUso) {
        this.porcentajePolizaUso = porcentajePolizaUso;
    }
    
    
    
}
