package org.magdielasicona.controlador;

import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.datos.Login;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class PagosAsegurado extends javax.swing.JFrame {

     DefaultTableModel modelo;
    public PagosAsegurado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PAGOS");
        modelo = new DefaultTableModel();
        modelo.addColumn("CORRELATIVO");
        modelo.addColumn("TIPO");
        modelo.addColumn("TOTAL");
        modelo.addColumn("FECHA INICIO");
        modelo.addColumn("FECHA FIN");
       
        this.jTablePagos.setModel(modelo);
        
        imprimirDatos();
        try{
        llenarTabla();
        }catch(Exception e){}
    }

    public void imprimirDatos() {

        jTextAreaPagos.setText("NOMBRE: " + Login.getInstancia().getNombreLogin() + "\nDPI: " + Login.getInstancia().getDpiLogin() + "\nTELEFONO: " + Login.getInstancia().getTelefonoLogin() + "\nTIPO: ASEGURADO");

    }
    
    public void llenarTabla(){
    int corre=1;
        String tabla[] = new String[5];
        for (int i = 0; i < 15; i++) {
            if (MisIncidentesAsegurado.pagos[i] != null) {
                if (MisIncidentesAsegurado.pagos[i].getDpiPagos().equals(Login.getInstancia().getDpiLogin())) {
                    tabla[0]= String.valueOf(corre);
                    tabla[1]=MisIncidentesAsegurado.pagos[i].getTipoPagos();
                    tabla[2]=MisIncidentesAsegurado.pagos[i].getTotalPagos();
                    tabla[3]=MisIncidentesAsegurado.pagos[i].getFechaInicio();
                    tabla[4]=MisIncidentesAsegurado.pagos[i].getFechaFin();
                    modelo.addRow(tabla);
                    corre++;
                }
            }
        }
        
        
        String table[] = new String[5];
        for (int i = 0; i < 15; i++) {
            if (MisSegurosAsegurado.pagos != null) {
                if (MisSegurosAsegurado.pagos[i].getDpiPagos().equals(Login.getInstancia().getDpiLogin())) {
                    table[0]= String.valueOf(corre);
                    table[1]=MisSegurosAsegurado.pagos[i].getTipoPagos();
                    table[2]=MisSegurosAsegurado.pagos[i].getTotalPagos();
                    table[3]=MisSegurosAsegurado.pagos[i].getFechaInicio();
                    table[4]=MisSegurosAsegurado.pagos[i].getFechaFin();
                    modelo.addRow(table);
                    corre++;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPagos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePagos = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaPagos.setColumns(20);
        jTextAreaPagos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPagos);

        jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePagos.setRowHeight(20);
        jScrollPane2.setViewportView(jTablePagos);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        PanelAsegurado asegurado = new PanelAsegurado();
        asegurado.setVisible(true);
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
            java.util.logging.Logger.getLogger(PagosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagosAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagosAsegurado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePagos;
    private javax.swing.JTextArea jTextAreaPagos;
    // End of variables declaration//GEN-END:variables
}
