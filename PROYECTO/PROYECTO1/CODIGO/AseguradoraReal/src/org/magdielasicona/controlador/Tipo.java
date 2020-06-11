
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tipo {
    private String nombreTipo;
    private double valorMaximoTipo;

    public Tipo(String nombreTipo, String valorMaximoTipo) {
        this.nombreTipo = nombreTipo;
        this.valorMaximoTipo = Double.parseDouble(valorMaximoTipo);
    }

    Tipo() {
       
    }
    

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public double getValorMaximoTipo() {
        return valorMaximoTipo;
    }

    public void setValorMaximoTipo(double valorMaximoTipo) {
        this.valorMaximoTipo = valorMaximoTipo;
    }
    
    
}
