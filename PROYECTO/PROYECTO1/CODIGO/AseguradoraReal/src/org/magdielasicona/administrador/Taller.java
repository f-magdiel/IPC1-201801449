
package org.magdielasicona.administrador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Taller {
    private String codigo;
    private String asociado;
    private String tercero;
    private String estado;
    private String estadopago;

    public Taller(String codigo, String asociado, String tercero, String estado, String estadopago) {
        this.codigo = codigo;
        this.asociado = asociado;
        this.tercero = tercero;
        this.estado = estado;
        this.estadopago = estadopago;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAsociado() {
        return asociado;
    }

    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadopago() {
        return estadopago;
    }

    public void setEstadopago(String estadopago) {
        this.estadopago = estadopago;
    }
    
    
}
