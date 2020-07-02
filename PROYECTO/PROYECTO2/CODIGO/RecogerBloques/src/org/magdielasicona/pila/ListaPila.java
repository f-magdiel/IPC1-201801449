package org.magdielasicona.pila;

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

    //...............
    private static JTextArea areaTexto;
    private static int contador=0;
    private NodoPila cima;

    public ListaPila() {
        this.cima = null;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void insertarPila(String color, int valor) {
        contador++;
        NodoPila nuevo = new NodoPila(color, valor);

        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void retirarPila() {
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            cima = cima.getSiguiente();

        }
    }

    public void imprimir() {
        if (!esVacia()) {
            NodoPila aux = cima;
            do {
                System.out.println(aux.getValor() + "," + aux.getColor());
                aux = aux.getSiguiente();
            } while (aux != null);
        } else {
            System.out.println("PILA VACIA");
        }

    }

    public void imprimirArea() {

        int i = 0;

        if (!esVacia()) {
            NodoPila aux = cima;
            areaTexto.append("digraph G {\n");
            areaTexto.append(0 + "[label=\"" + "TOPE\"]" + "\n");
            do {
                i++;
                
                areaTexto.append(i + "[label=\"" + aux.getValor() + "," + aux.getColor() + "\"]" + "\n");
                if (i>=1) {
                    int iaux = i;
                iaux--;
                areaTexto.append(iaux + "->" + i + ";" + "\n");
                }
                aux = aux.getSiguiente();
            } while (aux != null);
            areaTexto.append("}\n");
        }

    }
   
    

    public void obtenerAreaPila(JTextArea area) {
        this.areaTexto = area;
    }

}
