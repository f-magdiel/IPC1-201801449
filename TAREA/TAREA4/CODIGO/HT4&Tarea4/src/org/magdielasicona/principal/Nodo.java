
package org.magdielasicona.principal;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Nodo {
    private String valor;
    private int id;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(String valor, int id) {
        this.valor = valor;
        this.id = id;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
