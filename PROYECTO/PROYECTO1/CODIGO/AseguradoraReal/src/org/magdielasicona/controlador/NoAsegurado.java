
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NoAsegurado {
    private String nombreNoAsociado;
    private String apellidoNoAsociado;
    private String teledonoNoAsociado;
    private String dpiNoAsociado;
    private String codigo;
    private String rol;
    private double costoReal;
    private double precioPagar;

    public NoAsegurado(String nombreNoAsociado, String apellidoNoAsociado, String teledonoNoAsociado, String dpiNoAsociado, String codigo, String rol, double costoReal, double precioPagar) {
        this.nombreNoAsociado = nombreNoAsociado;
        this.apellidoNoAsociado = apellidoNoAsociado;
        this.teledonoNoAsociado = teledonoNoAsociado;
        this.dpiNoAsociado = dpiNoAsociado;
        this.codigo = codigo;
        this.rol = rol;
        this.costoReal = costoReal;
        this.precioPagar = precioPagar;
    }

    public String getNombreNoAsociado() {
        return nombreNoAsociado;
    }

    public void setNombreNoAsociado(String nombreNoAsociado) {
        this.nombreNoAsociado = nombreNoAsociado;
    }

    public String getApellidoNoAsociado() {
        return apellidoNoAsociado;
    }

    public void setApellidoNoAsociado(String apellidoNoAsociado) {
        this.apellidoNoAsociado = apellidoNoAsociado;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    public double getPrecioPagar() {
        return precioPagar;
    }

    public void setPrecioPagar(double precioPagar) {
        this.precioPagar = precioPagar;
    }

    

    
    
}
