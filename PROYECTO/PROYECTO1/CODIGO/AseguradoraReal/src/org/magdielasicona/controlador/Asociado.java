
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Asociado {
  
     
    private String nombreAsociado;
    private String apellidoAsociado;
    private String dpiAsociado;
    private String telefonoAsociado;
    private String tipoVehiculoAsociado;
    private String usoVehiculoAsociado;
    private String marcaVehiculoAsociado;
    private String lineaVehiculoAsociado;
    private String modeloVehiculoAsociado;
    private double valorVehiculoAsociado;
    private double costoPrimaAsociado;
    private double costoDeducibleAsociado;
    
    private String mecanicaAsociado;
    private String precioMecanicaAsociado;
    private String repuestoAsociado;
    private String precioRepuestoAsociado;
    
    private String estadoSeguro;
    private String estadoUltimaPrima;

    public Asociado(String nombreAsociado, String apellidoAsociado, String dpiAsociado, String telefonoAsociado, String tipoVehiculoAsociado, String usoVehiculoAsociado, String marcaVehiculoAsociado, String lineaVehiculoAsociado, String modeloVehiculoAsociado, double valorVehiculoAsociado, double costoPrimaAsociado, double costoDeducibleAsociado, String mecanicaAsociado, String precioMecanicaAsociado, String repuestoAsociado, String precioRepuestoAsociado,String estadoSeguro,String estadoUltimaPrima) {
        this.nombreAsociado = nombreAsociado;
        this.apellidoAsociado = apellidoAsociado;
        this.dpiAsociado = dpiAsociado;
        this.telefonoAsociado = telefonoAsociado;
        this.tipoVehiculoAsociado = tipoVehiculoAsociado;
        this.usoVehiculoAsociado = usoVehiculoAsociado;
        this.marcaVehiculoAsociado = marcaVehiculoAsociado;
        this.lineaVehiculoAsociado = lineaVehiculoAsociado;
        this.modeloVehiculoAsociado = modeloVehiculoAsociado;
        this.valorVehiculoAsociado = valorVehiculoAsociado;
        this.costoPrimaAsociado = costoPrimaAsociado;
        this.costoDeducibleAsociado = costoDeducibleAsociado;
        this.mecanicaAsociado = mecanicaAsociado;
        this.precioMecanicaAsociado = precioMecanicaAsociado;
        this.repuestoAsociado = repuestoAsociado;
        this.precioRepuestoAsociado = precioRepuestoAsociado;
        this.estadoSeguro = estadoSeguro;
        this.estadoUltimaPrima = estadoUltimaPrima;
    }

    public String getEstadoSeguro() {
        return estadoSeguro;
    }

    public void setEstadoSeguro(String estadoSeguro) {
        this.estadoSeguro = estadoSeguro;
    }

    public String getEstadoUltimaPrima() {
        return estadoUltimaPrima;
    }

    public void setEstadoUltimaPrima(String estadoUltimaPrima) {
        this.estadoUltimaPrima = estadoUltimaPrima;
    }

    public String getNombreAsociado() {
        return nombreAsociado;
    }

    public void setNombreAsociado(String nombreAsociado) {
        this.nombreAsociado = nombreAsociado;
    }

    public String getApellidoAsociado() {
        return apellidoAsociado;
    }

    public void setApellidoAsociado(String apellidoAsociado) {
        this.apellidoAsociado = apellidoAsociado;
    }

    public String getDpiAsociado() {
        return dpiAsociado;
    }

    public void setDpiAsociado(String dpiAsociado) {
        this.dpiAsociado = dpiAsociado;
    }

    public String getTelefonoAsociado() {
        return telefonoAsociado;
    }

    public void setTelefonoAsociado(String telefonoAsociado) {
        this.telefonoAsociado = telefonoAsociado;
    }

    public String getTipoVehiculoAsociado() {
        return tipoVehiculoAsociado;
    }

    public void setTipoVehiculoAsociado(String tipoVehiculoAsociado) {
        this.tipoVehiculoAsociado = tipoVehiculoAsociado;
    }

    public String getUsoVehiculoAsociado() {
        return usoVehiculoAsociado;
    }

    public void setUsoVehiculoAsociado(String usoVehiculoAsociado) {
        this.usoVehiculoAsociado = usoVehiculoAsociado;
    }

    public String getMarcaVehiculoAsociado() {
        return marcaVehiculoAsociado;
    }

    public void setMarcaVehiculoAsociado(String marcaVehiculoAsociado) {
        this.marcaVehiculoAsociado = marcaVehiculoAsociado;
    }

    public String getLineaVehiculoAsociado() {
        return lineaVehiculoAsociado;
    }

    public void setLineaVehiculoAsociado(String lineaVehiculoAsociado) {
        this.lineaVehiculoAsociado = lineaVehiculoAsociado;
    }

    public String getModeloVehiculoAsociado() {
        return modeloVehiculoAsociado;
    }

    public void setModeloVehiculoAsociado(String modeloVehiculoAsociado) {
        this.modeloVehiculoAsociado = modeloVehiculoAsociado;
    }

    public double getValorVehiculoAsociado() {
        return valorVehiculoAsociado;
    }

    public void setValorVehiculoAsociado(double valorVehiculoAsociado) {
        this.valorVehiculoAsociado = valorVehiculoAsociado;
    }

    public double getCostoPrimaAsociado() {
        return costoPrimaAsociado;
    }

    public void setCostoPrimaAsociado(double costoPrimaAsociado) {
        this.costoPrimaAsociado = costoPrimaAsociado;
    }

    public double getCostoDeducibleAsociado() {
        return costoDeducibleAsociado;
    }

    public void setCostoDeducibleAsociado(double costoDeducibleAsociado) {
        this.costoDeducibleAsociado = costoDeducibleAsociado;
    }

    public String getMecanicaAsociado() {
        return mecanicaAsociado;
    }

    public void setMecanicaAsociado(String mecanicaAsociado) {
        this.mecanicaAsociado = mecanicaAsociado;
    }

    public String getPrecioMecanicaAsociado() {
        return precioMecanicaAsociado;
    }

    public void setPrecioMecanicaAsociado(String precioMecanicaAsociado) {
        this.precioMecanicaAsociado = precioMecanicaAsociado;
    }

    public String getRepuestoAsociado() {
        return repuestoAsociado;
    }

    public void setRepuestoAsociado(String repuestoAsociado) {
        this.repuestoAsociado = repuestoAsociado;
    }

    public String getPrecioRepuestoAsociado() {
        return precioRepuestoAsociado;
    }

    public void setPrecioRepuestoAsociado(String precioRepuestoAsociado) {
        this.precioRepuestoAsociado = precioRepuestoAsociado;
    }
    
    
    
}
