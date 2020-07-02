package org.magdielasicona.menu;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import org.magdielasciona.listaCircular.ListaCircular;
import org.magdielasciona.listaCircular.MenuListaC;
import org.magdielasicona.cola.ListaCola;
import org.magdielasicona.cola.MenuCola;
import org.magdielasicona.controlador.Seleccion;
import org.magdielasicona.listaDoble.ListaDoble;
import org.magdielasicona.listaDoble.MenuDoble;
import org.magdielasicona.listaSimple.FrameListaSimple;
import org.magdielasicona.listaSimple.ListaSimple;
import org.magdielasicona.pila.ListaPila;
import org.magdielasicona.pila.MenuPila;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Principal extends javax.swing.JFrame {

    private String datosIngresados = "";
    private String datosNuevos = "";
    private String info[];

    public Principal() {

        initComponents();
        this.btn00.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        this.setTitle("PRINCIPAL");

        this.btn00.setBackground(Color.white);
        this.btn01.setBackground(Color.white);
        this.btn02.setBackground(Color.white);
        this.btn03.setBackground(Color.white);
        this.btn04.setBackground(Color.white);
        this.btn05.setBackground(Color.white);
        this.btn06.setBackground(Color.white);

        this.btn10.setBackground(Color.white);
        this.btn11.setBackground(Color.white);
        this.btn12.setBackground(Color.white);
        this.btn13.setBackground(Color.white);
        this.btn14.setBackground(Color.white);
        this.btn15.setBackground(Color.white);
        this.btn16.setBackground(Color.white);

        this.btn20.setBackground(Color.white);
        this.btn21.setBackground(Color.white);
        this.btn22.setBackground(Color.white);
        this.btn23.setBackground(Color.white);
        this.btn24.setBackground(Color.white);
        this.btn25.setBackground(Color.white);
        this.btn26.setBackground(Color.white);

        this.btn30.setBackground(Color.white);
        this.btn31.setBackground(Color.white);
        this.btn32.setBackground(Color.white);
        this.btn33.setBackground(Color.white);
        this.btn34.setBackground(Color.white);
        this.btn35.setBackground(Color.white);
        this.btn36.setBackground(Color.white);

        this.btn40.setBackground(Color.white);
        this.btn41.setBackground(Color.white);
        this.btn42.setBackground(Color.white);
        this.btn43.setBackground(Color.white);
        this.btn44.setBackground(Color.white);
        this.btn45.setBackground(Color.white);
        this.btn46.setBackground(Color.white);

        ListaSimple ls = ListaSimple.getInstancia();
        ls.obtener00(btn00);
        ls.obtener01(btn01);
        ls.obtener02(btn02);
        ls.obtener03(btn03);
        ls.obtener04(btn04);
        ls.obtener05(btn05);
        ls.obtener06(btn06);

        ls.obtener10(btn10);
        ls.obtener11(btn11);
        ls.obtener12(btn12);
        ls.obtener13(btn13);
        ls.obtener14(btn14);
        ls.obtener15(btn15);
        ls.obtener16(btn16);

        ls.obtener20(btn20);
        ls.obtener21(btn21);
        ls.obtener22(btn22);
        ls.obtener23(btn23);
        ls.obtener24(btn24);
        ls.obtener25(btn25);
        ls.obtener26(btn26);

        ls.obtener30(btn30);
        ls.obtener31(btn31);
        ls.obtener32(btn32);
        ls.obtener33(btn33);
        ls.obtener34(btn34);
        ls.obtener35(btn35);
        ls.obtener36(btn36);

        ls.obtener40(btn40);
        ls.obtener41(btn41);
        ls.obtener42(btn42);
        ls.obtener43(btn43);
        ls.obtener44(btn44);
        ls.obtener45(btn45);
        ls.obtener46(btn46);

        ls.llenarTabla();

        Seleccion sl = Seleccion.getInstancia();
        sl.obtener00(btn00);
        sl.obtener01(btn01);
        sl.obtener02(btn02);
        sl.obtener03(btn03);
        sl.obtener04(btn04);
        sl.obtener05(btn05);
        sl.obtener06(btn06);

        sl.obtener10(btn10);
        sl.obtener11(btn11);
        sl.obtener12(btn12);
        sl.obtener13(btn13);
        sl.obtener14(btn14);
        sl.obtener15(btn15);
        sl.obtener16(btn16);

        sl.obtener20(btn20);
        sl.obtener21(btn21);
        sl.obtener22(btn22);
        sl.obtener23(btn23);
        sl.obtener24(btn24);
        sl.obtener25(btn25);
        sl.obtener26(btn26);

        sl.obtener30(btn30);
        sl.obtener31(btn31);
        sl.obtener32(btn32);
        sl.obtener33(btn33);
        sl.obtener34(btn34);
        sl.obtener35(btn35);
        sl.obtener36(btn36);

        sl.obtener40(btn40);
        sl.obtener41(btn41);
        sl.obtener42(btn42);
        sl.obtener43(btn43);
        sl.obtener44(btn44);
        sl.obtener45(btn45);
        sl.obtener46(btn46);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanelBotones = new javax.swing.JPanel();
        jButtonCargarDatos = new javax.swing.JButton();
        jButtonListaCircular = new javax.swing.JButton();
        jButtonListaSimple = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonListaDoble = new javax.swing.JButton();
        jButtonCola = new javax.swing.JButton();
        jButtonPila = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBotones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jButtonCargarDatos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCargarDatos.setText("Cargar Datos");
        jButtonCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDatosActionPerformed(evt);
            }
        });

        jButtonListaCircular.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaCircular.setText("Lista Circular");
        jButtonListaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaCircularActionPerformed(evt);
            }
        });

        jButtonListaSimple.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaSimple.setText("Lista Simple");
        jButtonListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaSimpleActionPerformed(evt);
            }
        });

        jButtonReiniciar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jButtonListaDoble.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaDoble.setText("Lista Doble");
        jButtonListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDobleActionPerformed(evt);
            }
        });

        jButtonCola.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCola.setText("Cola");
        jButtonCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColaActionPerformed(evt);
            }
        });

        jButtonPila.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonPila.setText("Pila");
        jButtonPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133)
                .addComponent(jButtonListaCircular)
                .addGap(27, 27, 27)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListaSimple, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonListaDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCola, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonPila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(171, 171, 171))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCargarDatos)
                    .addComponent(jButtonListaCircular)
                    .addComponent(jButtonListaSimple)
                    .addComponent(jButtonPila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCola)
                        .addComponent(jButtonReiniciar))
                    .addComponent(jButtonListaDoble))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelTabla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        jPanelTabla.setForeground(new java.awt.Color(0, 51, 204));

        btn00.setText("0,0");
        btn00.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn00KeyPressed(evt);
            }
        });

        btn40.setText("4,0");
        btn40.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn01.setText("0,1");
        btn01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn02.setText("0,2");
        btn02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn03.setText("0,3");
        btn03.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn04.setText("0,4");
        btn04.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn05.setText("0,5");
        btn05.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn06.setText("0,6");
        btn06.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn12.setText("1,2");
        btn12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn11.setText("1,1");
        btn11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn13.setText("1,3");
        btn13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn14.setText("1,4");
        btn14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn15.setText("1,5");
        btn15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn16.setText("1,6");
        btn16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn21.setText("2,1");
        btn21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn23.setText("2,3");
        btn23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn22.setText("2,2");
        btn22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn24.setText("2,4");
        btn24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn25.setText("2,5");
        btn25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn26.setText("2,6");
        btn26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn31.setText("3,1");
        btn31.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn32.setText("3,2");
        btn32.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn33.setText("3,3");
        btn33.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn34.setText("3,4");
        btn34.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn35.setText("3,5");
        btn35.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn36.setText("3,6");
        btn36.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn41.setText("4,1");
        btn41.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn42.setText("4,2");
        btn42.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn43.setText("4,3");
        btn43.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn44.setText("4,4");
        btn44.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn45.setText("4,5");
        btn45.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn46.setText("4,6");
        btn46.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn20.setText("2,0");
        btn20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn10.setText("1,0");
        btn10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn30.setText("3,0");
        btn30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTablaLayout.createSequentialGroup()
                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTablaLayout.createSequentialGroup()
                                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTablaLayout.createSequentialGroup()
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDobleActionPerformed
        MenuDoble menu = new MenuDoble();
        menu.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButtonListaDobleActionPerformed

    private void jButtonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDatosActionPerformed

        agregarDatos();
        this.btn00.requestFocusInWindow();


    }//GEN-LAST:event_jButtonCargarDatosActionPerformed

    private void jButtonListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaSimpleActionPerformed

        FrameListaSimple ls = new FrameListaSimple();
        ls.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonListaSimpleActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        ListaSimple.getInstancia().reiniciarListaSimple();
        ListaPila.getInstancia().reiniciarListaPila();
        ListaDoble.getInstancia().reiniciarListaDoble();
        ListaCola.getInstancia().reiniciarListaCola();
        ListaCircular.getInstancia().reiniciarListaCircular();
        btn00.setText("0,0");
        btn01.setText("0,1");
        btn02.setText("0,2");
        btn03.setText("0,3");
        btn04.setText("0,4");
        btn05.setText("0,5");
        btn06.setText("0,6");

        btn10.setText("1,0");
        btn11.setText("1,1");
        btn12.setText("1,2");
        btn13.setText("1,3");
        btn14.setText("1,4");
        btn15.setText("1,5");
        btn16.setText("1,6");

        btn20.setText("2,0");
        btn21.setText("2,1");
        btn22.setText("2,2");
        btn23.setText("2,3");
        btn24.setText("2,4");
        btn25.setText("2,5");
        btn26.setText("2,6");

        btn30.setText("3,0");
        btn31.setText("3,1");
        btn32.setText("3,2");
        btn33.setText("3,3");
        btn34.setText("3,4");
        btn35.setText("3,5");
        btn36.setText("3,6");

        btn40.setText("4,0");
        btn41.setText("4,1");
        btn42.setText("4,2");
        btn43.setText("4,3");
        btn44.setText("4,4");
        btn45.setText("4,5");
        btn46.setText("4,6");

        
        this.btn01.setBackground(Color.white);
        this.btn02.setBackground(Color.white);
        this.btn03.setBackground(Color.white);
        this.btn04.setBackground(Color.white);
        this.btn05.setBackground(Color.white);
        this.btn06.setBackground(Color.white);

        this.btn10.setBackground(Color.white);
        this.btn11.setBackground(Color.white);
        this.btn12.setBackground(Color.white);
        this.btn13.setBackground(Color.white);
        this.btn14.setBackground(Color.white);
        this.btn15.setBackground(Color.white);
        this.btn16.setBackground(Color.white);

        this.btn20.setBackground(Color.white);
        this.btn21.setBackground(Color.white);
        this.btn22.setBackground(Color.white);
        this.btn23.setBackground(Color.white);
        this.btn24.setBackground(Color.white);
        this.btn25.setBackground(Color.white);
        this.btn26.setBackground(Color.white);

        this.btn30.setBackground(Color.white);
        this.btn31.setBackground(Color.white);
        this.btn32.setBackground(Color.white);
        this.btn33.setBackground(Color.white);
        this.btn34.setBackground(Color.white);
        this.btn35.setBackground(Color.white);
        this.btn36.setBackground(Color.white);

        this.btn40.setBackground(Color.white);
        this.btn41.setBackground(Color.white);
        this.btn42.setBackground(Color.white);
        this.btn43.setBackground(Color.white);
        this.btn44.setBackground(Color.white);
        this.btn45.setBackground(Color.white);
        this.btn46.setBackground(Color.white);
        JOptionPane.showMessageDialog(null, "SE HA REINICIADO TODO");
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void btn00KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn00KeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_LEFT) {

            btn00.setBounds(btn00.getX() - 92, btn00.getY(), btn00.getWidth(), btn00.getHeight());
            System.out.println(btn00.getX() + "," + btn00.getY());
            System.out.println("<-");
            Seleccion.getInstancia().recogerBloeques();
            if (btn00.getX() == -79) {
                btn00.setLocation(btn00.getX() + 92, btn00.getY());
            }

        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {

            btn00.setBounds(btn00.getX() + 92, btn00.getY(), btn00.getWidth(), btn00.getHeight());
            System.out.println(btn00.getX() + "," + btn00.getY());
            System.out.println("->");
            Seleccion.getInstancia().recogerBloeques();
            if (btn00.getX() == 657) {
                btn00.setLocation(btn00.getX() - 92, btn00.getY());
            }

        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_UP) {
            btn00.setLocation(btn00.getX(), btn00.getY() - 90);
            System.out.println("arriba");
            Seleccion.getInstancia().recogerBloeques();
            if (btn00.getY() == -77) {
                btn00.setLocation(btn00.getX(), btn00.getY() + 90);
            }
        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
            btn00.setLocation(btn00.getX(), btn00.getY() + 90);
            System.out.println("abajo");
            Seleccion.getInstancia().recogerBloeques();
            if (btn00.getY() == 463) {
                btn00.setLocation(btn00.getX(), btn00.getY() - 90);
            }
        }


    }//GEN-LAST:event_btn00KeyPressed

    private void jButtonListaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaCircularActionPerformed
        MenuListaC menu = new MenuListaC();
        menu.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonListaCircularActionPerformed

    private void jButtonPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPilaActionPerformed
        MenuPila menu = new MenuPila();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPilaActionPerformed

    private void jButtonColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColaActionPerformed
        MenuCola menu = new MenuCola();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonColaActionPerformed

    public void agregarDatos() {
        ListaSimple listaSimple = ListaSimple.getInstancia();
        String lin = "";
        JFileChooser navegador = new JFileChooser();
        navegador.showOpenDialog(navegador);

        try {
            datosIngresados = navegador.getSelectedFile().getAbsolutePath();
            FileInputStream archivo = new FileInputStream(datosIngresados);
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader br = new BufferedReader(new InputStreamReader(entrada));

            while ((lin = br.readLine()) != null) {
                info = lin.split(",");

                listaSimple.insertarDatos(Integer.parseInt(info[0]), Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[3]);

            }
            entrada.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al abrir el archivo!");
        }

        System.out.println("Lista Simple:");
        listaSimple.imprimir();
        listaSimple.copia();
        listaSimple.llenarTabla();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton jButtonCargarDatos;
    private javax.swing.JButton jButtonCola;
    private javax.swing.JButton jButtonListaCircular;
    private javax.swing.JButton jButtonListaDoble;
    private javax.swing.JButton jButtonListaSimple;
    private javax.swing.JButton jButtonPila;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
