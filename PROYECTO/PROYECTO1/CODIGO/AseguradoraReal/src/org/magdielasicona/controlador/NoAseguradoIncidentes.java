package org.magdielasicona.controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.PanelAdministrador;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.datos.Login;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class NoAseguradoIncidentes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    public String fechaActual = PanelAdministrador.getInstancia().getFechaSistema();

    public NoAseguradoIncidentes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MIS INCIDENTES NO ASEGURADOS");
        jLabelFechaSistema.setText("Fecha Sistema: " + PanelAdministrador.getInstancia().getFechaSistema());
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("ROL");
        modelo.addColumn("COSTO REAL");
        modelo.addColumn("PAGO REQUERIDO");
        modelo.addColumn("ESTADO");
        modelo.addColumn("PAGO");
        this.jTableIncidentes.setModel(modelo);
        imprimirDatos();
        llenarTabla();

    }

    public void llenarTabla() {
        String tabla[] = new String[6];
        for (int i = 0; i < 10; i++) {
            if (ReportarIncidente.noasegurado[i] != null) {
                if (ReportarIncidente.noasegurado[i].getDpiNoAsociado().equals(Login.getInstancia().getDpiLogin())) {
                    tabla[0] = ReportarIncidente.taller[i].getCodigo();
                    tabla[1] = ReportarIncidente.noasegurado[i].getRol();
                    tabla[2] = String.valueOf(ReportarIncidente.noasegurado[i].getCostoReal());
                    tabla[3] = String.valueOf(ReportarIncidente.noasegurado[i].getPrecioPagar());
                    tabla[4] = ReportarIncidente.taller[i].getEstado();
                    tabla[5] = ReportarIncidente.taller[i].getEstadopago();
                    modelo.addRow(tabla);
                }
            }
        }

    }

    public void imprimirDatos() {

        jTextAreaIncidentes.setText("NOMBRE: " + Login.getInstancia().getNombreLogin() + "\nDPI: " + Login.getInstancia().getDpiLogin() + "\nTELEFONO: " + Login.getInstancia().getTelefonoLogin() + "\nTIPO: NO ASEGURADO");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIncidentes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIncidentes = new javax.swing.JTable();
        jButtonPagar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDetalles = new javax.swing.JButton();
        jLabelFechaSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaIncidentes.setColumns(20);
        jTextAreaIncidentes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIncidentes);

        jTableIncidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableIncidentes.setRowHeight(20);
        jScrollPane2.setViewportView(jTableIncidentes);

        jButtonPagar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonDetalles.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonDetalles.setText("Detalles");

        jLabelFechaSistema.setText("Fecha Sistema:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButtonDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabelFechaSistema)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaSistema))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPagar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonDetalles))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        PanelNoAsegurado noasegurado = new PanelNoAsegurado();
        noasegurado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        String dato = "";
        int fila = jTableIncidentes.getSelectedRow();
        int contfila = jTableIncidentes.getRowCount();
        System.out.println(contfila);
        if (fila != -1) {
            dato = (String) modelo.getValueAt(fila, 0);

        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE AL MENOS UNA FILA!!!");
        }
        for (int i = 0; i < contfila; i++) {
            if (ReportarIncidente.taller[i].getCodigo().equals(dato)) {
                ReportarIncidente.taller[i].setEstadopago("PAGADO");

            }
        }
        JOptionPane.showMessageDialog(null, "CAMBIO REALIZADO EXITOSAMENTE!!!  ");
        for (int i = 0; i < jTableIncidentes.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        
        
        String tabla[] = new String[6];
        for (int i = 0; i < 10; i++) {
            if (ReportarIncidente.noasegurado[i] != null) {
                if (ReportarIncidente.noasegurado[i].getDpiNoAsociado().equals(Login.getInstancia().getDpiLogin())) {
                    tabla[0] = ReportarIncidente.taller[i].getCodigo();
                    tabla[1] = ReportarIncidente.noasegurado[i].getRol();
                    tabla[2] = String.valueOf(ReportarIncidente.noasegurado[i].getCostoReal());
                    tabla[3] = String.valueOf(ReportarIncidente.noasegurado[i].getPrecioPagar());
                    tabla[4] = ReportarIncidente.taller[i].getEstado();
                    tabla[5] = ReportarIncidente.taller[i].getEstadopago();
                    modelo.addRow(tabla);
                }
            }
        }
        
        String fecha[];
        fecha = fechaActual.split("-");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int año = Integer.parseInt(fecha[2]);
        mes = mes+1;
        String fechaNueva = String.valueOf(dia+"-"+mes+"-"+año);
        
        for (int i = 0; i < 15; i++) {
            if (ReportarIncidente.noasegurado!=null) {
                if (ReportarIncidente.noasegurado[i].getDpiNoAsociado().equals(Login.getInstancia().getDpiLogin())) {
                    
                }
            }
        }


    }//GEN-LAST:event_jButtonPagarActionPerformed

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
            java.util.logging.Logger.getLogger(NoAseguradoIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoAseguradoIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoAseguradoIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoAseguradoIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoAseguradoIncidentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDetalles;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JLabel jLabelFechaSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableIncidentes;
    private javax.swing.JTextArea jTextAreaIncidentes;
    // End of variables declaration//GEN-END:variables
}
