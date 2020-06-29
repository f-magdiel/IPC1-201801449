package org.magdielasicona.listaSimple;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

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
    private String color;
    //Botones
    private static JButton btn00;
    private static JButton btn01;
    private static JButton btn02;
    private static JButton btn03;
    private static JButton btn04;
    private static JButton btn05;
    private static JButton btn06;

    private static JButton btn10;
    private static JButton btn11;
    private static JButton btn12;
    private static JButton btn13;
    private static JButton btn14;
    private static JButton btn15;
    private static JButton btn16;

    private static JButton btn20;
    private static JButton btn21;
    private static JButton btn22;
    private static JButton btn23;
    private static JButton btn24;
    private static JButton btn25;
    private static JButton btn26;

    private static JButton btn30;
    private static JButton btn31;
    private static JButton btn32;
    private static JButton btn33;
    private static JButton btn34;
    private static JButton btn35;
    private static JButton btn36;

    private static JButton btn40;
    private static JButton btn41;
    private static JButton btn42;
    private static JButton btn43;
    private static JButton btn44;
    private static JButton btn45;
    private static JButton btn46;

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
            areaTexto.append(i + "[label=\"" + auxi.getValor() + "," + auxi.getColor() + "\"]" + "\n");
            auxi = auxi.getSiguiente();
            if (i >= 2) {
                int iaux = i;
                iaux--;
                areaTexto.append(iaux + "->" + i + ";" + "\n");
            }

        }
        areaTexto.append("}");

    }

    public void llenarTabla() {
        NodoDatos aux = this.getCabeza();
        while (aux != null) {
            String boton = aux.getFila() + "" + aux.getColumana();
            String color = aux.getColor();
            int valor = aux.getValor();
            System.out.println(boton);
            switch (boton) {
                case "00":
                    //NO 
                    break;
                case "01":
                    if (color.equals("ROJO")) {
                        this.btn01.setText(String.valueOf(valor));
                        this.btn01.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn01.setText(String.valueOf(valor));
                        this.btn01.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn01.setText(String.valueOf(valor));
                        this.btn01.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn01.setText(String.valueOf(valor));
                        this.btn01.setBackground(Color.green);
                    }
                    break;
                case "02":
                    if (color.equals("ROJO")) {
                        this.btn02.setText(String.valueOf(valor));
                        this.btn02.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn02.setText(String.valueOf(valor));
                        this.btn02.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn02.setText(String.valueOf(valor));
                        this.btn02.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn02.setText(String.valueOf(valor));
                        this.btn02.setBackground(Color.green);
                    }
                    break;
                case "03":
                    if (color.equals("ROJO")) {
                        this.btn03.setText(String.valueOf(valor));
                        this.btn03.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn03.setText(String.valueOf(valor));
                        this.btn03.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn03.setText(String.valueOf(valor));
                        this.btn03.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn03.setText(String.valueOf(valor));
                        this.btn03.setBackground(Color.green);
                    }
                    break;
                case "04":
                    if (color.equals("ROJO")) {
                        this.btn04.setText(String.valueOf(valor));
                        this.btn04.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn04.setText(String.valueOf(valor));
                        this.btn04.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn04.setText(String.valueOf(valor));
                        this.btn04.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn04.setText(String.valueOf(valor));
                        this.btn04.setBackground(Color.green);
                    }
                    break;
                case "05":
                    if (color.equals("ROJO")) {
                        this.btn05.setText(String.valueOf(valor));
                        this.btn05.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn05.setText(String.valueOf(valor));
                        this.btn05.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn05.setText(String.valueOf(valor));
                        this.btn05.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn05.setText(String.valueOf(valor));
                        this.btn05.setBackground(Color.green);
                    }
                    break;
                case "06":
                    if (color.equals("ROJO")) {
                        this.btn06.setText(String.valueOf(valor));
                        this.btn06.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn06.setText(String.valueOf(valor));
                        this.btn06.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn06.setText(String.valueOf(valor));
                        this.btn06.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn06.setText(String.valueOf(valor));
                        this.btn06.setBackground(Color.green);
                    }
                    break;
                case "10":
                    if (color.equals("ROJO")) {
                        this.btn10.setText(String.valueOf(valor));
                        this.btn10.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn10.setText(String.valueOf(valor));
                        this.btn10.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn10.setText(String.valueOf(valor));
                        this.btn10.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn10.setText(String.valueOf(valor));
                        this.btn10.setBackground(Color.green);
                    }
                    break;
                case "11":
                    if (color.equals("ROJO")) {
                        this.btn11.setText(String.valueOf(valor));
                        this.btn11.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn11.setText(String.valueOf(valor));
                        this.btn11.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn11.setText(String.valueOf(valor));
                        this.btn11.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn11.setText(String.valueOf(valor));
                        this.btn11.setBackground(Color.green);
                    }
                    break;
                case "12":
                    if (color.equals("ROJO")) {
                        this.btn12.setText(String.valueOf(valor));
                        this.btn12.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn12.setText(String.valueOf(valor));
                        this.btn12.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn12.setText(String.valueOf(valor));
                        this.btn12.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn12.setText(String.valueOf(valor));
                        this.btn12.setBackground(Color.green);
                    }
                    break;
                case "13":
                    if (color.equals("ROJO")) {
                        this.btn13.setText(String.valueOf(valor));
                        this.btn13.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn13.setText(String.valueOf(valor));
                        this.btn13.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn13.setText(String.valueOf(valor));
                        this.btn13.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn13.setText(String.valueOf(valor));
                        this.btn13.setBackground(Color.green);
                    }
                    break;
                case "14":
                    if (color.equals("ROJO")) {
                        this.btn14.setText(String.valueOf(valor));
                        this.btn14.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn14.setText(String.valueOf(valor));
                        this.btn14.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn14.setText(String.valueOf(valor));
                        this.btn14.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn14.setText(String.valueOf(valor));
                        this.btn14.setBackground(Color.green);
                    }
                    break;
                case "15":
                    if (color.equals("ROJO")) {
                        this.btn15.setText(String.valueOf(valor));
                        this.btn15.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn15.setText(String.valueOf(valor));
                        this.btn15.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn15.setText(String.valueOf(valor));
                        this.btn15.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn15.setText(String.valueOf(valor));
                        this.btn15.setBackground(Color.green);
                    }
                    break;
                case "16":
                    if (color.equals("ROJO")) {
                        this.btn16.setText(String.valueOf(valor));
                        this.btn16.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn16.setText(String.valueOf(valor));
                        this.btn16.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn16.setText(String.valueOf(valor));
                        this.btn16.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn16.setText(String.valueOf(valor));
                        this.btn16.setBackground(Color.green);
                    }
                    break;
                case "20":
                    if (color.equals("ROJO")) {
                        this.btn20.setText(String.valueOf(valor));
                        this.btn20.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn20.setText(String.valueOf(valor));
                        this.btn20.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn20.setText(String.valueOf(valor));
                        this.btn20.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn20.setText(String.valueOf(valor));
                        this.btn20.setBackground(Color.green);
                    }
                    break;
                case "21":
                    if (color.equals("ROJO")) {
                        this.btn21.setText(String.valueOf(valor));
                        this.btn21.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn21.setText(String.valueOf(valor));
                        this.btn21.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn21.setText(String.valueOf(valor));
                        this.btn21.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn21.setText(String.valueOf(valor));
                        this.btn21.setBackground(Color.green);
                    }
                    break;
                case "22":
                    if (color.equals("ROJO")) {
                        this.btn22.setText(String.valueOf(valor));
                        this.btn22.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn22.setText(String.valueOf(valor));
                        this.btn22.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn22.setText(String.valueOf(valor));
                        this.btn22.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn22.setText(String.valueOf(valor));
                        this.btn22.setBackground(Color.green);
                    }
                    break;
                case "23":
                    if (color.equals("ROJO")) {
                        this.btn23.setText(String.valueOf(valor));
                        this.btn23.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn23.setText(String.valueOf(valor));
                        this.btn23.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn23.setText(String.valueOf(valor));
                        this.btn23.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn23.setText(String.valueOf(valor));
                        this.btn23.setBackground(Color.green);
                    }
                    break;
                case "24":
                    if (color.equals("ROJO")) {
                        this.btn24.setText(String.valueOf(valor));
                        this.btn24.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn24.setText(String.valueOf(valor));
                        this.btn24.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn24.setText(String.valueOf(valor));
                        this.btn24.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn24.setText(String.valueOf(valor));
                        this.btn24.setBackground(Color.green);
                    }
                    break;
                case "25":
                    if (color.equals("ROJO")) {
                        this.btn25.setText(String.valueOf(valor));
                        this.btn25.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn25.setText(String.valueOf(valor));
                        this.btn25.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn25.setText(String.valueOf(valor));
                        this.btn25.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn25.setText(String.valueOf(valor));
                        this.btn25.setBackground(Color.green);
                    }
                    break;
                case "26":
                    if (color.equals("ROJO")) {
                        this.btn26.setText(String.valueOf(valor));
                        this.btn26.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn26.setText(String.valueOf(valor));
                        this.btn26.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn26.setText(String.valueOf(valor));
                        this.btn26.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn26.setText(String.valueOf(valor));
                        this.btn26.setBackground(Color.green);
                    }
                    break;
                case "30":
                    if (color.equals("ROJO")) {
                        this.btn30.setText(String.valueOf(valor));
                        this.btn30.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn30.setText(String.valueOf(valor));
                        this.btn30.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn30.setText(String.valueOf(valor));
                        this.btn30.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn30.setText(String.valueOf(valor));
                        this.btn30.setBackground(Color.green);
                    }
                    break;
                case "31":
                    if (color.equals("ROJO")) {
                        this.btn31.setText(String.valueOf(valor));
                        this.btn31.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn31.setText(String.valueOf(valor));
                        this.btn31.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn31.setText(String.valueOf(valor));
                        this.btn31.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn31.setText(String.valueOf(valor));
                        this.btn31.setBackground(Color.green);
                    }
                    break;
                case "32":
                    if (color.equals("ROJO")) {
                        this.btn32.setText(String.valueOf(valor));
                        this.btn32.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn32.setText(String.valueOf(valor));
                        this.btn32.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn32.setText(String.valueOf(valor));
                        this.btn32.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn32.setText(String.valueOf(valor));
                        this.btn32.setBackground(Color.green);
                    }
                    break;
                case "33":
                    if (color.equals("ROJO")) {
                        this.btn33.setText(String.valueOf(valor));
                        this.btn33.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn33.setText(String.valueOf(valor));
                        this.btn33.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn33.setText(String.valueOf(valor));
                        this.btn33.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn33.setText(String.valueOf(valor));
                        this.btn33.setBackground(Color.green);
                    }
                    break;
                case "34":
                    if (color.equals("ROJO")) {
                        this.btn34.setText(String.valueOf(valor));
                        this.btn34.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn34.setText(String.valueOf(valor));
                        this.btn34.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn34.setText(String.valueOf(valor));
                        this.btn34.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn34.setText(String.valueOf(valor));
                        this.btn34.setBackground(Color.green);
                    }
                    break;
                case "35":
                    if (color.equals("ROJO")) {
                        this.btn35.setText(String.valueOf(valor));
                        this.btn35.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn35.setText(String.valueOf(valor));
                        this.btn35.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn35.setText(String.valueOf(valor));
                        this.btn35.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn35.setText(String.valueOf(valor));
                        this.btn35.setBackground(Color.green);
                    }
                    break;
                case "36":
                    if (color.equals("ROJO")) {
                        this.btn36.setText(String.valueOf(valor));
                        this.btn36.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn36.setText(String.valueOf(valor));
                        this.btn36.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn36.setText(String.valueOf(valor));
                        this.btn36.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn36.setText(String.valueOf(valor));
                        this.btn36.setBackground(Color.green);
                    }
                    break;
                case "40":
                    if (color.equals("ROJO")) {
                        this.btn40.setText(String.valueOf(valor));
                        this.btn40.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn40.setText(String.valueOf(valor));
                        this.btn40.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn40.setText(String.valueOf(valor));
                        this.btn40.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn40.setText(String.valueOf(valor));
                        this.btn40.setBackground(Color.green);
                    }
                    break;
                case "41":
                    if (color.equals("ROJO")) {
                        this.btn41.setText(String.valueOf(valor));
                        this.btn41.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn41.setText(String.valueOf(valor));
                        this.btn41.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn41.setText(String.valueOf(valor));
                        this.btn41.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn41.setText(String.valueOf(valor));
                        this.btn41.setBackground(Color.green);
                    }
                    break;
                case "42":
                    if (color.equals("ROJO")) {
                        this.btn42.setText(String.valueOf(valor));
                        this.btn42.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn42.setText(String.valueOf(valor));
                        this.btn42.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn42.setText(String.valueOf(valor));
                        this.btn42.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn42.setText(String.valueOf(valor));
                        this.btn42.setBackground(Color.green);
                    }
                    break;
                case "43":
                    if (color.equals("ROJO")) {
                        this.btn43.setText(String.valueOf(valor));
                        this.btn43.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn43.setText(String.valueOf(valor));
                        this.btn43.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn43.setText(String.valueOf(valor));
                        this.btn43.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn43.setText(String.valueOf(valor));
                        this.btn43.setBackground(Color.green);
                    }
                    break;
                case "44":
                    if (color.equals("ROJO")) {
                        this.btn44.setText(String.valueOf(valor));
                        this.btn44.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn44.setText(String.valueOf(valor));
                        this.btn44.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn44.setText(String.valueOf(valor));
                        this.btn44.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn44.setText(String.valueOf(valor));
                        this.btn44.setBackground(Color.green);
                    }
                    break;
                case "45":
                    if (color.equals("ROJO")) {
                        this.btn45.setText(String.valueOf(valor));
                        this.btn45.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn45.setText(String.valueOf(valor));
                        this.btn45.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn45.setText(String.valueOf(valor));
                        this.btn45.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn45.setText(String.valueOf(valor));
                        this.btn45.setBackground(Color.green);
                    }
                    break;
                case "46":
                    if (color.equals("ROJO")) {
                        this.btn46.setText(String.valueOf(valor));
                        this.btn46.setBackground(Color.red);

                    } else if (color.equals("AZUL")) {
                        this.btn46.setText(String.valueOf(valor));
                        this.btn46.setBackground(Color.blue);

                    } else if (color.equals("AMARILLO")) {
                        this.btn46.setText(String.valueOf(valor));
                        this.btn46.setBackground(Color.yellow);

                    } else if (color.equals("VERDE")) {
                        this.btn46.setText(String.valueOf(valor));
                        this.btn46.setBackground(Color.green);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "VALOR FUERA DE RANGO");
                    break;

            }
            aux = aux.getSiguiente();
        }
        this.btn00.setBackground(Color.black);
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

    //Metodos Obtener
    public void obtener00(JButton btn00) {
        this.btn00 = btn00;
    }

    public void obtener01(JButton btn01) {
        this.btn01 = btn01;
    }

    public void obtener02(JButton btn02) {
        this.btn02 = btn02;
    }

    public void obtener03(JButton btn03) {
        this.btn03 = btn03;
    }

    public void obtener04(JButton btn04) {
        this.btn04 = btn04;
    }

    public void obtener05(JButton btn05) {
        this.btn05 = btn05;
    }

    public void obtener06(JButton btn06) {
        this.btn06 = btn06;
    }

    public void obtener10(JButton btn10) {
        this.btn10 = btn10;
    }

    public void obtener11(JButton btn11) {
        this.btn11 = btn11;
    }

    public void obtener12(JButton btn12) {
        this.btn12 = btn12;
    }

    public void obtener13(JButton btn13) {
        this.btn13 = btn13;
    }

    public void obtener14(JButton btn14) {
        this.btn14 = btn14;
    }

    public void obtener15(JButton btn15) {
        this.btn15 = btn15;
    }

    public void obtener16(JButton btn16) {
        this.btn16 = btn16;
    }

    public void obtener20(JButton btn20) {
        this.btn20 = btn20;
    }

    public void obtener21(JButton btn21) {
        this.btn21 = btn21;
    }

    public void obtener22(JButton btn22) {
        this.btn22 = btn22;
    }

    public void obtener23(JButton btn23) {
        this.btn23 = btn23;
    }

    public void obtener24(JButton btn24) {
        this.btn24 = btn24;
    }

    public void obtener25(JButton btn25) {
        this.btn25 = btn25;
    }

    public void obtener26(JButton btn26) {
        this.btn26 = btn26;
    }

    public void obtener30(JButton btn30) {
        this.btn30 = btn30;
    }

    public void obtener31(JButton btn31) {
        this.btn31 = btn31;
    }

    public void obtener32(JButton btn32) {
        this.btn32 = btn32;
    }

    public void obtener33(JButton btn33) {
        this.btn33 = btn33;
    }

    public void obtener34(JButton btn34) {
        this.btn34 = btn34;
    }

    public void obtener35(JButton btn35) {
        this.btn35 = btn35;
    }

    public void obtener36(JButton btn36) {
        this.btn36 = btn36;
    }

    public void obtener40(JButton btn40) {
        this.btn40 = btn40;
    }

    public void obtener41(JButton btn41) {
        this.btn41 = btn41;
    }

    public void obtener42(JButton btn42) {
        this.btn42 = btn42;
    }

    public void obtener43(JButton btn43) {
        this.btn43 = btn43;
    }

    public void obtener44(JButton btn44) {
        this.btn44 = btn44;
    }

    public void obtener45(JButton btn45) {
        this.btn45 = btn45;
    }

    public void obtener46(JButton btn46) {
        this.btn46 = btn06;
    }
}
