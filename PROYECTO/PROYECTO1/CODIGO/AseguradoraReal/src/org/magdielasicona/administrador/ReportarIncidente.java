/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.administrador;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.magdielasicona.controlador.Asegurado;
import org.magdielasicona.controlador.NoAsegurado;
import org.magdielasicona.datos.SolicitudSeguro;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ReportarIncidente extends javax.swing.JFrame {

    private int contadorBtn;
    private int contadorAgregar = 1;
    private String nombreTercero;
    private String apellidoTercero;
    private String telefonoTercero;
    private String dpiTercero;
    private String codigoGenerado;

    private double total = 0;

    private String dpiAsegurado;

    public static Detalles detalles[] = new Detalles[60];
    public static Taller taller[] = new Taller[60];
    public static String valorTabla[][] = new String[10][3];
    public static double precioRepuestoReal[] = new double[10];
    public static double precioMecanicaReal[] = new double[10];
    public static Asegurado asegurado[] = new Asegurado[30];
    public static NoAsegurado noasegurado[] = new NoAsegurado[30];

    DefaultTableModel modelo;

    private static ReportarIncidente instanciaReportarIncidente;

    public static ReportarIncidente getInstancia() {
        if (instanciaReportarIncidente == null) {
            instanciaReportarIncidente = new ReportarIncidente();
        }
        return instanciaReportarIncidente;
    }

    public ReportarIncidente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("REPORTE INCIDENTE AUTOMAS");
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PRECIO");
        this.jTableReportarIncidente.setModel(modelo);
    }

    public int getContadorAgregar() {
        return contadorAgregar;
    }

    public void setContadorAgregar(int contadorAgregar) {
        this.contadorAgregar = contadorAgregar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDpiAsegurado = new javax.swing.JTextField();
        jTextFieldDpiTercero = new javax.swing.JTextField();
        jComboBoxMecanica = new javax.swing.JComboBox<>();
        jComboBoxRepuesto = new javax.swing.JComboBox<>();
        jCheckBoxCulpable = new javax.swing.JCheckBox();
        jCheckBoxTerceroSeguro = new javax.swing.JCheckBox();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReportarIncidente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jCheckBoxTerceroNoSeguro = new javax.swing.JCheckBox();
        jButtonReportarIncidente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel1.setText("DPI ASEGURADO:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel2.setText("DPI TERCERO:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel3.setText("REPUESTOS:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel4.setText("TIPO SERVICIOS:");

        jComboBoxMecanica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona..." }));

        jComboBoxRepuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona..." }));

        jCheckBoxCulpable.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jCheckBoxCulpable.setText("El Asegurado es Culpable");
        jCheckBoxCulpable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCulpableActionPerformed(evt);
            }
        });

        jCheckBoxTerceroSeguro.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jCheckBoxTerceroSeguro.setText("El Tercero Tiene Seguro");
        jCheckBoxTerceroSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTerceroSeguroActionPerformed(evt);
            }
        });

        jButtonAgregar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jTableReportarIncidente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTableReportarIncidente.setRowHeight(20);
        jScrollPane1.setViewportView(jTableReportarIncidente);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel5.setText("TOTAL:");

        jCheckBoxTerceroNoSeguro.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jCheckBoxTerceroNoSeguro.setText("El Tercero No Tiene Seguro");
        jCheckBoxTerceroNoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTerceroNoSeguroActionPerformed(evt);
            }
        });

        jButtonReportarIncidente.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonReportarIncidente.setText("Reportar Incidente");
        jButtonReportarIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportarIncidenteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDpiAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(jTextFieldDpiTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxCulpable)
                            .addComponent(jCheckBoxTerceroSeguro)
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxTerceroNoSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jButtonReportarIncidente)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldDpiAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCulpable))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldDpiTercero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxTerceroSeguro))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jComboBoxMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxTerceroNoSeguro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgregar)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReportarIncidente)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxTerceroNoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTerceroNoSeguroActionPerformed
        nombreTercero = JOptionPane.showInputDialog("Ingrese el Nombre").toUpperCase();
        dpiTercero = JOptionPane.showInputDialog("Igrese el DPI").toUpperCase();
        telefonoTercero = JOptionPane.showInputDialog("Ingrese Número de Teléfono").toUpperCase();
        jTextFieldDpiTercero.setText(dpiTercero);

    }//GEN-LAST:event_jCheckBoxTerceroNoSeguroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PanelAdministrador admin = new PanelAdministrador();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        String informacion[] = new String[3];

        int indexMecanica = jComboBoxMecanica.getSelectedIndex();
        int indexRepuesto = jComboBoxRepuesto.getSelectedIndex();
        String nombreMecanica = jComboBoxMecanica.getSelectedItem().toString();
        String nombreRepuesto = jComboBoxRepuesto.getSelectedItem().toString();

        double preciolista = 0;

        Random codigo = new Random();

        int num1 = codigo.nextInt(9);
        int num2 = codigo.nextInt(9);
        int num3 = codigo.nextInt(9);
        int num4 = codigo.nextInt(9);
        String codigoGen = String.valueOf(num1 + "" + num2 + "" + num3 + "" + num4);
        String detalle = "";
        String precio;
        if (nombreMecanica != "Selecciona...") {
            detalle = nombreMecanica;

        } else if (nombreRepuesto != "Seleciona...") {
            detalle = nombreRepuesto;

        }
        if (indexMecanica != 0) {
            preciolista = precioMecanicaReal[indexMecanica - 1];

        } else if (indexRepuesto != 0) {
            preciolista = precioRepuestoReal[indexRepuesto - 1];

        }
        datosDatalles(new Detalles(jTextFieldDpiAsegurado.getText(), codigoGen, String.valueOf(preciolista), detalle));
        this.total += preciolista;
        precio = String.valueOf(preciolista);

        informacion[0] = codigoGen;
        informacion[1] = detalle;
        informacion[2] = precio;

        modelo.addRow(informacion);

        jComboBoxMecanica.setSelectedIndex(0);
        jComboBoxRepuesto.setSelectedIndex(0);
        jTextFieldTotal.setText(String.valueOf(total));
        preciolista = 0;


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    public void datosAsegurado(Asegurado obj) {
        for (int i = 0; i < 30; i++) {
            if (asegurado[i] == null) {
                asegurado[i] = obj;
                return;
            }
        }
    }

    public void datosNoAsegurado(NoAsegurado obj) {
        for (int i = 0; i < 30; i++) {
            if (noasegurado[i] == null) {
                noasegurado[i] = obj;
                return;
            }
        }
    }

    public void datosAlTaller(Taller obj) {
        for (int i = 0; i < 60; i++) {
            if (taller[i] == null) {
                taller[i] = obj;
                return;
            }
        }
    }

    public void datosDatalles(Detalles obj) {
        for (int i = 0; i < 60; i++) {
            if (detalles[i] == null) {
                detalles[i] = obj;
                return;
            }
        }
    }

    private void jButtonReportarIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportarIncidenteActionPerformed
        dpiAsegurado = jTextFieldDpiAsegurado.getText();
        dpiTercero = jTextFieldDpiTercero.getText();

        //Generador de codigo y tabla taller
        Random codigo = new Random();

        int num1 = codigo.nextInt(9);
        int num2 = codigo.nextInt(9);
        int num3 = codigo.nextInt(9);
        int num4 = codigo.nextInt(9);
        String codigoGenerado = String.valueOf(num1 + "" + num2 + "" + num3 + "" + num4);

        datosAlTaller(new Taller(codigoGenerado, jTextFieldDpiAsegurado.getText(), jTextFieldDpiTercero.getText(), "EN PROCESO", "PENDIENTE"));

        //Logica para ser cupable o autor
        //Asegurado culpable y tercero es asegurado...
        if (jCheckBoxCulpable.isSelected() && jCheckBoxTerceroSeguro.isSelected()) {
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(dpiAsegurado)) {
                    double deducibleapagar;
                    double porcentajecostoreal;
                    double totalpagorequerido;
                    deducibleapagar = SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado();
                    porcentajecostoreal = 0.20 * this.total;
                    totalpagorequerido = deducibleapagar + porcentajecostoreal;

                    datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AUTOR", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "INCIDENTE AUTOMAS", this.total, totalpagorequerido, "SIN ESTADO", "SIN PRIMA"));
                }
            }
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(dpiTercero)) {
                    datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AFECTADO", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "", 0.0, 0.0, "SIN ESTADO", "SIN PRIMA"));
                }
            }

            //Asegurado es Culpable y Tercero no tiene seguro
        } else if (jCheckBoxCulpable.isSelected() && jCheckBoxTerceroNoSeguro.isSelected()) {
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                double pagorequerido = SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado();
                datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AUTOR", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "DEDUCIBLE AUTOMAS", this.total, pagorequerido, "SIN ESTADO", "SIN PRIMA"));
            }
            datosNoAsegurado(new NoAsegurado(nombreTercero, apellidoTercero, telefonoTercero, dpiTercero, "AFECTADO", total, 0.0));
        } else if (jCheckBoxTerceroSeguro.isSelected()) {
            //El Culpable es UN asegurado 
            //Afectado
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(this.dpiAsegurado)) {
                    datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AFECTADO", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "", this.total, 0.0, "SIN ESTADO", "SIN PRIMA"));
                }

            }
            //Autor
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(this.dpiTercero)) {
                    datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AUTOR", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "", this.total, this.total, "SIN ESTADO", "SIN PRIMA"));
                }
            }

        } else if (jCheckBoxTerceroNoSeguro.isSelected()) {
            //Afectado
            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(this.dpiAsegurado)) {
                    datosAsegurado(new Asegurado(SolicitudRecibidos.asociado[i].getNombreAsociado(), SolicitudRecibidos.asociado[i].getApellidoAsociado(), SolicitudRecibidos.asociado[i].getDpiAsociado(), SolicitudRecibidos.asociado[i].getTelefonoAsociado(), "AFECTADO", SolicitudRecibidos.asociado[i].getCostoPrimaAsociado(), SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado(), "", this.total, 0.0, "SIN ESTADO", "SIN PRIMA"));

                }

            }
            datosNoAsegurado(new NoAsegurado(this.nombreTercero, this.apellidoTercero, this.telefonoTercero, this.dpiTercero, "AUTOR", this.total, this.total));

        }
        System.out.println(contadorAgregar);
        contadorAgregar++;

        JOptionPane.showMessageDialog(null, "SE HA REPORTADO EXITOSAMENTE!!!");
    }//GEN-LAST:event_jButtonReportarIncidenteActionPerformed

    private void jCheckBoxTerceroSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTerceroSeguroActionPerformed

    }//GEN-LAST:event_jCheckBoxTerceroSeguroActionPerformed

    private void jCheckBoxCulpableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCulpableActionPerformed

    }//GEN-LAST:event_jCheckBoxCulpableActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        cargadorDatosAseguradoCulpable();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    public void cargadorDatosAseguradoCulpable() {
        try {

            dpiAsegurado = jTextFieldDpiAsegurado.getText();

            for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
                if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(dpiAsegurado)) {
                    //Se obtiene de forma de cadena
                    String mecanica = SolicitudRecibidos.asociado[i].getMecanicaAsociado();
                    String repuesto = SolicitudRecibidos.asociado[i].getRepuestoAsociado();
                    String precioMecanica = SolicitudRecibidos.asociado[i].getPrecioMecanicaAsociado();
                    String precioRepuesto = SolicitudRecibidos.asociado[i].getPrecioRepuestoAsociado();

                    String listamecanica[] = mecanica.split(",");
                    String listarepuesto[] = repuesto.split(",");
                    String listaPrecioMecanica[] = precioMecanica.split(",");
                    String listaPrecioRepuesto[] = precioRepuesto.split(",");

                    for (int j = 0; j < listamecanica.length; j++) {
                        jComboBoxMecanica.addItem(listamecanica[i]);
                    }
                    for (int j = 0; j < listarepuesto.length; j++) {
                        jComboBoxRepuesto.addItem(listarepuesto[i]);
                    }
                    for (int j = 0; j < listaPrecioMecanica.length; j++) {

                        precioMecanicaReal[j] = Double.parseDouble(listaPrecioMecanica[j]);

                    }
                    for (int j = 0; j < listaPrecioRepuesto.length; j++) {

                        precioRepuestoReal[j] = Double.parseDouble(listaPrecioRepuesto[j]);

                    }

                }
            }
        } catch (Exception e) {
        }

    }

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
            java.util.logging.Logger.getLogger(ReportarIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportarIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportarIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportarIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportarIncidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonReportarIncidente;
    private javax.swing.JCheckBox jCheckBoxCulpable;
    private javax.swing.JCheckBox jCheckBoxTerceroNoSeguro;
    private javax.swing.JCheckBox jCheckBoxTerceroSeguro;
    private javax.swing.JComboBox<String> jComboBoxMecanica;
    private javax.swing.JComboBox<String> jComboBoxRepuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReportarIncidente;
    private javax.swing.JTextField jTextFieldDpiAsegurado;
    private javax.swing.JTextField jTextFieldDpiTercero;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
