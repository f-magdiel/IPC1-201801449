package org.magdielasicona.controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.magdielasicona.principal.Menu;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MenuJuego extends javax.swing.JFrame {

    private int contadorMisil = 0;

    public MenuJuego() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("CAMPO DE BATALLA");
        //Posicionando objetos

//        jButtonMisil1.setBackground(Color.white);
//        jButtonMisil2.setBackground(Color.white);
//        jButtonMisil3.setBackground(Color.white);
//        jButtonMisil4.setBackground(Color.white);
        jButtonShip.setIcon(setIcono("/Imagenes/space-ship.png", jButtonShip));
        jButtonRayo.setIcon(setIcono("/Imagenes/rayo.png", jButtonRayo));
        jButtonCaracol.setIcon(setIcono("/Imagenes/caracol.png", jButtonCaracol));
        jButtonAsteroide.setIcon(setIcono("/Imagenes/asteroide.png", jButtonAsteroide));
        jButtonCorazon.setIcon(setIcono("/Imagenes/corazon.png", jButtonCorazon));
        jButtonOjo.setIcon(setIcono("/Imagenes/ojo.png", jButtonOjo));
        jButtonMisil1.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil1));
        jButtonMisil2.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil1));
        jButtonMisil3.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil1));
        jButtonMisil4.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil1));

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
        jButtonMisil1 = new javax.swing.JButton();
        jButtonMisil2 = new javax.swing.JButton();
        jButtonMisil3 = new javax.swing.JButton();
        jButtonMisil4 = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

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

        jButtonRayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRayoActionPerformed(evt);
            }
        });

        jButtonMisil1.setBorder(null);
        jButtonMisil1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMisil1KeyPressed(evt);
            }
        });

        jButtonMisil2.setBorder(null);
        jButtonMisil2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMisil2KeyPressed(evt);
            }
        });

        jButtonMisil3.setBorder(null);
        jButtonMisil3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMisil3KeyPressed(evt);
            }
        });

        jButtonMisil4.setBorder(null);
        jButtonMisil4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMisil4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCampoBatallaLayout = new javax.swing.GroupLayout(jPanelCampoBatalla);
        jPanelCampoBatalla.setLayout(jPanelCampoBatallaLayout);
        jPanelCampoBatallaLayout.setHorizontalGroup(
            jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShip, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                                .addComponent(jButtonAsteroide, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRayo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                                .addComponent(jButtonOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCaracol, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonMisil2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMisil3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonMisil1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMisil4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCampoBatallaLayout.setVerticalGroup(
            jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBatallaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRayo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAsteroide, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCaracol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMisil2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMisil3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelCampoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMisil1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMisil4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButtonShip, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jButtonEmpezar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonEmpezar.setText("Empezar");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanelEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCampoBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCampoBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmpezar)
                    .addComponent(jButtonSalir))
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

        //--------------------------------------------------------------------------
        if (evt.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
            jTextFieldVelocidad.setText(String.valueOf(Misil.getInstancia().getVelocidadObjetos()));
            jTextFieldPunteo.setText(String.valueOf(Misil.getInstancia().getPunteo()));
            jTextFieldVidas.setText(String.valueOf(Ship.getInstancia().getVidaShip()));
            
            jButtonShip.setLocation(jButtonShip.getX() - 108, jButtonShip.getY());

            System.out.println("X:" + jButtonShip.getX());
            System.out.println("Y:" + jButtonShip.getY());

            if (jButtonShip.getX() == 53) {
                jButtonShip.setLocation(jButtonShip.getX() + 108, jButtonShip.getY());

            }

        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            jTextFieldVelocidad.setText(String.valueOf(Misil.getInstancia().getVelocidadObjetos()));
            jTextFieldPunteo.setText(String.valueOf(Misil.getInstancia().getPunteo()));
             jTextFieldVidas.setText(String.valueOf(Ship.getInstancia().getVidaShip()));
            
            jButtonShip.setLocation(jButtonShip.getX() + 108, jButtonShip.getY());

            if (jButtonShip.getX() == 593) {
                jButtonShip.setLocation(jButtonShip.getX() - 108, jButtonShip.getY());

            }
        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {

            contadorMisil++;
            System.out.println(contadorMisil);

            if (contadorMisil == 1) {
                jButtonMisil1.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil1));
                jButtonMisil1.setLocation(jButtonShip.getX(), jButtonShip.getY());
                System.out.println("MISIL 1 SOLTADO");
                Misil mis1 = new Misil();
                mis1.obtenerRayo(jButtonRayo);
                mis1.start();

                mis1.lanzarMisil(jButtonMisil1);
            } else if (contadorMisil == 2) {
                jButtonMisil2.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil2));
                jButtonMisil2.setLocation(jButtonShip.getX(), jButtonShip.getY());
                System.out.println("MISIL 2 SOLTADO");
                Misil mis2 = new Misil();
                mis2.obtenerRayo(jButtonRayo);
                mis2.start();
                mis2.lanzarMisil(jButtonMisil2);
            } else if (contadorMisil == 3) {
                jButtonMisil3.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil3));
                jButtonMisil3.setLocation(jButtonShip.getX(), jButtonShip.getY());
                System.out.println("MISIL 3 SOLTADO");
                Misil mis3 = new Misil();
                mis3.obtenerRayo(jButtonRayo);
                mis3.start();
                mis3.lanzarMisil(jButtonMisil3);
            } else if (contadorMisil == 4) {
                contadorMisil = 0;
                jButtonMisil4.setIcon(setIcono("/Imagenes/misil.png", jButtonMisil4));
                jButtonMisil4.setLocation(jButtonShip.getX(), jButtonShip.getY());
                System.out.println("MISIL 4 SOLTADO");
                Misil mis4 = new Misil();
                mis4.obtenerRayo(jButtonRayo);
                mis4.start();
                mis4.lanzarMisil(jButtonMisil4);
            }
        }


    }//GEN-LAST:event_jButtonShipKeyPressed

    private void jButtonShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShipActionPerformed

    private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
        jButtonShip.requestFocusInWindow();
        Rayo ray = new Rayo();
        Asteroide asteroide = new Asteroide();
        Caracol caracol = new Caracol();
        Corazon corazon = new Corazon();
        Ojo ojo = new Ojo();
        Ship ship = new Ship();

        jButtonOjo.setBounds(269, -180, jButtonOjo.getWidth(), jButtonOjo.getHeight());
        jButtonCorazon.setBounds(485, -90, jButtonCorazon.getWidth(), jButtonCorazon.getHeight());
        jButtonCaracol.setBounds(269, -90, jButtonCaracol.getWidth(), jButtonCaracol.getHeight());
        jButtonAsteroide.setBounds(161, -180, jButtonAsteroide.getWidth(), jButtonAsteroide.getHeight());
        jButtonRayo.setBounds(377, -180, jButtonRayo.getWidth(), jButtonRayo.getHeight());
        
        
       
        ojo.lanzarOjo(jButtonOjo);
        corazon.lanzarCorazon(jButtonCorazon);
        caracol.lanzarCaracol(jButtonCaracol);
        asteroide.lanzarAsteroide(jButtonAsteroide);
        ray.lanzarRayo(jButtonRayo);
        ship.obtenerShip(jButtonShip);

        //Inicializadno hilos
        ray.start();
        asteroide.start();
        caracol.start();
        corazon.start();
        ojo.start();
        ship.start();


    }//GEN-LAST:event_jButtonEmpezarActionPerformed

    private void jButtonMisil1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMisil1KeyPressed


    }//GEN-LAST:event_jButtonMisil1KeyPressed

    private void jButtonMisil2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMisil2KeyPressed

    }//GEN-LAST:event_jButtonMisil2KeyPressed

    private void jButtonMisil3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMisil3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMisil3KeyPressed

    private void jButtonMisil4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMisil4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMisil4KeyPressed

    private void jButtonRayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRayoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRayoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        Rayo ray = new Rayo();
        Asteroide asteroide = new Asteroide();
        Caracol caracol = new Caracol();
        Corazon corazon = new Corazon();
        Ojo ojo = new Ojo();
        Ship ship = new Ship();
        Menu menu = new Menu();
        //Inicializadno hilos
        ray.stop();
        asteroide.stop();
        caracol.stop();
        corazon.stop();
        ojo.stop();
        ship.stop();
        menu.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public JTextField getjTextFieldVelocidad() {
        return jTextFieldVelocidad;
    }

    public void setjTextFieldVelocidad(JTextField jTextFieldVelocidad) {
        this.jTextFieldVelocidad = jTextFieldVelocidad;
    }

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
    private javax.swing.JButton jButtonMisil1;
    private javax.swing.JButton jButtonMisil2;
    private javax.swing.JButton jButtonMisil3;
    private javax.swing.JButton jButtonMisil4;
    private javax.swing.JButton jButtonOjo;
    private javax.swing.JButton jButtonRayo;
    private javax.swing.JButton jButtonSalir;
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
