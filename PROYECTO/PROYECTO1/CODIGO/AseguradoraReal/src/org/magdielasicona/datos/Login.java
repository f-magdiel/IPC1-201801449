/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.magdielasicona.datos;

import javax.swing.JOptionPane;
import org.magdielasicona.administrador.PanelAdministrador;
import org.magdielasicona.administrador.ReportarIncidente;
import org.magdielasicona.administrador.SolicitudRecibidos;
import org.magdielasicona.controlador.PanelAsegurado;
import org.magdielasicona.controlador.PanelNoAsegurado;
import org.magdielasicona.principal.Menu;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Login extends javax.swing.JFrame {
    private static String nombreLogin;
    private static String dpiLogin;
    private static String telefonoLogin;
    
    //singleton
    private static Login instanciaLogin;

    public static Login getInstancia() {
        if (instanciaLogin == null) {
            instanciaLogin = new Login();
        }
        return instanciaLogin;
    }
    
    
    private String nombreUsuario;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("INICIAR SESIÓN");
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreLogin() {
        return nombreLogin;
    }

    public void setNombreLogin(String nombreLogin) {
        this.nombreLogin = nombreLogin;
    }

    public String getDpiLogin() {
        return dpiLogin;
    }

    public void setDpiLogin(String dpiLogin) {
        this.dpiLogin = dpiLogin;
    }

    public String getTelefonoLogin() {
        return telefonoLogin;
    }

    public void setTelefonoLogin(String telefonoLogin) {
        this.telefonoLogin = telefonoLogin;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel1.setText("INGRESE SU DPI:");

        jButtonLogin.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButtonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean buscarAsegurado(String dato) {
        boolean bandera = false;
        for (int i = 0; i < SolicitudSeguro.getInstancia().getContadorBtnSolicitar(); i++) {

            if (SolicitudRecibidos.asociado[i].getDpiAsociado().equals(dato)) {
                nombreLogin = SolicitudRecibidos.asociado[i].getNombreAsociado();
                dpiLogin = SolicitudRecibidos.asociado[i].getDpiAsociado();
                telefonoLogin = SolicitudRecibidos.asociado[i].getTelefonoAsociado();
                bandera = true;
            }
        }
        return bandera;
    }
    
    public boolean buscarNoAsegurado(String dato){
    boolean bandera = false;
        for (int i = 0; i < ReportarIncidente.getInstancia().getContadorAgregar(); i++) {

            if (ReportarIncidente.noasegurado[i].getDpiNoAsociado().equals(dato)) {
                bandera = true;
            }
        }
        return bandera;
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        nombreUsuario = jTextFieldNombreUsuario.getText().toUpperCase();

        if (nombreUsuario.equals("ADMIN")) {
            PanelAdministrador admin = new PanelAdministrador();
            admin.setVisible(true);
            dispose();
        } else if (buscarAsegurado(nombreUsuario)==true) {
            PanelAsegurado asegurado = new PanelAsegurado();
            asegurado.setVisible(true);
            dispose();
        } else if (buscarNoAsegurado(nombreUsuario)==true) {
            PanelNoAsegurado noasegurado = new PanelNoAsegurado();
            noasegurado.setVisible(true);
            dispose();
        } else if (jTextFieldNombreUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE UN USUARIO POR LO MENOS!!!");
        }else{
        JOptionPane.showMessageDialog(null,"USUARIO NO EXISTE");
        }


    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
