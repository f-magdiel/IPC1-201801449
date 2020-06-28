package org.magdielasicona.menu;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.magdielasicona.listaSimple.FrameListaSimple;
import org.magdielasicona.listaSimple.ListaSimple;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Principal extends javax.swing.JFrame {

    private String datosIngresados = "";
    private String datosNuevos = "";
    private String info[];

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PRINCIPAL");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanelBotones = new javax.swing.JPanel();
        jButtonCargarDatos = new javax.swing.JButton();
        jButtonListaCircular = new javax.swing.JButton();
        jButtonListaSimple = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonListaDoble = new javax.swing.JButton();
        jButtonCola = new javax.swing.JButton();
        jButtonPila = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBotones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jButtonCargarDatos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCargarDatos.setText("Cargar Datos");
        jButtonCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDatosActionPerformed(evt);
            }
        });

        jButtonListaCircular.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaCircular.setText("Lista Circular");

        jButtonListaSimple.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaSimple.setText("Lista Simple");
        jButtonListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaSimpleActionPerformed(evt);
            }
        });

        jButtonReiniciar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonReiniciar.setText("Reiniciar");

        jButtonListaDoble.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonListaDoble.setText("Lista Doble");
        jButtonListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDobleActionPerformed(evt);
            }
        });

        jButtonCola.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonCola.setText("Cola");

        jButtonPila.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonPila.setText("Pila");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133)
                .addComponent(jButtonListaCircular)
                .addGap(27, 27, 27)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListaSimple, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonListaDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCola, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonPila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(171, 171, 171))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCargarDatos)
                    .addComponent(jButtonListaCircular)
                    .addComponent(jButtonListaSimple)
                    .addComponent(jButtonPila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCola)
                        .addComponent(jButtonReiniciar))
                    .addComponent(jButtonListaDoble))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jTableTablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTableTablaPrincipal.setRowHeight(80);
        jTableTablaPrincipal.setTableHeader(null);
        jTableTablaPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTablaPrincipalKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTablaPrincipal);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListaDobleActionPerformed

    private void jTableTablaPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTablaPrincipalKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_LEFT) {

        }
    }//GEN-LAST:event_jTableTablaPrincipalKeyPressed

    private void jButtonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDatosActionPerformed

        agregarDatos();

    }//GEN-LAST:event_jButtonCargarDatosActionPerformed

    private void jButtonListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaSimpleActionPerformed
        FrameListaSimple ls = new FrameListaSimple();
        ls.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonListaSimpleActionPerformed

    public void agregarDatos() {
        ListaSimple listaSimple = ListaSimple.getInstancia();
        String lin = "";
        JFileChooser navegador = new JFileChooser();
        navegador.showOpenDialog(navegador);

        try {
            datosIngresados = navegador.getSelectedFile().getAbsolutePath();
            FileInputStream archivo = new FileInputStream(datosIngresados);
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader br = new BufferedReader(new InputStreamReader(entrada));

            while ((lin = br.readLine()) != null) {
                info = lin.split(",");
                
               listaSimple.insertarDatos(Integer.parseInt(info[0]), Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[3]);

            }
            entrada.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al abrir el archivo!");
        }

        System.out.println("Lista Simple:");
        listaSimple.imprimir();

    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarDatos;
    private javax.swing.JButton jButtonCola;
    private javax.swing.JButton jButtonListaCircular;
    private javax.swing.JButton jButtonListaDoble;
    private javax.swing.JButton jButtonListaSimple;
    private javax.swing.JButton jButtonPila;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTablaPrincipal;
    // End of variables declaration//GEN-END:variables
}
