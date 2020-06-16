
package org.magdielasicona.administrador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class ColaTaller extends javax.swing.JFrame {

   DefaultTableModel modelo;
    public ColaTaller() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("COLA DE TALLER");
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("ASOCIADO");
        modelo.addColumn("TERCERO");
        modelo.addColumn("ESTADO");
        modelo.addColumn("PAGO");
        try{
        llenadoTabla();
        }catch(Exception e){}
        this.jTableColaTaller.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColaTaller = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableColaTaller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableColaTaller.setRowHeight(20);
        jScrollPane1.setViewportView(jTableColaTaller);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButton1.setText("Marcar Como Terminado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenadoTabla(){
    
        String datos[] = new String[5];
        for (int i = 0; i < 10; i++) {
            datos[0] = ReportarIncidente.taller[i].getCodigo();
            datos[1] = ReportarIncidente.taller[i].getAsociado();
            datos[2] = ReportarIncidente.taller[i].getTercero();
            datos[3] = ReportarIncidente.taller[i].getEstado();
            datos[4] = ReportarIncidente.taller[i].getEstadopago();
            modelo.addRow(datos);
            
        }
        
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PanelAdministrador admin = new PanelAdministrador();
       admin.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dato = "";
        int fila = jTableColaTaller.getSelectedRow();
        int contfila = jTableColaTaller.getRowCount();
        System.out.println(contfila);
        if (fila != -1) {
            dato = (String) modelo.getValueAt(fila, 0);
         
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE AL MENOS UNA FILA!!!");
        }
        
        for (int i = 0; i < contfila; i++) {
            if (ReportarIncidente.taller[i].getCodigo().equals(dato)) {
                ReportarIncidente.taller[i].setEstado("TERMINADO");
                ReportarIncidente.taller[i].setEstadopago("PAGADO");
            }
        }
        JOptionPane.showMessageDialog(null, "CAMBIO REALIZADO EXITOSAMENTE!!!  ");
        for (int i = 0; i <jTableColaTaller.getRowCount() ; i++) {
            modelo.removeRow(i);
            i-=1;
        }
       
        String datos[] = new String[5];
        for (int i = 0; i < contfila; i++) {
            datos[0] = ReportarIncidente.taller[i].getCodigo();
            datos[1] = ReportarIncidente.taller[i].getAsociado();
            datos[2] = ReportarIncidente.taller[i].getTercero();
            datos[3] = ReportarIncidente.taller[i].getEstado();
            datos[4] = ReportarIncidente.taller[i].getEstadopago();
            modelo.addRow(datos);
            
        }
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
            java.util.logging.Logger.getLogger(ColaTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaTaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableColaTaller;
    // End of variables declaration//GEN-END:variables
}
