
package org.magdielasicona.fecha;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Seguro {
    private String fechaInicio;
    private String fechaFin;
    private String dpi;
    private String total;
   

    public Seguro(String fechaInicio, String fechaFin, String dpi,String total) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dpi = dpi;
       this.total = total;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    
    
    
}
