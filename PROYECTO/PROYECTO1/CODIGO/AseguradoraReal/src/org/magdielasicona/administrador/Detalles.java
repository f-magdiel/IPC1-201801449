
package org.magdielasicona.administrador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Detalles {
    private String dpi;
    private String dpiTercero;
    private String codigo;
    private String precio;
    private String nombre;

    public Detalles(String dpi,String dpiTercero, String codigo, String precio, String nombre) {
        this.dpi = dpi;
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.dpiTercero = dpiTercero;
    }

    public String getDpiTercero() {
        return dpiTercero;
    }

    public void setDpiTercero(String dpiTercero) {
        this.dpiTercero = dpiTercero;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
