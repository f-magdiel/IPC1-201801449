/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.administrador;

import org.magdielasicona.datos.Login;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class PanelAdministrador extends javax.swing.JFrame {

    private static PanelAdministrador instanciaPanelAdministrador;

    public static PanelAdministrador getInstancia() {
        if (instanciaPanelAdministrador == null) {
            instanciaPanelAdministrador = new PanelAdministrador();
        }
        return instanciaPanelAdministrador;
    }
    
    
    private static String fechaSistema="";
    
    public PanelAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PANEL DEL ADMINISTRADOR");
        jLabelFechaSistema.setText("Fecha Sistema:"+fechaSistema);
    }

    public String getFechaSistema() {
        return fechaSistema;
    }

    public void setFechaSistema(String fechaSistema) {
        this.fechaSistema = fechaSistema;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSolicitudSeguro = new javax.swing.JButton();
        jButtonReportarIncidente = new javax.swing.JButton();
        jButtonColaTaller = new javax.swing.JButton();
        jButtonAsegurados = new javax.swing.JButton();
        jButtonNoAsegurados = new javax.swing.JButton();
        jButtonReportes = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFechaSistema = new javax.swing.JLabel();
        jTextFieldFechaSistema = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSolicitudSeguro.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonSolicitudSeguro.setText("Solicitudes De Seguro");
        jButtonSolicitudSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitudSeguroActionPerformed(evt);
            }
        });

        jButtonReportarIncidente.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonReportarIncidente.setText("Reportar Incidente");
        jButtonReportarIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportarIncidenteActionPerformed(evt);
            }
        });

        jButtonColaTaller.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonColaTaller.setText("Cola Taller");
        jButtonColaTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColaTallerActionPerformed(evt);
            }
        });

        jButtonAsegurados.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonAsegurados.setText("Asegurados");
        jButtonAsegurados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAseguradosActionPerformed(evt);
            }
        });

        jButtonNoAsegurados.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonNoAsegurados.setText("No Asegurados");
        jButtonNoAsegurados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoAseguradosActionPerformed(evt);
            }
        });

        jButtonReportes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonReportes.setText("Reportes");

        jButtonCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelFechaSistema.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabelFechaSistema.setText("Fecha Sistema:");

        jTextFieldFechaSistema.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jTextFieldFechaSistema.setText("DD-MM-AA");

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSolicitudSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReportarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonColaTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAsegurados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNoAsegurados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButtonReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelFechaSistema))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTextFieldFechaSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSolicitudSeguro)
                    .addComponent(jButtonReportarIncidente)
                    .addComponent(jButtonColaTaller))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAsegurados)
                    .addComponent(jButtonNoAsegurados)
                    .addComponent(jButtonReportes))
                .addGap(24, 24, 24)
                .addComponent(jLabelFechaSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFechaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSolicitudSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitudSeguroActionPerformed
    SolicitudRecibidos soli = new SolicitudRecibidos();
    soli.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButtonSolicitudSeguroActionPerformed

    private void jButtonReportarIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportarIncidenteActionPerformed
        ReportarIncidente reporte = new ReportarIncidente();
        reporte.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonReportarIncidenteActionPerformed

    private void jButtonColaTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColaTallerActionPerformed
        ColaTaller cola = new ColaTaller();
        cola.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonColaTallerActionPerformed

    private void jButtonAseguradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAseguradosActionPerformed
       ListaAsegurados asegurados = new ListaAsegurados();
       asegurados.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonAseguradosActionPerformed

    private void jButtonNoAseguradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoAseguradosActionPerformed
        ListaNoAsegurados noasegurados = new ListaNoAsegurados();
        noasegurados.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNoAseguradosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechaSistema = jTextFieldFechaSistema.getText();
        jLabelFechaSistema.setText("Fecha Sistema:"+fechaSistema);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAsegurados;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonColaTaller;
    private javax.swing.JButton jButtonNoAsegurados;
    private javax.swing.JButton jButtonReportarIncidente;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonSolicitudSeguro;
    private javax.swing.JLabel jLabelFechaSistema;
    private javax.swing.JTextField jTextFieldFechaSistema;
    // End of variables declaration//GEN-END:variables
}
