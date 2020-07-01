package org.magdielasciona.listaCircular;

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

    public ListaCircular() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insertar(String color, int valor) {
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
