/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ContraseñaIgu;


import Contrasena.IngresoEncriptar;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class Ingreso extends javax.swing.JFrame {


    public Ingreso() {
        initComponents();
        Toolkit miPantalla = Toolkit.getDefaultToolkit();//medidadas de la pantalla
        Dimension tamanoPantalla = miPantalla.getScreenSize();//guardar las medidas
        int alturaPantalla = tamanoPantalla.height;
        int anchoPntalla = tamanoPantalla.width;
        setSize(anchoPntalla / 2, alturaPantalla );//tamaño de la pantalla
        setLocation(400,0);//ubicacion donde aparece
        setTitle("Inicio De Usuario");//nombre al panel
        setVisible(true);//para hacer visible la pantalla
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JLabel();
        ingEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JLabel();
        ingContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        botonRegistrarse = new javax.swing.JButton();
        botonEntrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 9, 108));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Security In Your Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContraseñaIguImagen/icono2_5.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 140));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Email:");

        ingEmail.setBackground(new java.awt.Color(255, 255, 255));
        ingEmail.setForeground(new java.awt.Color(0, 0, 0));
        ingEmail.setBorder(null);
        ingEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingEmailActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setText("Contraseña:");

        ingContraseña.setBackground(new java.awt.Color(255, 255, 255));
        ingContraseña.setForeground(new java.awt.Color(0, 0, 0));
        ingContraseña.setBorder(null);
        ingContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingContraseñaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ingContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(ingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(ingContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 210));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        botonRegistrarse.setBackground(new java.awt.Color(31, 174, 255));
        botonRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(null);
        botonRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        botonEntrar1.setBackground(new java.awt.Color(31, 174, 255));
        botonEntrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        botonEntrar1.setText("Entrar");
        botonEntrar1.setBorder(null);
        botonEntrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, 90));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 200, 6, 200);
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingEmailActionPerformed
        ingEmail.getText();
    }//GEN-LAST:event_ingEmailActionPerformed

    private void ingContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingContraseñaActionPerformed
        new String(ingContraseña.getPassword());
    }//GEN-LAST:event_ingContraseñaActionPerformed

    private void botonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrar1ActionPerformed
        String email=ingEmail.getText();
        String contraseña=new String(ingContraseña.getPassword());
        if (email.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        IngresoEncriptar permiso = new IngresoEncriptar();
        permiso.Revisarcontrasena(email,contraseña,this);
        
    }//GEN-LAST:event_botonEntrar1ActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
      javax.swing.JFrame frame = new javax.swing.JFrame();
      Registro panel2 = new Registro();
      this.dispose();
    }//GEN-LAST:event_botonRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar1;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField ingContraseña;
    private javax.swing.JTextField ingEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtEmail;
    // End of variables declaration//GEN-END:variables
}
