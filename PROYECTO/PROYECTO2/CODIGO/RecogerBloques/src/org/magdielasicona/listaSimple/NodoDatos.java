
package org.magdielasicona.listaSimple;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NodoDatos {
    
    private int columana;
    private int fila;
    private int valor;
    private String color;
    private NodoDatos siguiente;

    public NodoDatos(int columana, int fila, int valor, String color) {
        this.columana = columana;
        this.fila = fila;
        this.valor = valor;
        this.color = color;
    }

    public int getColumana() {
        return columana;
    }

    public void setColumana(int columana) {
        this.columana = columana;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NodoDatos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDatos siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
