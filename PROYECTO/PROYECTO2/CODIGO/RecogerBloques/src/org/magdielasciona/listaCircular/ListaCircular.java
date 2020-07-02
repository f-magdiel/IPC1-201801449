package org.magdielasciona.listaCircular;

import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaCircular {

    private static ListaCircular instanciaListaCircular;

    public static ListaCircular getInstancia() {
        if (instanciaListaCircular == null) {
            instanciaListaCircular = new ListaCircular();
        }
        return instanciaListaCircular;
    }

    private NodoListaC cabeza;
    private NodoListaC fin;
    private static JTextArea areaTexto;
    private static int contador = 0;

    public ListaCircular() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insertar(String color, int valor) {
        contador++;
        NodoListaC nuevo = new NodoListaC(color, valor);
        if (esVacia()) {
            cabeza = nuevo;
            fin = nuevo;
            fin.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);

        } else {
            NodoListaC aux = cabeza;
            while (aux.getSiguiente() != cabeza) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
        }

    }

    public void imprimir() {

        if (!esVacia()) {
            NodoListaC aux = cabeza;

            do {
                System.out.println(aux.getValor() + "," + aux.getColor());
                aux = aux.getSiguiente();
            } while (aux != cabeza);

        } else {
            System.out.println("");
        }
    }

    public void imprimirAreaCircular() {
        if (!esVacia()) {
            NodoListaC aux = cabeza;
            int i = 0;
            areaTexto.append("digraph G {\n");
            do {
                i++;
                areaTexto.append(i + "[label=\"" + aux.getValor() + "," + aux.getColor() + "\"]" + "\n");

                if (i >= 2) {
                    int con = i;
                    con--;
                    areaTexto.append(con + "->" + i + ";" + "\n");
                    areaTexto.append(i + "->" + con + ";" + "\n");
                    if (contador == i) {

                        areaTexto.append(1 + "->" + i + ";" + "\n");
                        areaTexto.append(i + "->" + 1 + ";" + "\n");
                    }
                } else if (contador == 1) {
                    areaTexto.append(i + "->" + i + ";" + "\n");
                    areaTexto.append(i + "->" + i + ";" + "\n");
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            i = 0;
            areaTexto.append("}\n");
        }

    }

    public void eliminarValor(int valor) {
        contador--;
        if (!esVacia()) {
            NodoListaC aux = cabeza;
            do {
                if (aux.getSiguiente().getValor() == valor) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    break;
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);

        }

    }

    public void obtenerAreaCircular(JTextArea areacircular) {
        this.areaTexto = areacircular;
    }

    public NodoListaC getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaC cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaC getFin() {
        return fin;
    }

    public void setFin(NodoListaC fin) {
        this.fin = fin;
    }

}
