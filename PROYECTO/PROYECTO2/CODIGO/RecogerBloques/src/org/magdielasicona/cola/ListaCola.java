package org.magdielasicona.cola;

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

    public ListaCola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return frente == null;
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
        }else{
            System.out.println("COLA VACIA");
        }
       
    }
}
