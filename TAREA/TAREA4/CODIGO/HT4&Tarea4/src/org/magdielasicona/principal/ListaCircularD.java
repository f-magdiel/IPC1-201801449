package org.magdielasicona.principal;

import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaCircularD {

    private static ListaCircularD instanciaListaCircularD;

    public static ListaCircularD getInstancia() {
        if (instanciaListaCircularD == null) {
            instanciaListaCircularD = new ListaCircularD();
        }
        return instanciaListaCircularD;
    }

    private Nodo cabeza;
    private Nodo fin;
    private static JTextArea area;
    private static int i = 0;
    private static int contador = 0;

    public ListaCircularD() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insercion(String valor, int id) {
        contador++;
        Nodo nuevo = new Nodo(valor, id);
        if (esVacia()) {
            cabeza = nuevo;
            fin = nuevo;
            fin.setSiguiente(cabeza);

        } else {
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
            fin = nuevo;
        }

    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = cabeza;
            // Posicion de los elementos de la lista.
            int i = 0;
            System.out.print("-> ");
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            } while (aux != cabeza);
        }
    }

    public void imprimirArea() {

        if (!esVacia()) {

            Nodo aux = cabeza;
            Nodo fin = this.fin;
            this.area.append("digraph G {\n");

            do {
                i++;
                area.append(i + "[label=\"" + aux.getId() + "," + aux.getValor() + "\"]" + "\n");

                if (i >= 2) {
                    int cont = i;
                    cont--;
                    area.append(cont + "->" + i + ";" + "\n");
                    if (contador == i) {
                        area.append(i + "->" + 1 + ";" + "\n");
                    }

                } else if (contador == 1) {
                    area.append(i + "->" + i + ";" + "\n");
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            i = 0;
            this.area.append("}\n");
        }

    }

    public void editar(String valor, int id) {

        Nodo aux = cabeza;
        do {
            if (aux.getId() == id) {

                aux.setValor(valor);
                break;
            }
            aux = aux.getSiguiente();
        } while (aux!=cabeza);
        
    }

    public void obtenerArea(JTextArea area) {
        this.area = area;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
