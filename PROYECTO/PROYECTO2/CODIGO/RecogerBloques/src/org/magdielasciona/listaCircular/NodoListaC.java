
package org.magdielasciona.listaCircular;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoListaC {
    
    private String color;
    private int valor;
    private NodoListaC siguiente;
    private NodoListaC anterior;

    public NodoListaC(String color, int valor) {
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

    public NodoListaC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaC anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
