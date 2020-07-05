package org.magdielasicona.menu;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.magdielasicona.hora.Tiempo;
import org.magdielasicona.pila.ListaPila;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("FINAL LABORATORIO");
        jButtonUno.requestFocusInWindow();
        jButtonUno.setBackground(Color.white);
        jButtonDos.setBackground(Color.white);
        jButtonTres.setBackground(Color.white);
        jButtonCuatro.setBackground(Color.white);
        jButtonCinco.setBackground(Color.white);
        jButtonSeis.setBackground(Color.white);
        jButtonSiete.setBackground(Color.white);

        HiloUno btn1 = new HiloUno();
        HiloDos btn2 = new HiloDos();
        HiloTres btn3 = new HiloTres();
        HiloCuatro btn4 = new HiloCuatro();
        HiloCinco btn5 = new HiloCinco();
        HiloSeis btn6 = new HiloSeis();
        HiloSiete btn7 = new HiloSiete();
        Tiempo t = new Tiempo();
        ListaPila.getInstancia().obtenerArea(jTextAreaTexto);

        btn1.obtenerBoton1(jButtonUno);
        btn2.obtenerBoton2(jButtonDos);
        btn3.obtenerBoton3(jButtonTres);
        btn4.obtenerBoton4(jButtonCuatro);
        btn5.obtenerBoton5(jButtonCinco);
        btn6.obtenerBoton6(jButtonSeis);
        btn7.obtenerBoton7(jButtonSiete);
        t.obtenerTiempo(jLabelTiempo);

        btn1.start();
        btn2.start();
        btn3.start();
        btn4.start();
        btn5.start();
        btn6.start();
        btn7.start();
        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonUno = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonSiete = new javax.swing.JButton();
        jButtonEspacio1 = new javax.swing.JButton();
        jButtonEspacio2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTexto = new javax.swing.JTextArea();
        jButtonPop = new javax.swing.JButton();
        jLabelTiempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonUno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUno.setText("1");
        jButtonUno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUnoMouseClicked(evt);
            }
        });
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 7, 67, 55));

        jButtonTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonTres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTres.setText("3");
        jButtonTres.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTresMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 7, 67, 55));

        jButtonDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDos.setText("2");
        jButtonDos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDosMouseClicked(evt);
            }
        });
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 7, 67, 55));

        jButtonCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCuatro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCuatro.setText("4");
        jButtonCuatro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCuatroMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 68, 67, 55));

        jButtonCinco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCinco.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCinco.setText("5");
        jButtonCinco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCincoMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 129, 67, 55));

        jButtonSeis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSeis.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeis.setText("6");
        jButtonSeis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSeisMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 68, 67, 55));

        jButtonSiete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSiete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiete.setText("7");
        jButtonSiete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSieteMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 129, 67, 55));

        jButtonEspacio1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEspacio1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEspacio1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jButtonEspacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 202, 67, 55));

        jButtonEspacio2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEspacio2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEspacio2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jButtonEspacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 202, 67, 55));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTexto);

        jButtonPop.setText("POP");
        jButtonPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPopActionPerformed(evt);
            }
        });

        jLabelTiempo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLabelTiempo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPop, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed

    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed

    }//GEN-LAST:event_jButtonUnoActionPerformed

    private void jButtonUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUnoMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonUno.getText());
        jButtonUno.setBackground(Color.white);

        HiloUno.getInstancia().setBanderaHilo1(false);
        jButtonUno.setBounds(2, jButtonUno.getY(), jButtonUno.getWidth(), jButtonUno.getHeight());
        ListaPila.getInstancia().imprimirArea();

    }//GEN-LAST:event_jButtonUnoMouseClicked

    private void jButtonDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDosMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonDos.getText());
        jButtonDos.setBackground(Color.white);

        HiloDos.getInstancia().setBanderaHilo2(false);
        jButtonDos.setBounds(2, jButtonUno.getY(), jButtonUno.getWidth(), jButtonUno.getHeight());
        ListaPila.getInstancia().imprimirArea();
    }//GEN-LAST:event_jButtonDosMouseClicked

    private void jButtonTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTresMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonTres.getText());
        jButtonTres.setBackground(Color.white);

        HiloTres.getInstancia().setBanderaHilo3(false);
        jButtonTres.setBounds(0, jButtonTres.getY(), jButtonTres.getWidth(), jButtonTres.getHeight());
        ListaPila.getInstancia().imprimirArea();
    }//GEN-LAST:event_jButtonTresMouseClicked

    private void jButtonCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCuatroMouseClicked

        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonCuatro.getText());
        jButtonCuatro.setBackground(Color.white);

        HiloCuatro.getInstancia().setBanderaHilo4(false);
        jButtonCuatro.setBounds(2, jButtonCuatro.getY(), jButtonCuatro.getWidth(), jButtonCuatro.getHeight());
        ListaPila.getInstancia().imprimirArea();

    }//GEN-LAST:event_jButtonCuatroMouseClicked

    private void jButtonCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCincoMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonCinco.getText());
        jButtonCinco.setBackground(Color.white);

        HiloCinco.getInstancia().setBanderaHilo5(false);
        jButtonCinco.setBounds(2, jButtonCinco.getY(), jButtonCinco.getWidth(), jButtonCinco.getHeight());
        ListaPila.getInstancia().imprimirArea();
    }//GEN-LAST:event_jButtonCincoMouseClicked

    private void jButtonSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSeisMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonSeis.getText());
        jButtonSeis.setBackground(Color.white);

        HiloSeis.getInstancia().setBanderaHilo6(false);
        jButtonSeis.setBounds(2, jButtonSeis.getY(), jButtonSeis.getWidth(), jButtonSeis.getHeight());
        ListaPila.getInstancia().imprimirArea();
    }//GEN-LAST:event_jButtonSeisMouseClicked

    private void jButtonSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSieteMouseClicked
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().insertarPila(jButtonSiete.getText());
        jButtonSiete.setBackground(Color.white);

        HiloSiete.getInstancia().setBanderaHilo7(false);
        jButtonSiete.setBounds(2, jButtonSiete.getY(), jButtonSiete.getWidth(), jButtonSiete.getHeight());
        ListaPila.getInstancia().imprimirArea();
    }//GEN-LAST:event_jButtonSieteMouseClicked

    private void jButtonPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPopActionPerformed
        ListaPila.getInstancia().retirar();
        jTextAreaTexto.setText("");
        ListaPila.getInstancia().imprimirArea();

    }//GEN-LAST:event_jButtonPopActionPerformed

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
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonEspacio1;
    private javax.swing.JButton jButtonEspacio2;
    private javax.swing.JButton jButtonPop;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JTextField jLabelTiempo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTexto;
    // End of variables declaration//GEN-END:variables
}
