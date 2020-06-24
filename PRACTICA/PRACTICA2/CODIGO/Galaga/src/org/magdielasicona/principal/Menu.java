package org.magdielasicona.principal;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import org.magdielasicona.controlador.MenuJuego;
import org.magdielasicona.controlador.Ship;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Menu extends javax.swing.JFrame {

    private static Menu instanciaMenu;

    public static Menu getInstancia() {
        if (instanciaMenu == null) {
            instanciaMenu = new Menu();
        }
        return instanciaMenu;
    }
    private static String nombre;
    private String burbuja;
    private String ordenacion;

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MENU PRINCIPAL");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTopQuick = new javax.swing.JButton();
        jButtonTopBubble = new javax.swing.JButton();
        jButtonInicarJuego = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonTopQuick.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonTopQuick.setText("Top 5 QuickSort");
        jButtonTopQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTopQuickActionPerformed(evt);
            }
        });

        jButtonTopBubble.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonTopBubble.setText("Top 5 BubbleSort");
        jButtonTopBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTopBubbleActionPerformed(evt);
            }
        });

        jButtonInicarJuego.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonInicarJuego.setText("Iniciar Juego");
        jButtonInicarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicarJuegoActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonInfo.setText("Acerda del Desarrolador");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTopQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTopBubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInicarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonTopQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonTopBubble, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInicarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void quickSort(int primero, int ultimo, int []v,String c[]){
    int i = primero;
    int j = ultimo;
    int central = v[(primero+ultimo)/2];
    
        do {
            while(central>v[i]){
            i++;
            }
            while(central <=v[j]){
            j--;
            }
            if (i<=j) {
                int temp;
                String aux;
                
                temp = v[i];
                aux = c[i];
                v[i]=v[j];
                c[i]=c[j];
                v[j] = temp;
                c[j] = aux;
                
            }
        } while (i<=j);
        if (primero <j) {
             quickSort(primero,j,v,c);
        }
        if (ultimo>i) {
            quickSort(i,ultimo,v,c);
        }
    }
    
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonInicarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicarJuegoActionPerformed
        nombre = JOptionPane.showInputDialog(null, "INGRESE SU NOMBRE:");
        MenuJuego menuj = new MenuJuego();
        menuj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicarJuegoActionPerformed

    private void jButtonTopQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTopQuickActionPerformed
   int elementos = MenuJuego.getInstancia().getContadorGeneral();
        quickSort(0, (elementos-1) , MenuJuego.puntos, MenuJuego.nickNamePunto);
        String nombre [] = new String[50];
        
        //LINEAS DE HTML
       String rapido = "<h2>TABLA TOP 5 JUGADORES QUICKSORT</h2>\n"
                + "\n"
                + "<table class=\"editorDemoTable\">\n"
                + "<tbody>\n"
                + "<tr>\n"
                + "<td><strong>NICKNAME</strong></td>\n"
                + "<td><strong>PUNTOS</strong></td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[1] + "</td>\n"
                + "<td>" + MenuJuego.puntos[1] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[0] + "</td>\n"
                + "<td>" + MenuJuego.puntos[0] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[3] + "</td>\n"
                + "<td>" + MenuJuego.puntos[3] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[4] + "</td>\n"
                + "<td>" + MenuJuego.puntos[4] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[5]+ "</td>\n"
                + "<td>" + MenuJuego.puntos[5] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNamePunto[2] + "</td>\n"
                + "<td>" + MenuJuego.puntos[2] + "</td>\n"
                + "</tr>\n"
                + "</tbody>\n"
                + "</table>\n"
                + "<p>Galaga.</p>";
       entradatext(rapido);
       JOptionPane.showMessageDialog(null, "SE HA GENERADO EL REPORTE");
    }//GEN-LAST:event_jButtonTopQuickActionPerformed

    
    public void entradatext(String dato){
    try {

            FileWriter fw = new FileWriter("Top5QuickSort.html");
            fw.write(dato);
            fw.close();
        } catch (Exception e) {
        }
    }
    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        DatosEstudiante datosedu = new DatosEstudiante();
        datosedu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonTopBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTopBubbleActionPerformed
        int temp;
        String aux;
        //METODO BURBUJA
        int elementos = MenuJuego.getInstancia().getContadorGeneral();
        for (int i = 0; i < (elementos - 1); i++) {
            for (int j = 0; j < (elementos - 1); j++) {
                if (MenuJuego.tiempo[j] > MenuJuego.tiempo[j + 1]) {
                    temp = MenuJuego.tiempo[j];
                    aux = MenuJuego.nickNameTiempo[j];
                    MenuJuego.tiempo[j] = MenuJuego.tiempo[j + 1];
                    MenuJuego.nickNameTiempo[j] = MenuJuego.nickNameTiempo[j + 1];
                    MenuJuego.tiempo[j + 1] = temp;
                    MenuJuego.nickNameTiempo[j + 1] = aux;
                }

            }
        }
        //LINEAS DE HTML
        burbuja = "<h2>TABLA TOP 5 JUGADORES BUBBLESORT</h2>\n"
                + "\n"
                + "<table class=\"editorDemoTable\">\n"
                + "<tbody>\n"
                + "<tr>\n"
                + "<td><strong>NICKNAME</strong></td>\n"
                + "<td><strong>SEGUNDOS TRANCURRIDOS</strong></td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[0] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[0] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[1] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[1] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[2] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[2] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[3] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[3] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[4] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[4] + "</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td>" + MenuJuego.nickNameTiempo[5] + "</td>\n"
                + "<td>" + MenuJuego.tiempo[5] + "</td>\n"
                + "</tr>\n"
                + "</tbody>\n"
                + "</table>\n"
                + "<p>Galaga.</p>";
        recibirTexto(burbuja);
        JOptionPane.showMessageDialog(null, "SE HA GENERADO EL REPORTE");
    }//GEN-LAST:event_jButtonTopBubbleActionPerformed
    public void recibirTexto(String entrada) {
        try {

            FileWriter fw = new FileWriter("Top5Bubble.html");
            fw.write(entrada);
            fw.close();
        } catch (Exception e) {
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInicarJuego;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTopBubble;
    private javax.swing.JButton jButtonTopQuick;
    // End of variables declaration//GEN-END:variables
}
