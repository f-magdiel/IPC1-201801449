package org.magdielasicona.pila;

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

    private NodoPila cima;

    public ListaPila() {
        this.cima = null;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void insertarPila(String color, int valor) {
        NodoPila nuevo = new NodoPila(color, valor);
        
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void retirar() {
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
        } while (aux!=null);
        }else{
            System.out.println("PILA VACIA");
        }

    }

}
