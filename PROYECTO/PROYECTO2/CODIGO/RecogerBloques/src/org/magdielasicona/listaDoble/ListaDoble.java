package org.magdielasicona.listaDoble;

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

    public ListaDoble() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;

    }

    public void agregar(String color, int valor) {
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

}
