package org.magdielasicona.cola;

import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaCola {

    private static ListaCola instanciaListaCola;

    public static ListaCola getInstancia() {
        if (instanciaListaCola == null) {
            instanciaListaCola = new ListaCola();
        }
        return instanciaListaCola;
    }
    //.................
    private NodoCola frente;
    private NodoCola fin;
    private static JTextArea areaTexto;

    public ListaCola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return frente == null;
    }
public void reiniciarListaCola(){
    frente =null;
    fin =null;
    }
    public void insertar(String color, int valor) {
        NodoCola nuevo = new NodoCola(color, valor);
        if (esVacia()) {
            frente = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public void imprimir() {

        if (!esVacia()) {
            NodoCola aux = frente;
            do {
                System.out.println(aux.getValor() + "," + aux.getColor());
                aux = aux.getSiguiente();
            } while (aux != null);
        } else {
            System.out.println("COLA VACIA");
        }

    }

    public void eliminarCola() {

        if (!esVacia()) {

            frente = frente.getSiguiente();
        } else {
            System.out.println("COLA VACIA");
        }

    }

    public void imprimirAreaCola() {
        int i = 0;
        if (!esVacia()) {
            NodoCola aux = frente;

            areaTexto.append("digraph G {\n");
            areaTexto.append(0 + "[label=\"" + "INICIO\"]" + "\n");
            do {
                i++;
                areaTexto.append(i + "[label=\"" + aux.getValor() + "," + aux.getColor() + "\"]" + "\n");
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

    public void obteneAreaCola(JTextArea area) {
        this.areaTexto = area;
    }
}
