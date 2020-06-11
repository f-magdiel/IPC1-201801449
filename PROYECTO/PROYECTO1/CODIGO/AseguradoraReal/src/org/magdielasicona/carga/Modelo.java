
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Modelo {
    private String añoModelo;
    private double porcentajeDepreciaciónModelo;

    public Modelo(String añoModelo, String porcentajeDepreciaciónModelo) {
        this.añoModelo = añoModelo;
        this.porcentajeDepreciaciónModelo = Double.parseDouble(porcentajeDepreciaciónModelo);
    }

    public String getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(String añoModelo) {
        this.añoModelo = añoModelo;
    }


    public double getPorcentajeDepreciaciónModelo() {
        return porcentajeDepreciaciónModelo;
    }

    public void setPorcentajeDepreciaciónModelo(double porcentajeDepreciaciónModelo) {
        this.porcentajeDepreciaciónModelo = porcentajeDepreciaciónModelo;
    }
    
    
    
    
    
}
