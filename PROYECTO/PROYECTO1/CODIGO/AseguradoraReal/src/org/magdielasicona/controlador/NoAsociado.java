
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NoAsociado {
    private String nombreNoAsociado;
    private String teledonoNoAsociado;
    private String dpiNoAsociado;
    private double precioPagar;

    public NoAsociado(String nombreNoAsociado, String teledonoNoAsociado, String dpiNoAsociado, double precioPagar) {
        this.nombreNoAsociado = nombreNoAsociado;
        this.teledonoNoAsociado = teledonoNoAsociado;
        this.dpiNoAsociado = dpiNoAsociado;
        this.precioPagar = precioPagar;
    }

    public String getNombreNoAsociado() {
        return nombreNoAsociado;
    }

    public void setNombreNoAsociado(String nombreNoAsociado) {
        this.nombreNoAsociado = nombreNoAsociado;
    }

    public String getTeledonoNoAsociado() {
        return teledonoNoAsociado;
    }

    public void setTeledonoNoAsociado(String teledonoNoAsociado) {
        this.teledonoNoAsociado = teledonoNoAsociado;
    }

    public String getDpiNoAsociado() {
        return dpiNoAsociado;
    }

    public void setDpiNoAsociado(String dpiNoAsociado) {
        this.dpiNoAsociado = dpiNoAsociado;
    }

    public double getPrecioPagar() {
        return precioPagar;
    }

    public void setPrecioPagar(double precioPagar) {
        this.precioPagar = precioPagar;
    }
    
    
}
