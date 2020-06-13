
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Solicitante {
    
     
    
   
    
    private String nombreCandidato;
    private String apellidoCandidato;
    private String dpiCandidato;
    private String telefonoCandidato;
    private String tipoVehiculoCandidato;
    private String usoVehiculoCandidato;
    private String marcaVehiculoCandidato;
    private String lineaVehiculoCandidato;
    private String modeloVehiculoCandidato;
    private double valorVehiculoCandidato;
    private double costoPrimaCandidato;
    private double costoDeducibleCandidato;
    
    private String mecanica;
    private String precioMecanica;
    private String repuesto;
    private String precioRepuesto;
   
    
    
    
   
   
    
    
                                                                                                                                                                                                                  //Aqui empieza                                                                  
    public Solicitante(String nombre,String apellido,String dpi,String telefono,String tipoVehiculo,String usoVehiculo,String marca,String linea,String modelo,double valorVehiculo,String prima,String deducible,String mecanica,String precioMecanica,String repuesto,String precioRepuesto){
    this.nombreCandidato = nombre;
    this.apellidoCandidato = apellido;
    this.dpiCandidato = dpi;
    this.telefonoCandidato = telefono;
    this.tipoVehiculoCandidato = tipoVehiculo;
    this.usoVehiculoCandidato = usoVehiculo;
    this.marcaVehiculoCandidato = marca;
    this.lineaVehiculoCandidato = linea;
    this.modeloVehiculoCandidato = modelo;
    this.valorVehiculoCandidato = valorVehiculo;
    this.costoPrimaCandidato = Double.parseDouble(prima);
    this.costoDeducibleCandidato = Double.parseDouble(deducible);
    
    this.mecanica = mecanica;
    this.precioMecanica = precioMecanica;
    this.repuesto = repuesto;
    this.precioRepuesto = precioRepuesto;
    
    
    }

    public String getMecanica() {
        return mecanica;
    }

    public void setMecanica(String mecanica) {
        this.mecanica = mecanica;
    }

    public String getPrecioMecanica() {
        return precioMecanica;
    }

    public void setPrecioMecanica(String precioMecanica) {
        this.precioMecanica = precioMecanica;
    }

    public String getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    public String getPrecioRepuesto() {
        return precioRepuesto;
    }

    public void setPrecioRepuesto(String precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }

    
    
    
    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public String getApellidoCandidato() {
        return apellidoCandidato;
    }

    public void setApellidoCandidato(String apellidoCandidato) {
        this.apellidoCandidato = apellidoCandidato;
    }

    public String getDpiCandidato() {
        return dpiCandidato;
    }

    public void setDpiCandidato(String dpiCandidato) {
        this.dpiCandidato = dpiCandidato;
    }

    public String getTelefonoCandidato() {
        return telefonoCandidato;
    }

    public void setTelefonoCandidato(String telefonoCandidato) {
        this.telefonoCandidato = telefonoCandidato;
    }

    public String getTipoVehiculoCandidato() {
        return tipoVehiculoCandidato;
    }

    public void setTipoVehiculoCandidato(String tipoVehiculoCandidato) {
        this.tipoVehiculoCandidato = tipoVehiculoCandidato;
    }

    public String getUsoVehiculoCandidato() {
        return usoVehiculoCandidato;
    }

    public void setUsoVehiculoCandidato(String usoVehiculoCandidato) {
        this.usoVehiculoCandidato = usoVehiculoCandidato;
    }

    public String getMarcaVehiculoCandidato() {
        return marcaVehiculoCandidato;
    }

    public void setMarcaVehiculoCandidato(String marcaVehiculoCandidato) {
        this.marcaVehiculoCandidato = marcaVehiculoCandidato;
    }

    public String getLineaVehiculoCandidato() {
        return lineaVehiculoCandidato;
    }

    public void setLineaVehiculoCandidato(String lineaVehiculoCandidato) {
        this.lineaVehiculoCandidato = lineaVehiculoCandidato;
    }

    public String getModeloVehiculoCandidato() {
        return modeloVehiculoCandidato;
    }

    public void setModeloVehiculoCandidato(String modeloVehiculoCandidato) {
        this.modeloVehiculoCandidato = modeloVehiculoCandidato;
    }

    public double getValorVehiculoCandidato() {
        return valorVehiculoCandidato;
    }

    public void setValorVehiculoCandidato(double valorVehiculoCandidato) {
        this.valorVehiculoCandidato = valorVehiculoCandidato;
    }

    public double getCostoPrimaCandidato() {
        return costoPrimaCandidato;
    }

    public void setCostoPrimaCandidato(double costoPrimaCandidato) {
        this.costoPrimaCandidato = costoPrimaCandidato;
    }

    public double getCostoDeducibleCandidato() {
        return costoDeducibleCandidato;
    }

    public void setCostoDeducibleCandidato(double costoDeducibleCandidato) {
        this.costoDeducibleCandidato = costoDeducibleCandidato;
    }
    
    
    
    
    
    
}
