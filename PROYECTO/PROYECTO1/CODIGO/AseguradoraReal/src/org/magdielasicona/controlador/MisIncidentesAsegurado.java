package org.magdielasicona.controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.magdielasicona.administrador.PanelAdministrador;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.administrador.SolicitudRecibidos;
import static org.magdielasicona.controlador.MisSegurosAsegurado.pagos;
import org.magdielasicona.datos.Login;
import org.magdielasicona.datos.SolicitudSeguro;
import org.magdielasicona.fecha.Pagos;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MisIncidentesAsegurado extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public static Pagos pagos[] = new Pagos[50];
    public MisIncidentesAsegurado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MIS INCIDENTES");
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
        llenadoMenu();
        llenadoTabla();
    }

    public void imprimirDatos() {

        jTextAreaMisIncidentes.setText("NOMBRE: " + Login.getInstancia().getNombreLogin() + "\nDPI: " + Login.getInstancia().getDpiLogin() + "\nTELEFONO: " + Login.getInstancia().getTelefonoLogin() + "\nTIPO: ASEGURADO");

    }

    public void llenadoMenu() {
        for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {
            if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(Login.getInstancia().getDpiLogin())) {
                jLabelPrecioPrima.setText(String.valueOf(SolicitudRecibidos.asociado[i].getCostoPrimaAsociado()));
                jLabelPrecioDeducible.setText(String.valueOf(SolicitudRecibidos.asociado[i].getCostoDeducibleAsociado()));

            }
        }

    }
    
     public void insercionPago(Pagos obj) {
        for (int i = 0; i < 50; i++) {
            if (pagos[i] == null) {
                pagos[i] = obj;

                return;
            }
        }
    }

    public void llenadoTabla() {

        String tabla[] = new String[6];
        for (int i = 0; i < 10; i++) {
            if (ReportarIncidente.asegurado[i] != null) {
                if (ReportarIncidente.asegurado[i].getDpiAsegurado().equals(Login.getInstancia().getDpiLogin())) {
                    tabla[0] = ReportarIncidente.taller[i].getCodigo();
                    tabla[1] =  ReportarIncidente.asegurado[i].getRolAsegurado();
                    tabla[2] = String.valueOf(ReportarIncidente.asegurado[i].getCostoReal());
                    tabla[3] = String.valueOf(ReportarIncidente.asegurado[i].getPagoRequerido());
                    tabla[4] = ReportarIncidente.taller[i].getEstado();
                    tabla[5] = ReportarIncidente.taller[i].getEstadopago();
                    modelo.addRow(tabla);
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMisIncidentes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPrecioPrima = new javax.swing.JLabel();
        jLabelPrecioDeducible = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIncidentes = new javax.swing.JTable();
        jButtonDetalle = new javax.swing.JButton();
        jButtonPagar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFechaSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaMisIncidentes.setColumns(20);
        jTextAreaMisIncidentes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMisIncidentes);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel1.setText("Precio Prima:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel2.setText("Precio Deducible:");

        jLabelPrecioPrima.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabelPrecioPrima.setText("0");

        jLabelPrecioDeducible.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabelPrecioDeducible.setText("0");

        jTableIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableIncidentes.setRowHeight(20);
        jScrollPane2.setViewportView(jTableIncidentes);

        jButtonDetalle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonDetalle.setText("Detalle");
        jButtonDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalleActionPerformed(evt);
            }
        });

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

        jLabelFechaSistema.setText("Fecha sistema:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelPrecioPrima))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecioDeducible)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFechaSistema)
                                .addGap(135, 135, 135))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelFechaSistema)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecioPrima)
                            .addComponent(jLabelPrecioDeducible))))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPagar)
                    .addComponent(jButtonDetalle)
                    .addComponent(jButtonCancelar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalleActionPerformed
        TablaMisIncidentes tabla = new TablaMisIncidentes();
        tabla.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDetalleActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        PanelAsegurado asegurado = new PanelAsegurado();
        asegurado.setVisible(true);
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
        for (int i = 0; i <jTableIncidentes.getRowCount() ; i++) {
            modelo.removeRow(i);
            i-=1;
        }
        
        String tabla[] = new String[6];
        for (int i = 0; i < 10; i++) {
            if (ReportarIncidente.asegurado[i] != null) {
                if (ReportarIncidente.asegurado[i].getDpiAsegurado().equals(Login.getInstancia().getDpiLogin())) {
                    tabla[0] = ReportarIncidente.taller[i].getCodigo();
                    tabla[1] =  ReportarIncidente.asegurado[i].getRolAsegurado();
                    tabla[2] = String.valueOf(ReportarIncidente.asegurado[i].getCostoReal());
                    tabla[3] = String.valueOf(ReportarIncidente.asegurado[i].getPagoRequerido());
                    tabla[4] = ReportarIncidente.taller[i].getEstado();
                    tabla[5] = ReportarIncidente.taller[i].getEstadopago();
                    modelo.addRow(tabla);
                }
            }
        }
        
        //Metodo para insercion de Pagos
        String fechaActual = PanelAdministrador.getInstancia().getFechaSistema();
        String fechas[];
        fechas = fechaActual.split("-");
        int dia = Integer.parseInt(fechas[0]);
        int mes = Integer.parseInt(fechas[1]);
        int año = Integer.parseInt(fechas[2]);
        mes = mes + 1;
        String fechaNueva = String.valueOf(dia+"-"+mes+"-"+año);
        
        //Ingreso de datos en el pago
            for (int i = 0; i < 15; i++) {
                if (ReportarIncidente.asegurado[i]!=null) {
                    if (ReportarIncidente.asegurado[i].getDpiAsegurado().equals(Login.getInstancia().getDpiLogin())) {
                    insercionPago(new Pagos(ReportarIncidente.asegurado[i].getDpiAsegurado(),ReportarIncidente.asegurado[i].getEstadoAsegurado(),String.valueOf(ReportarIncidente.asegurado[i].getPagoRequerido()),fechaActual,fechaNueva));
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
            java.util.logging.Logger.getLogger(MisIncidentesAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisIncidentesAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisIncidentesAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisIncidentesAsegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisIncidentesAsegurado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDetalle;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFechaSistema;
    private javax.swing.JLabel jLabelPrecioDeducible;
    private javax.swing.JLabel jLabelPrecioPrima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableIncidentes;
    private javax.swing.JTextArea jTextAreaMisIncidentes;
    // End of variables declaration//GEN-END:variables
}
