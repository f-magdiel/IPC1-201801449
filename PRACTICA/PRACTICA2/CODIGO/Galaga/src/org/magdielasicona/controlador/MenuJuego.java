package org.magdielasicona.controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MenuJuego extends javax.swing.JFrame {

    public MenuJuego() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("CAMPO DE BATALLA");

        jButtonMisil.setBackground(Color.white);
        jButtonShip.setIcon(setIcono("/Imagenes/ship.png", jButtonShip));
        jButtonRayo.setIcon(setIcono("/Imagenes/rayo.png", jButtonRayo));
        jButtonCaracol.setIcon(setIcono("/Imagenes/caracol.png", jButtonCaracol));
        jButtonAsteroide.setIcon(setIcono("/Imagenes/asteroide.png", jButtonAsteroide));
        jButtonCorazon.setIcon(setIcono("/Imagenes/corazon.png", jButtonCorazon));
        jButtonOjo.setIcon(setIcono("/Imagenes/ojo.png", jButtonOjo));
        jButtonMisil.setIcon(setIcono("/Imagenes/Invisibilidad.png", jButtonMisil));

    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEstadistica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreJugador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVidas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPoder = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPunteo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldVelocidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTiempoRestante = new javax.swing.JTextField();
        jTextFieldTiempoConsumido = new javax.swing.JTextField();
        jPanelCampoBatalla = new javax.swing.JPanel();
        jButtonShip = new javax.swing.JButton();
        jButtonRayo = new javax.swing.JButton();
        jButtonCaracol = new javax.swing.JButton();
        jButtonAsteroide = new javax.swing.JButton();
        jButtonCorazon = new javax.swing.JButton();
        jButtonOjo = new javax.swing.JButton();
        jButtonMisil = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelEstadistica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)));

        jLabel1.setText("Nombre:");

        jLabelNombreJugador.setText("Jugador1");

        jLabel2.setText("Vidas:");

        jLabel3.setText("Poder:");

        jLabel4.setText("Velocidad: ");

        jLabel5.setText("Punteo:");

        jLabel6.setText("Tiempo Restante:");

        jLabel7.setText("Tiempo Consumido:");

        javax.swing.GroupLayout jPanelEstadisticaLayout = new javax.swing.GroupLayout(jPanelEstadistica);
        jPanelEstadistica.setLayout(jPanelEstadisticaLayout);
        jPanelEstadisticaLayout.setHorizontalGroup(
            jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstadisticaLayout.createSequentialGroup()
                .addGroup(jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEstadisticaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanelEstadisticaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombreJugador)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTiempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPoder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstadisticaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTiempoConsumido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEstadisticaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );
        jPanelEstadisticaLayout.setVerticalGroup(
            jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstadisticaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNombreJugador)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldVidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldTiempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTiempoConsumido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelCampoBatalla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCampoBatalla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));

        jButtonShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShipActionPerformed(evt);
            }
        });
        jButtonShip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonShipKeyPressed(evt);
            }
        });

        jButtonMisil.setBorder(null);
        jButtonMisil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMisilKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCampoBatallaLayout = new javax.swing.GroupLayout(jPanelCampoBatalla);
        jPanelCampoBatalla.setLayout(jPanelCampoBatallaLayout);
        jPanelCampoBatallaLayout.setHorizontalGroup(
            jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonRayo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButtonCaracol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButtonAsteroide, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMisil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShip, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButtonCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButtonOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelCampoBatallaLayout.setVerticalGroup(
            jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAsteroide, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCaracol, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(jButtonMisil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonShip, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRayo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jButtonEmpezar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonEmpezar.setText("Empezar");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelCampoBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanelCampoBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmpezar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonShip() {
        return jButtonShip;
    }

    public void setjButtonShip(JButton jButtonShip) {
        this.jButtonShip = jButtonShip;
    }


    private void jButtonShipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonShipKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
            jButtonShip.setLocation(jButtonShip.getX() - 10, jButtonShip.getY());

            System.out.println(jButtonShip.getX());
            if (jButtonShip.getX() == 4) {
                jButtonShip.setLocation(jButtonShip.getX() + 10, jButtonShip.getY());

            }

        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            jButtonShip.setLocation(jButtonShip.getX() + 10, jButtonShip.getY());

            System.out.println(jButtonShip.getX());
            if (jButtonShip.getX() == 764) {
                jButtonShip.setLocation(jButtonShip.getX() - 10, jButtonShip.getY());

            }
        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            jButtonMisil.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil));
            jButtonMisil.setLocation(jButtonShip.getX(), jButtonShip.getY());

            Misil mis = new Misil();
            mis.start();
            mis.lanzarMisil(jButtonMisil);

        }


    }//GEN-LAST:event_jButtonShipKeyPressed

    private void jButtonShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShipActionPerformed

    private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
        jButtonShip.requestFocusInWindow();

    }//GEN-LAST:event_jButtonEmpezarActionPerformed

    private void jButtonMisilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMisilKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            Misil mis = new Misil();
            mis.start();
            mis.lanzarMisil(jButtonMisil);
        }

    }//GEN-LAST:event_jButtonMisilKeyPressed

    public void keyTyped(KeyEvent e) {

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
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsteroide;
    private javax.swing.JButton jButtonCaracol;
    private javax.swing.JButton jButtonCorazon;
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JButton jButtonMisil;
    private javax.swing.JButton jButtonOjo;
    private javax.swing.JButton jButtonRayo;
    private javax.swing.JButton jButtonShip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNombreJugador;
    private javax.swing.JPanel jPanelCampoBatalla;
    private javax.swing.JPanel jPanelEstadistica;
    private javax.swing.JTextField jTextFieldPoder;
    private javax.swing.JTextField jTextFieldPunteo;
    private javax.swing.JTextField jTextFieldTiempoConsumido;
    private javax.swing.JTextField jTextFieldTiempoRestante;
    private javax.swing.JTextField jTextFieldVelocidad;
    private javax.swing.JTextField jTextFieldVidas;
    // End of variables declaration//GEN-END:variables
}
