
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Asociado {
    private String nombre;
    private String apellido;
    private String dpi;
    private String telefono;
    private String tipoVehiculo;
    private String usoVehiculo;
    private String marcaVehiculo;
    private String lineaVehiculo;
    private String modeloVehiculo;
    private double costoPrima;
    private double deducible;
    private double posibleCostoPrima;
    private double posibleDeducible;

    public Asociado(String nombre, String apellido, String dpi, String telefono, String tipoVehiculo, String usoVehiculo, String marcaVehiculo, String lineaVehiculo, String modeloVehiculo, double costoPrima, double deducible, double posibleCostoPrima, double posibleDeducible) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.telefono = telefono;
        this.tipoVehiculo = tipoVehiculo;
        this.usoVehiculo = usoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.lineaVehiculo = lineaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.costoPrima = costoPrima;
        this.deducible = deducible;
        this.posibleCostoPrima = posibleCostoPrima;
        this.posibleDeducible = posibleDeducible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getUsoVehiculo() {
        return usoVehiculo;
    }

    public void setUsoVehiculo(String usoVehiculo) {
        this.usoVehiculo = usoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getLineaVehiculo() {
        return lineaVehiculo;
    }

    public void setLineaVehiculo(String lineaVehiculo) {
        this.lineaVehiculo = lineaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public double getCostoPrima() {
        return costoPrima;
    }

    public void setCostoPrima(double costoPrima) {
        this.costoPrima = costoPrima;
    }

    public double getDeducible() {
        return deducible;
    }

    public void setDeducible(double deducible) {
        this.deducible = deducible;
    }

    public double getPosibleCostoPrima() {
        return posibleCostoPrima;
    }

    public void setPosibleCostoPrima(double posibleCostoPrima) {
        this.posibleCostoPrima = posibleCostoPrima;
    }

    public double getPosibleDeducible() {
        return posibleDeducible;
    }

    public void setPosibleDeducible(double posibleDeducible) {
        this.posibleDeducible = posibleDeducible;
    }
    
    
    
}
