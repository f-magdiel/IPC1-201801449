package org.magdielasicona.controlador;

import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.PanelAdministrador;
import org.magdielasicona.administrador.SolicitudRecibidos;
import org.magdielasicona.datos.Login;
import org.magdielasicona.datos.SolicitudSeguro;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class PanelAsegurado extends javax.swing.JFrame {

   

    public PanelAsegurado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MENU ASEGURADO");
        jLabelFechaAsegurado.setText("Fecha Sistema: "+PanelAdministrador.getInstancia().getFechaSistema());
         imprimirDatos();
          
         
       
    }

    public void imprimirDatos() {
        
                jTextAreaDatosAsociado.setText("NOMBRE: "+Login.getInstancia().getNombreLogin() + "\nDPI: "+Login.getInstancia().getDpiLogin()+ "\nTELEFONO: "+Login.getInstancia().getTelefonoLogin());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFechaAsegurado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatosAsociado = new javax.swing.JTextArea();
        jButtonMisSeguros = new javax.swing.JButton();
        jButtonMisIncidentes = new javax.swing.JButton();
        jButtonPagos = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFechaAsegurado.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabelFechaAsegurado.setText("Fecha Sistema:");

        jTextAreaDatosAsociado.setColumns(20);
        jTextAreaDatosAsociado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDatosAsociado);

        jButtonMisSeguros.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonMisSeguros.setText("Mis Seguros");
        jButtonMisSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMisSegurosActionPerformed(evt);
            }
        });

        jButtonMisIncidentes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonMisIncidentes.setText("Mis Incidentes");
        jButtonMisIncidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMisIncidentesActionPerformed(evt);
            }
        });

        jButtonPagos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonPagos.setText("Pagos");
        jButtonPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagosActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jLabelFechaAsegurado))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonMisSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMisIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaAsegurado))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMisIncidentes)
                    .addComponent(jButtonMisSeguros)
                    .addComponent(jButtonPagos))
                .addGap(27, 27, 27)
                .addComponent(jButtonCancelar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonMisSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMisSegurosActionPerformed
        MisSegurosAsegurado misseguros = new MisSegurosAsegurado();
        misseguros.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMisSegurosActionPerformed

    private void jButtonMisIncidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMisIncidentesActionPerformed
        MisIncidentesAsegurado misincidentes = new MisIncidentesAsegurado();
        misincidentes.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMisIncidentesActionPerformed

    private void jButtonPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagosActionPerformed
        PagosAsegurado pagos = new PagosAsegurado();
        pagos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPagosActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAsegurado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonMisIncidentes;
    private javax.swing.JButton jButtonMisSeguros;
    private javax.swing.JButton jButtonPagos;
    private javax.swing.JLabel jLabelFechaAsegurado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatosAsociado;
    // End of variables declaration//GEN-END:variables
}
