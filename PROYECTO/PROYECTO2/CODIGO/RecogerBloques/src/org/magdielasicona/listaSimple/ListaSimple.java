package org.magdielasicona.listaSimple;

import javax.swing.JTextArea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ListaSimple {

    private static ListaSimple instanciaListaSimple;

    public static ListaSimple getInstancia() {
        if (instanciaListaSimple == null) {
            instanciaListaSimple = new ListaSimple();
        }
        return instanciaListaSimple;
    }

    private NodoDatos cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }
    private static JTextArea areaTexto;

    public void insertarDatos(int fila, int columna, int valor, String color) {
        NodoDatos nuevo = new NodoDatos(fila, columna, valor, color);
        if (esVacia()) {
            this.setCabeza(nuevo);
        } else {
            NodoDatos aux = this.getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void imprimir() {

        NodoDatos aux = this.getCabeza();
        int i = 1;
        while (aux != null) {

            System.out.println(aux.getFila() + "," + aux.getColumana() + "," + aux.getValor() + "," + aux.getColor());
            aux = aux.getSiguiente();
            i++;
        }

    }

    public void imprimirArea() {
        NodoDatos auxi = this.getCabeza();
        int i = 0;
        areaTexto.append("digraph G {\n");
        while (auxi != null) {
            i++;
            areaTexto.append(i + "[label=\"" +auxi.getValor()+"," + auxi.getColor() +"\"]" +"\n");
            auxi = auxi.getSiguiente();
            if (i>=2) {
                int iaux=i;
                iaux--;
                areaTexto.append(iaux+"->"+i+";"+"\n");
            }
            

        }
        areaTexto.append("}");

    }

    public void obtenerArea(JTextArea areaText) {
        this.areaTexto = areaText;
    }

    public NodoDatos getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDatos cabeza) {
        this.cabeza = cabeza;
    }

}
