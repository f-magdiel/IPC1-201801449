/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.datos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import org.magdielasicona.carga.DatosObtenidos;
import org.magdielasicona.controlador.CalculoSolicitante;
import org.magdielasicona.controlador.Solicitante;
import org.magdielasicona.principal.Menu;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class SolicitudSeguro extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("#.##");
    private static SolicitudSeguro instanciaSolicitudSeguro;

    public static SolicitudSeguro getInstancia() {
        if (instanciaSolicitudSeguro == null) {
            instanciaSolicitudSeguro = new SolicitudSeguro();
        }
        return instanciaSolicitudSeguro;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    /**
     * @param nombreSolicitante the nombreSolicitante to set
     */
    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    /**
     * @return the apellidoSolicitante
     */
    public String getApellidoSolicitante() {
        return apellidoSolicitante;
    }

    /**
     * @param apellidoSolicitante the apellidoSolicitante to set
     */
    public void setApellidoSolicitante(String apellidoSolicitante) {
        this.apellidoSolicitante = apellidoSolicitante;
    }

    /**
     * @return the dpiSolicitante
     */
    public String getDpiSolicitante() {
        return dpiSolicitante;
    }

    /**
     * @param dpiSolicitante the dpiSolicitante to set
     */
    public void setDpiSolicitante(String dpiSolicitante) {
        this.dpiSolicitante = dpiSolicitante;
    }

    /**
     * @return the telefonoSolicitante
     */
    public String getTelefonoSolicitante() {
        return telefonoSolicitante;
    }

    /**
     * @param telefonoSolicitante the telefonoSolicitante to set
     */
    public void setTelefonoSolicitante(String telefonoSolicitante) {
        this.telefonoSolicitante = telefonoSolicitante;
    }

    /**
     * @return the tipoVehiculoSolicitante
     */
    public String getTipoVehiculoSolicitante() {
        return tipoVehiculoSolicitante;
    }

    /**
     * @param tipoVehiculoSolicitante the tipoVehiculoSolicitante to set
     */
    public void setTipoVehiculoSolicitante(String tipoVehiculoSolicitante) {
        this.tipoVehiculoSolicitante = tipoVehiculoSolicitante;
    }

    /**
     * @return the usoVehiculoSolicitante
     */
    public String getUsoVehiculoSolicitante() {
        return usoVehiculoSolicitante;
    }

    /**
     * @param usoVehiculoSolicitante the usoVehiculoSolicitante to set
     */
    public void setUsoVehiculoSolicitante(String usoVehiculoSolicitante) {
        this.usoVehiculoSolicitante = usoVehiculoSolicitante;
    }

    /**
     * @return the marcaVehiculoSolicitante
     */
    public String getMarcaVehiculoSolicitante() {
        return marcaVehiculoSolicitante;
    }

    /**
     * @param marcaVehiculoSolicitante the marcaVehiculoSolicitante to set
     */
    public void setMarcaVehiculoSolicitante(String marcaVehiculoSolicitante) {
        this.marcaVehiculoSolicitante = marcaVehiculoSolicitante;
    }

    /**
     * @return the lineaVehiculoSolicitante
     */
    public String getLineaVehiculoSolicitante() {
        return lineaVehiculoSolicitante;
    }

    /**
     * @param lineaVehiculoSolicitante the lineaVehiculoSolicitante to set
     */
    public void setLineaVehiculoSolicitante(String lineaVehiculoSolicitante) {
        this.lineaVehiculoSolicitante = lineaVehiculoSolicitante;
    }

    /**
     * @return the modeloVehiculoSolicitante
     */
    public String getModeloVehiculoSolicitante() {
        return modeloVehiculoSolicitante;
    }

    /**
     * @param modeloVehiculoSolicitante the modeloVehiculoSolicitante to set
     */
    public void setModeloVehiculoSolicitante(String modeloVehiculoSolicitante) {
        this.modeloVehiculoSolicitante = modeloVehiculoSolicitante;
    }

    /**
     * @return the valorVehiculoSolicitante
     */
    public double getValorVehiculoSolicitante() {
        return valorVehiculoSolicitante;
    }

    /**
     * @param valorVehiculoSolicitante the valorVehiculoSolicitante to set
     */
    public void setValorVehiculoSolicitante(double valorVehiculoSolicitante) {
        this.valorVehiculoSolicitante = valorVehiculoSolicitante;
    }

    public String getPrimaSolicitante() {
        return primaSolicitante;
    }

    public void setPrimaSolicitante(String primaSolicitante) {
        this.primaSolicitante = primaSolicitante;
    }

    public String getDeducibleSolicitante() {
        return deducibleSolicitante;
    }

    public void setDeducibleSolicitante(String deducibleSolicitante) {
        this.deducibleSolicitante = deducibleSolicitante;
    }

    private String nombreSolicitante;
    private String apellidoSolicitante;
    private String dpiSolicitante;
    private String telefonoSolicitante;
    private String tipoVehiculoSolicitante;
    private String usoVehiculoSolicitante;
    private String marcaVehiculoSolicitante;
    private String lineaVehiculoSolicitante;
    private String modeloVehiculoSolicitante;
    private double valorVehiculoSolicitante;
    private String primaSolicitante;
    private String deducibleSolicitante;

    public SolicitudSeguro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SOLICITAR SEGURO AUTOMAS");
        for (int i = 0; i < DatosObtenidos.tipo.length; i++) {
            if (DatosObtenidos.tipo[i] != null) {
                jComboBoxTipoDeVehiculo.addItem(DatosObtenidos.tipo[i].getNombreTipo());
            }
        }
        for (int i = 0; i < DatosObtenidos.uso.length; i++) {
            if (DatosObtenidos.uso[i] != null) {
                jComboBoxUsoDeVehiculo.addItem(DatosObtenidos.uso[i].getNombreUso());
            }
        }
        for (int i = 0; i < DatosObtenidos.marca.length; i++) {
            if (DatosObtenidos.marca[i] != null) {
                jComboBoxMarca.addItem(DatosObtenidos.marca[i].getNombreMarca());
            }
        }
        for (int i = 0; i < DatosObtenidos.linea.length; i++) {
            if (DatosObtenidos.linea[i] != null) {
                jComboBoxLinea.addItem(DatosObtenidos.linea[i].getNombreLinea());
            }
        }
        for (int i = 0; i < DatosObtenidos.modelo.length; i++) {
            if (DatosObtenidos.modelo[i] != null) {
                jComboBoxModelo.addItem(DatosObtenidos.modelo[i].getAñoModelo());
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDPI = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldValorDeVehiculo = new javax.swing.JTextField();
        jButtonCotizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCostoPrima = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDeducible = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPosibleCostoPrima = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPosibleCostoDeducible = new javax.swing.JTextField();
        jButtonMenoDeducible = new javax.swing.JButton();
        jButtonMasDeducible = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSolicitarSeguro = new javax.swing.JButton();
        jComboBoxTipoDeVehiculo = new javax.swing.JComboBox<>();
        jComboBoxUsoDeVehiculo = new javax.swing.JComboBox<>();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxLinea = new javax.swing.JComboBox<>();
        jComboBoxModelo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel1.setText("NOMBRES:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setText("APELLIDOS:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setText("DPI:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setText("TELEFONO:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel5.setText("TIPO DE VEHICULO:");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel6.setText("USO DE VEHICULO:");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel7.setText("MARCA:");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel8.setText("LINEA:");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel9.setText("MODELO:");

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel10.setText("VALOR DEL VEHICULO:");

        jButtonCotizar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCotizar.setText("Cotizar");
        jButtonCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCotizarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel11.setText("COSTO PRIMA:");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel12.setText("DEDUCIBLE:");

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel13.setText("POSIBLE COSTO PRIMA:");

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel14.setText("POSIBLE COSTO DEDUCIBLE:");

        jButtonMenoDeducible.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonMenoDeducible.setText("- Deducible");
        jButtonMenoDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenoDeducibleActionPerformed(evt);
            }
        });

        jButtonMasDeducible.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonMasDeducible.setText("+ Deducible");
        jButtonMasDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasDeducibleActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSolicitarSeguro.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonSolicitarSeguro.setText("Solicitar Seguro");
        jButtonSolicitarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarSeguroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButtonCotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel10)))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxTipoDeVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(jTextFieldDPI, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNombre)
                                        .addComponent(jTextFieldValorDeVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(jComboBoxUsoDeVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxLinea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPosibleCostoDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButtonMenoDeducible)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMasDeducible)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSolicitarSeguro)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)))))
                .addGap(53, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipoDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxUsoDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jButtonCotizar)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldPosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPosibleCostoDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenoDeducible)
                    .addComponent(jButtonMasDeducible)
                    .addComponent(jButtonSolicitarSeguro)
                    .addComponent(jButtonCancelar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCotizarActionPerformed
        setNombreSolicitante(jTextFieldNombre.getText());
        setApellidoSolicitante(jTextFieldApellido.getText());
        setDpiSolicitante(jTextFieldDPI.getText());
        setTelefonoSolicitante(jTextFieldTelefono.getText());
        setTipoVehiculoSolicitante(jComboBoxTipoDeVehiculo.getSelectedItem().toString());
        setUsoVehiculoSolicitante(jComboBoxUsoDeVehiculo.getSelectedItem().toString());
        setMarcaVehiculoSolicitante(jComboBoxMarca.getSelectedItem().toString());
        setLineaVehiculoSolicitante(jComboBoxLinea.getSelectedItem().toString());
        setModeloVehiculoSolicitante(jComboBoxModelo.getSelectedItem().toString());
        setValorVehiculoSolicitante(Double.parseDouble(jTextFieldValorDeVehiculo.getText()));

        CalculoSolicitante calculo = CalculoSolicitante.getInstancia();
        calculo.obteniedoValoresDeSolicitante(tipoVehiculoSolicitante, usoVehiculoSolicitante, marcaVehiculoSolicitante, lineaVehiculoSolicitante, modeloVehiculoSolicitante, valorVehiculoSolicitante);
        calculo.realizandoCalculos();

        //validando el valorVehiculo no puede ser mayor al valor real
        if (valorVehiculoSolicitante < CalculoSolicitante.getInstancia().getValorReal()) {

            jTextFieldCostoPrima.setText(String.valueOf(calculo.getCostoPrima()));
            jTextFieldDeducible.setText(String.valueOf(calculo.getCostoDeducible()));

            jTextFieldPosibleCostoPrima.setText(String.valueOf(calculo.getCostoPrima()));
            jTextFieldPosibleCostoDeducible.setText(String.valueOf(calculo.getCostoDeducible()));
        } else {
            JOptionPane.showMessageDialog(null, "EL VALOR DEL VEHICULO ES MAYOR QUE EL VALOR REAL INGRESE UN NUEVO VALOR!!!");
            jTextFieldValorDeVehiculo.setText("");
        }


    }//GEN-LAST:event_jButtonCotizarActionPerformed

    private void jButtonMenoDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenoDeducibleActionPerformed
        CalculoSolicitante.getInstancia().menosDeducible(jTextFieldDeducible.getText(), jTextFieldCostoPrima.getText());
        //devolviendo los valores de posible deducible y posible prima
        jTextFieldPosibleCostoPrima.setText(String.valueOf(CalculoSolicitante.getInstancia().getPosiblePrima()));
        jTextFieldPosibleCostoDeducible.setText(String.valueOf(CalculoSolicitante.getInstancia().getPosibleDeducible()));
    }//GEN-LAST:event_jButtonMenoDeducibleActionPerformed

    private void jButtonMasDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasDeducibleActionPerformed
        CalculoSolicitante.getInstancia().masDeducible(jTextFieldDeducible.getText(), jTextFieldCostoPrima.getText());

        //devolviendo los valores de posible deducible y posible prima
        jTextFieldPosibleCostoPrima.setText(String.valueOf(CalculoSolicitante.getInstancia().getPosiblePrima()));
        jTextFieldPosibleCostoDeducible.setText(String.valueOf(CalculoSolicitante.getInstancia().getPosibleDeducible()));
    }//GEN-LAST:event_jButtonMasDeducibleActionPerformed

    private void jButtonSolicitarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarSeguroActionPerformed
        setPrimaSolicitante(jTextFieldCostoPrima.getText());
        setDeducibleSolicitante(jTextFieldDeducible.getText());

        //Metodo para enviar los datos fijos, del solicitante
        Solicitante.getInstancia().solicitarDatos(this.nombreSolicitante, this.apellidoSolicitante, this.dpiSolicitante, this.telefonoSolicitante, this.tipoVehiculoSolicitante, this.usoVehiculoSolicitante, this.marcaVehiculoSolicitante, this.lineaVehiculoSolicitante, this.modeloVehiculoSolicitante, this.valorVehiculoSolicitante, this.primaSolicitante, this.deducibleSolicitante);
    }//GEN-LAST:event_jButtonSolicitarSeguroActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitudSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCotizar;
    private javax.swing.JButton jButtonMasDeducible;
    private javax.swing.JButton jButtonMenoDeducible;
    private javax.swing.JButton jButtonSolicitarSeguro;
    private javax.swing.JComboBox<String> jComboBoxLinea;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxTipoDeVehiculo;
    private javax.swing.JComboBox<String> jComboBoxUsoDeVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCostoPrima;
    private javax.swing.JTextField jTextFieldDPI;
    private javax.swing.JTextField jTextFieldDeducible;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPosibleCostoDeducible;
    private javax.swing.JTextField jTextFieldPosibleCostoPrima;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldValorDeVehiculo;
    // End of variables declaration//GEN-END:variables
}
