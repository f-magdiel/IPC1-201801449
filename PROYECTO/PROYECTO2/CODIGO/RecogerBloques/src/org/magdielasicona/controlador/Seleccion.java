package org.magdielasicona.controlador;

import java.awt.Color;
import java.awt.geom.Area;
import javax.swing.JButton;
import org.magdielasciona.listaCircular.ListaCircular;
import org.magdielasicona.listaSimple.ListaSimple;
import org.magdielasicona.menu.Principal;

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
//FILA 0 ------------------------------------------------------------------------------------------------------
        if (btn00.getX() == btn01.getX() && btn00.getY() == btn01.getY()) {
            
            System.out.println(btn01.getText() + "," + btn01.getBackground().toString());
            //COLOR ROJO
            if (btn01.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {
                
                System.out.println("Es ROJO");
                
                int valor = Integer.parseInt(btn01.getText());
                
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
                
                int valor = Integer.parseInt(btn01.getText());
                
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
                //AZUL
            } else if (btn01.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                String color = "AZUL";
                int valor = Integer.parseInt(btn01.getText());
                ListaCircular.getInstancia().insertar(color, valor);
                ListaCircular.getInstancia().imprimir();
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
                System.out.println("Es AMARILLO");
                
                int valor = Integer.parseInt(btn01.getText());
                
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
        
        if (btn00.getX() == btn02.getX() && btn00.getY() == btn02.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn02.getText() + "," + btn02.getBackground().toString());
            
            if (btn02.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")) {
                
                System.out.println("Es ROJO");
                
                int valor = Integer.parseInt(btn02.getText());
                
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
                
                int valor = Integer.parseInt(btn02.getText());
                
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
                //AZUL
            } else if (btn02.getBackground().toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
                System.out.println("Es AZUL");
                String color = "AZUL";
                int valor = Integer.parseInt(btn02.getText());
                ListaCircular.getInstancia().insertar(color, valor);
                ListaCircular.getInstancia().imprimir();
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
        if (btn00.getX() == btn03.getX() && btn00.getY() == btn03.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn03.getText() + "," + btn03.getBackground().toString());
            
        }
        if (btn00.getX() == btn04.getX() && btn00.getY() == btn04.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn04.getText() + "," + btn04.getBackground().toString());
            
        }
        if (btn00.getX() == btn05.getX() && btn00.getY() == btn05.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn05.getText() + "," + btn05.getBackground().toString());
            
        }
        if (btn00.getX() == btn06.getX() && btn00.getY() == btn06.getY()) {
            System.out.println("CHOQUE");
            System.out.println("1");
            System.out.println(btn06.getText() + "," + btn06.getBackground().toString());
            
        }

        //FILA 1------------------------------------------------------------------------------------------------------
        if (btn00.getX() == btn10.getX() && btn00.getY() == btn10.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn10.getText() + "," + btn10.getBackground().toString());
            
        }
        if (btn00.getX() == btn11.getX() && btn00.getY() == btn11.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn11.getText() + "," + btn11.getBackground().toString());
            
        }
        if (btn00.getX() == btn12.getX() && btn00.getY() == btn12.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn12.getText() + "," + btn12.getBackground().toString());
            
        }
        if (btn00.getX() == btn13.getX() && btn00.getY() == btn13.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn13.getText() + "," + btn13.getBackground().toString());
            
        }
        if (btn00.getX() == btn14.getX() && btn00.getY() == btn14.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn14.getText() + "," + btn14.getBackground().toString());
            
        }
        if (btn00.getX() == btn15.getX() && btn00.getY() == btn15.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn15.getText() + "," + btn15.getBackground().toString());
            
        }
        if (btn00.getX() == btn16.getX() && btn00.getY() == btn16.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn16.getText() + "," + btn16.getBackground().toString());
            
        }

        //FILA 2-----------------------------------------------------------------------------------------
        if (btn00.getX() == btn20.getX() && btn00.getY() == btn20.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn20.getText() + "," + btn20.getBackground().toString());
            
        }
        if (btn00.getX() == btn21.getX() && btn00.getY() == btn21.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn21.getText() + "," + btn21.getBackground().toString());
            
        }
        if (btn00.getX() == btn22.getX() && btn00.getY() == btn22.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn22.getText() + "," + btn22.getBackground().toString());
            
        }
        if (btn00.getX() == btn23.getX() && btn00.getY() == btn23.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn23.getText() + "," + btn23.getBackground().toString());
            
        }
        if (btn00.getX() == btn24.getX() && btn00.getY() == btn24.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn24.getText() + "," + btn24.getBackground().toString());
            
        }
        if (btn00.getX() == btn25.getX() && btn00.getY() == btn25.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn25.getText() + "," + btn25.getBackground().toString());
            
        }
        if (btn00.getX() == btn26.getX() && btn00.getY() == btn26.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn26.getText() + "," + btn26.getBackground().toString());
            
        }

        //FILA 3----------------------------------------------------------------------------------
        if (btn00.getX() == btn30.getX() && btn00.getY() == btn30.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn30.getText() + "," + btn30.getBackground().toString());
            
        }
        if (btn00.getX() == btn31.getX() && btn00.getY() == btn31.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn31.getText() + "," + btn31.getBackground().toString());
            
        }
        if (btn00.getX() == btn32.getX() && btn00.getY() == btn32.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn32.getText() + "," + btn32.getBackground().toString());
            
        }
        if (btn00.getX() == btn33.getX() && btn00.getY() == btn33.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn33.getText() + "," + btn33.getBackground().toString());
            
        }
        if (btn00.getX() == btn34.getX() && btn00.getY() == btn34.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn34.getText() + "," + btn34.getBackground().toString());
            
        }
        if (btn00.getX() == btn35.getX() && btn00.getY() == btn35.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn35.getText() + "," + btn35.getBackground().toString());
            
        }
        if (btn00.getX() == btn36.getX() && btn00.getY() == btn36.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn36.getText() + "," + btn36.getBackground().toString());
            
        }

        //FILA 4----------------------------------------------------------------------------------
        if (btn00.getX() == btn40.getX() && btn00.getY() == btn40.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn40.getText() + "," + btn40.getBackground().toString());
            
        }
        if (btn00.getX() == btn41.getX() && btn00.getY() == btn41.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn41.getText() + "," + btn41.getBackground().toString());
            
        }
        if (btn00.getX() == btn42.getX() && btn00.getY() == btn42.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn42.getText() + "," + btn42.getBackground().toString());
            
        }
        if (btn00.getX() == btn43.getX() && btn00.getY() == btn43.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn43.getText() + "," + btn43.getBackground().toString());
            
        }
        if (btn00.getX() == btn44.getX() && btn00.getY() == btn44.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn44.getText() + "," + btn44.getBackground().toString());
            
        }
        if (btn00.getX() == btn45.getX() && btn00.getY() == btn45.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn45.getText() + "," + btn45.getBackground().toString());
            
        }
        if (btn00.getX() == btn46.getX() && btn00.getY() == btn46.getY()) {
            System.out.println("CHOQUE");
            
            System.out.println(btn46.getText() + "," + btn46.getBackground().toString());
            
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
