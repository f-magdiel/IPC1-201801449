
package org.magdielasicona.fecha;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Seguro {
    private String fechaInicio;
    private String fechaFin;
    private String dpi;
    private String correlativo;
    private String poliza;
    private String total;

    public Seguro(String fechaInicio, String fechaFin, String dpi, String correlativo, String poliza, String total) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dpi = dpi;
        this.correlativo = correlativo;
        this.poliza = poliza;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
