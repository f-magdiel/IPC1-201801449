package org.magdielasicona.listaDoble;

import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaDoble {

    private static ListaDoble instanciaListaDoble;

    public static ListaDoble getInstancia() {
        if (instanciaListaDoble == null) {
            instanciaListaDoble = new ListaDoble();
        }
        return instanciaListaDoble;
    }

    //........
    private NodoDoble cabeza;
    private static int contador = 0;
    private static JTextArea areaTexto;

    public ListaDoble() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;

    }
    public void reiniciarListaDoble(){
    cabeza =null;
    }

    public void agregar(String color, int valor) {
        contador++;
        NodoDoble nuevo = new NodoDoble(color, valor);

        if (esVacia()) {
            cabeza = nuevo;
        } else {
            NodoDoble aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

        }

    }

    public void imprimir() {

        NodoDoble aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValor() + "," + aux.getColor());
            aux = aux.getSiguiente();

        }
    }

    public void eliminarValiorDoble(int valor) {

        if (cabeza.getValor() == valor) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoDoble aux = cabeza;
            while (aux.getSiguiente() != null) {
                if (aux.getSiguiente().getValor() == valor) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimirAreaDoble() {
        if (!esVacia()) {
            NodoDoble aux = cabeza;
            int i = 0;
            areaTexto.append("digraph G {\n");
            while (aux != null) {
                i++;
                areaTexto.append(i + "[label=\"" + aux.getValor() + "," + aux.getColor() + "\"]" + "\n");
                if (i >= 2) {
                    int cont = i;
                    cont--;
                    areaTexto.append(cont + "->" + i + ";" + "\n");
                    areaTexto.append(i + "->" + cont + ";" + "\n");
                }
                aux = aux.getSiguiente();
            }
            areaTexto.append("}\n");
        }

    }

    public void obtenerAreaDoble(JTextArea area) {
        this.areaTexto = area;
    }

}
