package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Asegurado {

    private String nombreAsegurado;
    private String apellidoAsegurado;
    private String dpiAsegurado;
    private String telefonoAsegurado;
    private String rolAsegurado;

    private double costoPrimaAsegurado;
    private double costoDeducibleAsegurado;
    private String estadoAsegurado;
    private double costoReal;
    private double pagoRequerido;
    private String codigo;

    public Asegurado(String nombreAsegurado, String apellidoAsegurado, String dpiAsegurado, String telefonoAsegurado, String rolAsegurado, double costoPrimaAsegurado, double costoDeducibleAsegurado, String estadoAsegurado, double costoReal, double pagoRequerido,String codigo) {
        this.nombreAsegurado = nombreAsegurado;
        this.apellidoAsegurado = apellidoAsegurado;
        this.dpiAsegurado = dpiAsegurado;
        this.telefonoAsegurado = telefonoAsegurado;
        this.rolAsegurado = rolAsegurado;
        this.costoPrimaAsegurado = costoPrimaAsegurado;
        this.costoDeducibleAsegurado = costoDeducibleAsegurado;
        this.estadoAsegurado = estadoAsegurado;
        this.costoReal = costoReal;
        this.pagoRequerido = pagoRequerido;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public String getApellidoAsegurado() {
        return apellidoAsegurado;
    }

    public void setApellidoAsegurado(String apellidoAsegurado) {
        this.apellidoAsegurado = apellidoAsegurado;
    }

    public String getDpiAsegurado() {
        return dpiAsegurado;
    }

    public void setDpiAsegurado(String dpiAsegurado) {
        this.dpiAsegurado = dpiAsegurado;
    }

    public String getTelefonoAsegurado() {
        return telefonoAsegurado;
    }

    public void setTelefonoAsegurado(String telefonoAsegurado) {
        this.telefonoAsegurado = telefonoAsegurado;
    }

    public String getRolAsegurado() {
        return rolAsegurado;
    }

    public void setRolAsegurado(String rolAsegurado) {
        this.rolAsegurado = rolAsegurado;
    }

    public double getCostoPrimaAsegurado() {
        return costoPrimaAsegurado;
    }

    public void setCostoPrimaAsegurado(double costoPrimaAsegurado) {
        this.costoPrimaAsegurado = costoPrimaAsegurado;
    }

    public double getCostoDeducibleAsegurado() {
        return costoDeducibleAsegurado;
    }

    public void setCostoDeducibleAsegurado(double costoDeducibleAsegurado) {
        this.costoDeducibleAsegurado = costoDeducibleAsegurado;
    }

    public String getEstadoAsegurado() {
        return estadoAsegurado;
    }

    public void setEstadoAsegurado(String estadoAsegurado) {
        this.estadoAsegurado = estadoAsegurado;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }

    public double getPagoRequerido() {
        return pagoRequerido;
    }

    public void setPagoRequerido(double pagoRequerido) {
        this.pagoRequerido = pagoRequerido;
    }
    
    
   
}
