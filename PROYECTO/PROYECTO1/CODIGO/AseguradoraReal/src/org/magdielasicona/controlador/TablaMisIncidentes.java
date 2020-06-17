
package org.magdielasicona.controlador;

import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.administrador.SolicitudRecibidos;
import org.magdielasicona.datos.Login;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class TablaMisIncidentes extends javax.swing.JFrame {

   DefaultTableModel modelo;
    public TablaMisIncidentes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("TABLA REPUESTOS");
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PRECIO");
        
        this.jTableListaRepuestos.setModel(modelo);
        llenarTablaDetalles();
    }
    
    public void llenarTablaDetalles(){
    
    String tabla[] = new String[4];
    
        for (int i = 0; i < 10; i++) {
            if (ReportarIncidente.detalles[i]!=null) {
                if (ReportarIncidente.detalles[i].getDpi().equals(Login.getInstancia().getDpiLogin())) {
                tabla[0]=ReportarIncidente.detalles[i].getCodigo();
                tabla[1]=ReportarIncidente.detalles[i].getNombre();
                tabla[2]=ReportarIncidente.detalles[i].getPrecio();
                modelo.addRow(tabla);
            }
            }
        }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaRepuestos = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListaRepuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTableListaRepuestos);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonCancelar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        MisIncidentesAsegurado mis = new MisIncidentesAsegurado();
        mis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TablaMisIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaMisIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaMisIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaMisIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaMisIncidentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaRepuestos;
    // End of variables declaration//GEN-END:variables
}
