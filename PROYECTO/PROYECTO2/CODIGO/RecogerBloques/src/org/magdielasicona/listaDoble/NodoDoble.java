
package org.magdielasicona.listaDoble;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoDoble {
    
    private String color;
    private int valor;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(String color, int valor) {
        this.color = color;
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
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

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
    
}
