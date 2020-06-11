
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Modelo {
    private int añoModelo;
    private double porcentajeDepreciaciónModelo;

    public Modelo(int añoModelo, double porcentajeDepreciaciónModelo) {
        this.añoModelo = añoModelo;
        this.porcentajeDepreciaciónModelo = porcentajeDepreciaciónModelo;
    }

    public int getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(int añoModelo) {
        this.añoModelo = añoModelo;
    }

    public double getPorcentajeDepreciaciónModelo() {
        return porcentajeDepreciaciónModelo;
    }

    public void setPorcentajeDepreciaciónModelo(double porcentajeDepreciaciónModelo) {
        this.porcentajeDepreciaciónModelo = porcentajeDepreciaciónModelo;
    }
    
    
    
    
    
}
