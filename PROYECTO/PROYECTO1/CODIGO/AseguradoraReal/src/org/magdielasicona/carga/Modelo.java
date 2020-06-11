
package org.magdielasicona.carga;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Modelo {
    private int añoModelo;
    private double porcentajeDepreciaciónModelo;

    public Modelo(String añoModelo, String porcentajeDepreciaciónModelo) {
        this.añoModelo = Integer.parseInt(añoModelo);
        this.porcentajeDepreciaciónModelo = Double.parseDouble(porcentajeDepreciaciónModelo);
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
