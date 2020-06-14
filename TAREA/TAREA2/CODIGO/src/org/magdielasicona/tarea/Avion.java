
package org.magdielasicona.tarea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Avion extends Transporte{
    private int pasajeroAvion;
    private String marcaAvion;
    private String modeloAvion;

    public Avion(int pasajeroAvion, String marcaAvion, String modeloAvion) {
        this.pasajeroAvion = pasajeroAvion;
        this.marcaAvion = marcaAvion;
        this.modeloAvion = modeloAvion;
    }
   

    
    @Override
    public void avanzar() {
        System.out.println("AVANCE - AVION -"+getPasajeroAvion()+" - "+getMarcaAvion()+" - "+getModeloAvion());
    }
    
    @Override
    public void frenar() {
        System.out.println("FRENE - AVION -"+getPasajeroAvion()+" - "+getMarcaAvion()+" - "+getModeloAvion());
    }

    public int getPasajeroAvion() {
        return pasajeroAvion;
    }

    public void setPasajeroAvion(int pasajeroAvion) {
        this.pasajeroAvion = pasajeroAvion;
    }

    public String getMarcaAvion() {
        return marcaAvion;
    }

    public void setMarcaAvion(String marcaAvion) {
        this.marcaAvion = marcaAvion;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }
    
}
