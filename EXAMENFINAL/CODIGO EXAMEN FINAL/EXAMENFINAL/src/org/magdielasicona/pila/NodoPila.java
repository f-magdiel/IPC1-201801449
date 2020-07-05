
package org.magdielasicona.pila;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoPila {
    private String valor;
    private NodoPila siguiente;

    public NodoPila(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
