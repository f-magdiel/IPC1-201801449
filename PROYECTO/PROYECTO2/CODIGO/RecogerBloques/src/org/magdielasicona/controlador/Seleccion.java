package org.magdielasicona.controlador;

import java.awt.Color;
import java.awt.geom.Area;
import javax.swing.JButton;
import org.magdielasciona.listaCircular.ListaCircular;
import org.magdielasicona.listaDoble.ListaDoble;
import org.magdielasicona.listaSimple.ListaSimple;
import org.magdielasicona.menu.Principal;
import org.magdielasicona.pila.ListaPila;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Seleccion {

    private static Seleccion instanciaSeleccion;

    public static Seleccion getInstancia() {
        if (instanciaSeleccion == null) {
            instanciaSeleccion = new Seleccion();
        }
        return instanciaSeleccion;
    }
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

    public void recogerBloeques() {
        ListaCircular listac = ListaCircular.getInstancia();
        ListaDoble listad = ListaDoble.getInstancia();
        ListaPila listap = ListaPila.getInstancia();
//FILA 0 ------------------------------------------------------------------------------------------------------
        //BOTON01
        if (btn00.getX() == btn01.getX() && btn00.getY() == btn01.getY()) {

            System.out.println(btn01.getText() + "," + btn01.getBackground().toString());
            //COLOR ROJO
            if (btn01.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn01.getText());

                //Lista Circular
                listac.insertar("ROJO", valor);

                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn01.setBackground(Color.white);
                btn01.setLocation(105, 1000);
                //VERDE
            } else if (btn01.getBackground().toString().equals("java.awt.Color[r=0,g=255,b=0]")) {
                System.out.println("Es VERDE");

                //AZUL
            } else if (btn01.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn01.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn01.setBackground(Color.white);
                btn01.setLocation(105, 1000);

                //AMARILLO
            } else if (btn01.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                int valor = Integer.parseInt(btn01.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn01.setBackground(Color.white);
                btn01.setLocation(105, 1000);
            }

        }
        //BOTON02
        if (btn00.getX() == btn02.getX() && btn00.getY() == btn02.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn02.getText() + "," + btn02.getBackground().toString());

            if (btn02.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn02.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn02.setBackground(Color.white);
                btn02.setLocation(197, 1000);
                //VERDE
            } else if (btn02.getBackground().toString().equals("java.awt.Color[r=0,g=255,b=0]")) {
                System.out.println("Es VERDE");

                //AZUL
            } else if (btn02.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn02.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn02.setBackground(Color.white);
                btn02.setLocation(197, 1000);
                //AMARILLO
            } else if (btn02.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                System.out.println("Es AMARILLO");
                int valor = Integer.parseInt(btn02.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn02.setBackground(Color.white);
                btn02.setLocation(197, 1000);
            }

        }
        //BOTON03
        if (btn00.getX() == btn03.getX() && btn00.getY() == btn03.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn03.getText() + "," + btn03.getBackground().toString());
            if (btn03.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn03.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn03.setBackground(Color.white);
                btn03.setLocation(289, 1000);
                //AZUL
            } else if (btn03.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn03.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn03.setBackground(Color.white);
                btn03.setLocation(289, 1000);

            }else if (btn03.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                System.out.println("Es AMARILLO");
                int valor = Integer.parseInt(btn03.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn03.setBackground(Color.white);
                btn03.setLocation(289, 1000);
            }

        }

        //BOTON04 
        if (btn00.getX() == btn04.getX() && btn00.getY() == btn04.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn04.getText() + "," + btn04.getBackground().toString());
            if (btn04.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn04.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn04.setBackground(Color.white);
                btn04.setLocation(381, 1000);
                //AZUL
            } else if (btn04.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn04.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn04.setBackground(Color.white);
                btn04.setLocation(381, 1000);

                //
            }else if (btn04.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                System.out.println("Es AMARILLO");
                int valor = Integer.parseInt(btn04.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn04.setBackground(Color.white);
                btn04.setLocation(381, 1000);
            }

        }
        //BOTON05
        if (btn00.getX() == btn05.getX() && btn00.getY() == btn05.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn05.getText() + "," + btn05.getBackground().toString());
            if (btn05.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn05.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn05.setBackground(Color.white);
                btn05.setLocation(473, 1000);

            } else if (btn05.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn05.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn05.setBackground(Color.white);
                btn05.setLocation(473, 1000);

                //AMARILLO
            }else if (btn05.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                System.out.println("Es AMARILLO");
                int valor = Integer.parseInt(btn05.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn05.setBackground(Color.white);
                btn05.setLocation(473, 1000);
            }

        }
        //BOTON06
        if (btn00.getX() == btn06.getX() && btn00.getY() == btn06.getY()) {
            System.out.println("CHOQUE");
            System.out.println("1");
            System.out.println(btn06.getText() + "," + btn06.getBackground().toString());
            if (btn06.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn06.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn06.setBackground(Color.white);
                btn06.setLocation(565, 1000);

            } else if (btn06.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn06.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn06.setBackground(Color.white);
                btn06.setLocation(565, 1000);

                //
            }else if (btn06.getBackground().toString().equals("java.awt.Color[r=255,g=255,b=0]")) {
                System.out.println("Es AMARILLO");
                int valor = Integer.parseInt(btn06.getText());
                listap.insertarPila("AMARILLO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn06.setBackground(Color.white);
                btn06.setLocation(565, 1000);
            }

        }

        //FILA 1------------------------------------------------------------------------------------------------------
        //BOTON10
        if (btn00.getX() == btn10.getX() && btn00.getY() == btn10.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn10.getText() + "," + btn10.getBackground().toString());
            if (btn10.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn10.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn10.setBackground(Color.white);
                btn10.setLocation(13, 1000);

            } else if (btn10.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn10.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn10.setBackground(Color.white);
                btn10.setLocation(13, 1000);

                //AMARILLO
            }

        }
        //BOTON11
        if (btn00.getX() == btn11.getX() && btn00.getY() == btn11.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn11.getText() + "," + btn11.getBackground().toString());
            if (btn11.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn11.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn11.setBackground(Color.white);
                btn11.setLocation(105, 1000);

            } else if (btn11.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn11.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn11.setBackground(Color.white);
                btn11.setLocation(105, 1000);

                //AMARILLO
            }

        }
        //BOTON12
        if (btn00.getX() == btn12.getX() && btn00.getY() == btn12.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn12.getText() + "," + btn12.getBackground().toString());
            if (btn12.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn12.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn12.setBackground(Color.white);
                btn12.setLocation(197, 1000);

            } else if (btn12.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn12.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn12.setBackground(Color.white);
                btn12.setLocation(197, 1000);

                //AMARILLO
            }

        }
        //BOTON13
        if (btn00.getX() == btn13.getX() && btn00.getY() == btn13.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn13.getText() + "," + btn13.getBackground().toString());
            if (btn13.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn13.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn13.setBackground(Color.white);
                btn13.setLocation(289, 1000);

            } else if (btn13.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn13.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn13.setBackground(Color.white);
                btn13.setLocation(289, 1000);

            }

        }
        //BOTON14
        if (btn00.getX() == btn14.getX() && btn00.getY() == btn14.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn14.getText() + "," + btn14.getBackground().toString());
            if (btn14.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn14.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn14.setBackground(Color.white);
                btn14.setLocation(381, 1000);

            } else if (btn14.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn14.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn14.setBackground(Color.white);
                btn14.setLocation(381, 1000);

            }

        }
        //BOTON15
        if (btn00.getX() == btn15.getX() && btn00.getY() == btn15.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn15.getText() + "," + btn15.getBackground().toString());
            if (btn15.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn15.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn15.setBackground(Color.white);
                btn15.setLocation(473, 1000);

            } else if (btn15.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn15.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn15.setBackground(Color.white);
                btn15.setLocation(473, 1000);

            }

        }
        //BOTON16
        if (btn00.getX() == btn16.getX() && btn00.getY() == btn16.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn16.getText() + "," + btn16.getBackground().toString());
            if (btn16.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn16.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn16.setBackground(Color.white);
                btn16.setLocation(565, 1000);

            } else if (btn16.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn16.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn16.setBackground(Color.white);
                btn16.setLocation(565, 1000);

            }

        }

        //FILA 2-----------------------------------------------------------------------------------------
        //BOTON20
        if (btn00.getX() == btn20.getX() && btn00.getY() == btn20.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn20.getText() + "," + btn20.getBackground().toString());
            if (btn20.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn20.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn20.setBackground(Color.white);
                btn20.setLocation(13, 1000);

            } else if (btn20.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn20.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn20.setBackground(Color.white);
                btn20.setLocation(13, 1000);

            }

        }
        //BOTON21
        if (btn00.getX() == btn21.getX() && btn00.getY() == btn21.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn21.getText() + "," + btn21.getBackground().toString());
            if (btn21.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn21.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn21.setBackground(Color.white);
                btn21.setLocation(105, 1000);

            } else if (btn21.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn21.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn21.setBackground(Color.white);
                btn21.setLocation(105, 1000);

            }

        }
        //BOTON22
        if (btn00.getX() == btn22.getX() && btn00.getY() == btn22.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn22.getText() + "," + btn22.getBackground().toString());
            if (btn22.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn22.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn22.setBackground(Color.white);
                btn22.setLocation(197, 1000);

            } else if (btn22.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn22.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn22.setBackground(Color.white);
                btn22.setLocation(197, 1000);

            }

        }
        //BOTON23
        if (btn00.getX() == btn23.getX() && btn00.getY() == btn23.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn23.getText() + "," + btn23.getBackground().toString());
            if (btn23.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn23.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn23.setBackground(Color.white);
                btn23.setLocation(289, 1000);

            } else if (btn23.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn23.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn23.setBackground(Color.white);
                btn23.setLocation(289, 1000);

            }

        }
        //BOTON24
        if (btn00.getX() == btn24.getX() && btn00.getY() == btn24.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn24.getText() + "," + btn24.getBackground().toString());
            if (btn24.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn24.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn24.setBackground(Color.white);
                btn24.setLocation(381, 1000);

            } else if (btn24.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn24.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn24.setBackground(Color.white);
                btn24.setLocation(381, 1000);

            }

        }
        //BOTON25
        if (btn00.getX() == btn25.getX() && btn00.getY() == btn25.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn25.getText() + "," + btn25.getBackground().toString());
            if (btn25.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn25.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn25.setBackground(Color.white);
                btn25.setLocation(473, 1000);

            } else if (btn25.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn25.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn25.setBackground(Color.white);
                btn25.setLocation(473, 1000);

            }

        }
        //BOTON26
        if (btn00.getX() == btn26.getX() && btn00.getY() == btn26.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn26.getText() + "," + btn26.getBackground().toString());
            if (btn26.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn26.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn26.setBackground(Color.white);
                btn26.setLocation(565, 1000);

            } else if (btn26.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn26.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn26.setBackground(Color.white);
                btn26.setLocation(565, 1000);

            }

        }

        //FILA 3----------------------------------------------------------------------------------
        //BOTON30
        if (btn00.getX() == btn30.getX() && btn00.getY() == btn30.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn30.getText() + "," + btn30.getBackground().toString());
            if (btn30.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn30.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn30.setBackground(Color.white);
                btn30.setLocation(13, 1000);

            } else if (btn30.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn30.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn30.setBackground(Color.white);
                btn30.setLocation(13, 1000);

            }

        }
        //BOTON31
        if (btn00.getX() == btn31.getX() && btn00.getY() == btn31.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn31.getText() + "," + btn31.getBackground().toString());
            if (btn31.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn31.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn31.setBackground(Color.white);
                btn31.setLocation(105, 1000);

            } else if (btn31.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn31.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn31.setBackground(Color.white);
                btn31.setLocation(105, 1000);

            }

        }
        //BOTON32
        if (btn00.getX() == btn32.getX() && btn00.getY() == btn32.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn32.getText() + "," + btn32.getBackground().toString());
            if (btn32.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn32.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn32.setBackground(Color.white);
                btn32.setLocation(197, 1000);

            } else if (btn32.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn32.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn32.setBackground(Color.white);
                btn32.setLocation(197, 1000);

            }

        }
        //BOTON33
        if (btn00.getX() == btn33.getX() && btn00.getY() == btn33.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn33.getText() + "," + btn33.getBackground().toString());
            if (btn33.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn33.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn33.setBackground(Color.white);
                btn33.setLocation(289, 1000);

            } else if (btn33.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn33.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn33.setBackground(Color.white);
                btn33.setLocation(289, 1000);

            }

        }
        //BOTON34
        if (btn00.getX() == btn34.getX() && btn00.getY() == btn34.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn34.getText() + "," + btn34.getBackground().toString());
            if (btn34.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn34.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn34.setBackground(Color.white);
                btn34.setLocation(381, 1000);

            } else if (btn34.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn34.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn34.setBackground(Color.white);
                btn34.setLocation(381, 1000);

            }

        }
        //BOTON35
        if (btn00.getX() == btn35.getX() && btn00.getY() == btn35.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn35.getText() + "," + btn35.getBackground().toString());
            if (btn35.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn35.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn35.setBackground(Color.white);
                btn35.setLocation(473, 1000);

            } else if (btn35.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn35.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn35.setBackground(Color.white);
                btn35.setLocation(473, 1000);

            }

        }
        //BOTON36
        if (btn00.getX() == btn36.getX() && btn00.getY() == btn36.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn36.getText() + "," + btn36.getBackground().toString());
            if (btn36.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn36.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn36.setBackground(Color.white);
                btn36.setLocation(565, 1000);

            } else if (btn36.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn36.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn36.setBackground(Color.white);
                btn36.setLocation(565, 1000);

            }

        }

        //FILA 4----------------------------------------------------------------------------------
        //BOTON40
        if (btn00.getX() == btn40.getX() && btn00.getY() == btn40.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn40.getText() + "," + btn40.getBackground().toString());
            if (btn40.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn40.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn40.setBackground(Color.white);
                btn40.setLocation(13, 1000);

            } else if (btn40.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn40.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn40.setBackground(Color.white);
                btn40.setLocation(13, 1000);

            }

        }
        //BOTON41
        if (btn00.getX() == btn41.getX() && btn00.getY() == btn41.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn41.getText() + "," + btn41.getBackground().toString());
            if (btn41.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn41.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn41.setBackground(Color.white);
                btn41.setLocation(105, 1000);

            } else if (btn41.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn41.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn41.setBackground(Color.white);
                btn41.setLocation(105, 1000);

            }

        }
        //BOTON42
        if (btn00.getX() == btn42.getX() && btn00.getY() == btn42.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn42.getText() + "," + btn42.getBackground().toString());
            if (btn42.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn42.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn42.setBackground(Color.white);
                btn42.setLocation(197, 1000);

            } else if (btn42.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn42.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn42.setBackground(Color.white);
                btn42.setLocation(197, 1000);

            }

        }
        //BOTON43
        if (btn00.getX() == btn43.getX() && btn00.getY() == btn43.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn43.getText() + "," + btn43.getBackground().toString());
            if (btn43.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn43.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn43.setBackground(Color.white);
                btn43.setLocation(289, 1000);

            } else if (btn43.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn43.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn43.setBackground(Color.white);
                btn43.setLocation(289, 1000);

            }

        }
        //BOTON44
        if (btn00.getX() == btn44.getX() && btn00.getY() == btn44.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn44.getText() + "," + btn44.getBackground().toString());
            if (btn44.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn44.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn44.setBackground(Color.white);
                btn44.setLocation(381, 1000);

            } else if (btn44.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn44.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn44.setBackground(Color.white);
                btn44.setLocation(381, 1000);

            }

        }
        //BOTON45
        if (btn00.getX() == btn45.getX() && btn00.getY() == btn45.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn45.getText() + "," + btn45.getBackground().toString());
            if (btn45.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn45.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn45.setBackground(Color.white);
                btn45.setLocation(473, 1000);

            } else if (btn45.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn45.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn45.setBackground(Color.white);
                btn45.setLocation(13, 1000);

            }

        }
        //BOTON46
        if (btn00.getX() == btn46.getX() && btn00.getY() == btn46.getY()) {
            System.out.println("CHOQUE");

            System.out.println(btn46.getText() + "," + btn46.getBackground().toString());
            if (btn46.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {

                System.out.println("Es ROJO");

                int valor = Integer.parseInt(btn46.getText());
                listac.insertar("ROJO", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }

                btn46.setBackground(Color.white);
                btn46.setLocation(565, 1000);

            } else if (btn46.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                int valor = Integer.parseInt(btn46.getText());
                listad.agregar("AZUL", valor);
                for (int i = 0; i < 100; i++) {
                    if (valor == ListaSimple.valoR[i]) {
                        ListaSimple.valoR[i] = 0;
                        ListaSimple.enColumna[i] = 6;
                        ListaSimple.enFila[i] = 6;
                        ListaSimple.coloR[i] = "";
                    }
                }
                btn46.setBackground(Color.white);
                btn46.setLocation(13, 1000);

            }

        }

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
        this.btn46 = btn46;
    }
}
