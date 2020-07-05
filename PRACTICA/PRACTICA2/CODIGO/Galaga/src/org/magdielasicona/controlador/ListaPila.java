
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaPila {
    
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
     public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            cima = cima.getSiguiente();
            
        }
    }
}
