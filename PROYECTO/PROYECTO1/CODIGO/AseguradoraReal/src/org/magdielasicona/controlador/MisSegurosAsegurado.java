package org.magdielasicona.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.PanelAdministrador;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.administrador.SolicitudRecibidos;
import org.magdielasicona.datos.Login;
import org.magdielasicona.datos.SolicitudSeguro;
import org.magdielasicona.fecha.Seguro;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MisSegurosAsegurado extends javax.swing.JFrame {

    DefaultTableModel modelo;
    public static Seguro seguro[] = new Seguro[50];
    int contadorBoton = 1;
    public String estadoU = "SIN ESTADO";
    public String fechaActual = PanelAdministrador.getInstancia().getFechaSistema();
    public String fechaI;
    public String nuevaFecha;

    // Constructor
    public MisSegurosAsegurado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MIS SEGUROS");
        jLabelFechaSistema.setText("Fecha Sistema: " + PanelAdministrador.getInstancia().getFechaSistema());
        imprimirDatos();
        modelo = new DefaultTableModel();
        modelo.addColumn("CORRELATIVO");
        modelo.addColumn("TIPO");
        modelo.addColumn("TOTAL");
        modelo.addColumn("FECHA INICIO");
        modelo.addColumn("FECHA FIN");

        this.jTableMisSeguros.setModel(modelo);
        try {
            llenandoTablar();
        } catch (Exception e) {
        }

        llenadoMenu();
        veficarFecha();

    }

    public void veficarFecha() {

        //___________________________METODO PARA VALIDAR LA FECHA____________________________________
        try {

            for (int i = 0; i < 10; i++) {
                if (MisSegurosAsegurado.seguro[i] != null) {
                    if (MisSegurosAsegurado.seguro[i].getDpi().equals(Login.getInstancia().getDpiLogin())) {

                        String fechaIn = MisSegurosAsegurado.seguro[i].getFechaInicio();
                        String fechaFi = MisSegurosAsegurado.seguro[i].getFechaFin();
                        if (comparacionFecha(fechaActual, fechaIn, fechaFi) == true) {
                            jLabelEstado.setText("PROTEGIDO");
                            System.out.println("PRO");
                        }
                    }
                }
            }
            if (jLabelEstado.getText() != "PROTEGIDO") {

                jLabelEstado.setText("VULNERABLE");
                System.out.println("VUL");

            }

        } catch (ParseException ex) {
            Logger.getLogger(MisSegurosAsegurado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean comparacionFecha(String fechaactual, String fechaIn, String fechaFin) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date actual = dateFormat.parse(fechaactual);
        Date inicio = dateFormat.parse(fechaIn);
        Date fin = dateFormat.parse(fechaFin);
        // 
        if (inicio.before(actual) && fin.after(actual)) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirDatos() {

        jTextAreaMisSeguros.setText("NOMBRE: " + Login.getInstancia().getNombreLogin() + "\nDPI: " + Login.getInstancia().getDpiLogin() + "\nTELEFONO: " + Login.getInstancia().getTelefonoLogin() + "\nTIPO: ASEGURADO");

    }

    public void agregarSeguro(Seguro obj) {
        for (int i = 0; i < 50; i++) {
            if (seguro[i] == null) {
                seguro[i] = obj;

                return;
            }
        }
    }

    public void llenandoTablar() {
        int corr = 1;
        String seguro[] = new String[5];
        for (int i = 0; i < 10; i++) {
            if (MisSegurosAsegurado.seguro[i].getDpi().equals(Login.getInstancia().getDpiLogin())) {

                seguro[0] = String.valueOf(corr);
                seguro[1] = "POLIZA";
                seguro[2] = MisSegurosAsegurado.seguro[i].getTotal();
                seguro[3] = MisSegurosAsegurado.seguro[i].getFechaInicio();
                seguro[4] = MisSegurosAsegurado.seguro[i].getFechaFin();

                modelo.addRow(seguro);
                corr++;
            }

        }

    }

    public void llenadoMenu() {
        for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
            if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(Login.getInstancia().getDpiLogin())) {
                jLabelPolizaPrima.setText(String.valueOf(SolicitudRecibidos.asociado[i].getCostoPrimaAsociado()));
                jLabelDeducible.setText(String.valueOf(SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado()));
                jLabelMontoAsegurado.setText(String.valueOf(SolicitudRecibidos.asociado[i].getValorVehiculoAsociado()));
                jLabelEstado.setText(estadoU);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMisSeguros = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMisSeguros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonRenovar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFechaSistema = new javax.swing.JLabel();
        jLabelPolizaPrima = new javax.swing.JLabel();
        jLabelDeducible = new javax.swing.JLabel();
        jLabelMontoAsegurado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaMisSeguros.setColumns(20);
        jTextAreaMisSeguros.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMisSeguros);

        jTableMisSeguros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableMisSeguros.setRowHeight(20);
        jScrollPane2.setViewportView(jTableMisSeguros);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel1.setText("Precio Prima Poliza:");

        jButtonRenovar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonRenovar.setText("Renovar");
        jButtonRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenovarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel3.setText("Precio Deducible:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel4.setText("Monto Asegurado:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        jLabelFechaSistema.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabelFechaSistema.setText("Fecha Sistema:");

        jLabelPolizaPrima.setText("0");

        jLabelDeducible.setText("0");

        jLabelMontoAsegurado.setText("0");

        jLabelEstado.setText("SIN ESTADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabelPolizaPrima)))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelEstado))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFechaSistema)
                                    .addComponent(jButtonRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelDeducible)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMontoAsegurado)
                        .addGap(435, 435, 435))
                    .addComponent(jButtonCancelar))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPolizaPrima)
                                    .addComponent(jLabelDeducible))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabelFechaSistema)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEstado)
                                    .addComponent(jLabelMontoAsegurado)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRenovar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonCancelar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        PanelAsegurado asegurado = new PanelAsegurado();
        asegurado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenovarActionPerformed
        //click para agrear seguro

        int dia;
        int mes;
        int año;
        this.fechaActual = PanelAdministrador.getInstancia().getFechaSistema();
        String[] fechaAccion;

        fechaAccion = fechaActual.split("-");
        dia = Integer.parseInt(fechaAccion[0]);
        mes = Integer.parseInt(fechaAccion[1]);
        año = Integer.parseInt(fechaAccion[2]);
        mes = mes + 1;
        nuevaFecha = String.valueOf(dia + "-" + mes + "-" + año);
        this.fechaI = fechaActual;

        agregarSeguro(new Seguro(fechaI, nuevaFecha, Login.getInstancia().getDpiLogin(), jLabelPolizaPrima.getText()));

        String dato[] = new String[5];
        for (int i = 0; i < 1; i++) {
            dato[0] = String.valueOf(contadorBoton);
            dato[1] = "POLIZA";
            dato[2] = jLabelPolizaPrima.getText();
            dato[3] = fechaI;
            dato[4] = nuevaFecha;
            modelo.addRow(dato);
        }
        contadorBoton++;


        JOptionPane.showMessageDialog(null, "SE HA RENOVADO EXITOSAMENTE EL SEGURO!!!");
        jLabelEstado.setText("PROTEGIDO");
    }//GEN-LAST:event_jButtonRenovarActionPerformed

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
            java.util.logging.Logger.getLogger(MisSegurosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisSegurosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisSegurosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisSegurosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisSegurosAsegurado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRenovar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDeducible;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaSistema;
    private javax.swing.JLabel jLabelMontoAsegurado;
    private javax.swing.JLabel jLabelPolizaPrima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMisSeguros;
    private javax.swing.JTextArea jTextAreaMisSeguros;
    // End of variables declaration//GEN-END:variables
}
