
package org.magdielasicona.pila;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoPila {
    private String color;
    private int valor;
    private NodoPila siguiente;

    public NodoPila(String color, int valor) {
        this.color = color;
        this.valor = valor;
        this.siguiente = null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
