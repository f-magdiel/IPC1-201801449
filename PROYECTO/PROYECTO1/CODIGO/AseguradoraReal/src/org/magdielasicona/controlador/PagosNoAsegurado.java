
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class PagosNoAsegurado {
    private String codigoQ;
    private String dpi;
    private String tipo;
    private String total;
    private String fechaInicio;
    private String fechaFin;

    public PagosNoAsegurado(String codigoQ, String dpi, String tipo, String total, String fechaInicio, String fechaFin) {
        this.codigoQ = codigoQ;
        this.dpi = dpi;
        this.tipo = tipo;
        this.total = total;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getCodigoQ() {
        return codigoQ;
    }

    public void setCodigoQ(String codigoQ) {
        this.codigoQ = codigoQ;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
}
