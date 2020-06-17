
package org.magdielasicona.fecha;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Pagos {
    
    private String dpiPagos;
    private String tipoPagos;
    private String totalPagos;
    private String fechaInicio;
    private String fechaFin;

    public Pagos(String dpiPagos, String tipoPagos, String totalPagos, String fechaInicio, String fechaFin) {
        this.dpiPagos = dpiPagos;
        this.tipoPagos = tipoPagos;
        this.totalPagos = totalPagos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getDpiPagos() {
        return dpiPagos;
    }

    public void setDpiPagos(String dpiPagos) {
        this.dpiPagos = dpiPagos;
    }

    public String getTipoPagos() {
        return tipoPagos;
    }

    public void setTipoPagos(String tipoPagos) {
        this.tipoPagos = tipoPagos;
    }

    public String getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(String totalPagos) {
        this.totalPagos = totalPagos;
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
