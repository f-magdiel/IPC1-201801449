/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.pila;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaPila {

    private static ListaPila instanciaListaPila;

    public static ListaPila getInstancia() {
        if (instanciaListaPila == null) {
            instanciaListaPila = new ListaPila();
        }
        return instanciaListaPila;
    }
    private static JTextArea areaTexto;
    private NodoPila cima;

    public ListaPila() {
        this.cima = null;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void insertarPila(String valor) {
        NodoPila nuevo = new NodoPila(valor);

        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void retirar() {
        if (!esVacia()) {

            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "POP");
        } else {
            JOptionPane.showMessageDialog(null, "PILA VACIA");
        }
    }

    public void obtenerArea(JTextArea area) {
        this.areaTexto = area;
    }

    public void imprimirArea() {

        int i = 0;

        if (!esVacia()) {
            NodoPila aux = cima;
            areaTexto.append("digraph G {\n");
            areaTexto.append(0 + "[label=\"" + "TOPE\"]" + "\n");
            do {
                i++;

                areaTexto.append(i + "[label=\"" + aux.getValor() + "\"]" + "\n");
                if (i >= 1) {
                    int iaux = i;
                    iaux--;
                    areaTexto.append(iaux + "->" + i + ";" + "\n");
                }
                aux = aux.getSiguiente();
            } while (aux != null);
            areaTexto.append("}\n");
        }

    }
}
