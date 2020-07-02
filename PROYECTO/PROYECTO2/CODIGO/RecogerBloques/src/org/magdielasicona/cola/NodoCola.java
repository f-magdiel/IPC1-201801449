package org.magdielasicona.cola;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoCola {

    private String color;
    private int valor;
    private NodoCola siguiente;

    public NodoCola(String color, int valor) {
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

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    

}
