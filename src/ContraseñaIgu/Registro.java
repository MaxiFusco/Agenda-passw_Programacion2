/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ContraseñaIgu;

import Contrasena.Encriptar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        setVisible(true);//para hacer visible la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        regNombre = new javax.swing.JTextField();
        regApellido = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        regCorreoElectronico1 = new javax.swing.JTextField();
        botonRegistrarse = new javax.swing.JButton();
        regContraseña2 = new javax.swing.JPasswordField();
        regContraseña1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 9, 108));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Security In Your Password");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Apellido:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Correo Electronico:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Repetir Contraseña:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 290, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 290, 10));

        regNombre.setBorder(null);
        regNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNombreActionPerformed(evt);
            }
        });
        jPanel2.add(regNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 30));

        regApellido.setBorder(null);
        regApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(regApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 290, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 10));

        regCorreoElectronico1.setBorder(null);
        regCorreoElectronico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCorreoElectronico1ActionPerformed(evt);
            }
        });
        jPanel2.add(regCorreoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, 30));

        botonRegistrarse.setBackground(new java.awt.Color(31, 174, 255));
        botonRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(null);
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 290, 40));

        regContraseña2.setBorder(null);
        regContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regContraseña2ActionPerformed(evt);
            }
        });
        jPanel2.add(regContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 290, 30));

        regContraseña1.setBorder(null);
        regContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regContraseña1ActionPerformed(evt);
            }
        });
        jPanel2.add(regContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
    private boolean validarCorreoElectronico(String correo) {
        String expresionRegular = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return correo.matches(expresionRegular);
    }
    private void regNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNombreActionPerformed
        regNombre.getText();
    }//GEN-LAST:event_regNombreActionPerformed

    private void regApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regApellidoActionPerformed
        regApellido.getText();
    }//GEN-LAST:event_regApellidoActionPerformed

    private void regCorreoElectronico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCorreoElectronico1ActionPerformed
        regCorreoElectronico1.getText();
    }//GEN-LAST:event_regCorreoElectronico1ActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        String nombre = regNombre.getText();
        String apellido = regApellido.getText();
        String correoElectronico = regCorreoElectronico1.getText();
        String contrasena1 = new String(regContraseña1.getPassword());
        String contrasena2 = new String(regContraseña2.getPassword());

        if (nombre.isEmpty() || apellido.isEmpty() || correoElectronico.isEmpty() || contrasena1.isEmpty() || contrasena2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (contrasena1.isEmpty() || contrasena2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar ambas contraseñas. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!contrasena1.equals(contrasena2)){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validarCorreoElectronico(correoElectronico)) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido. Por favor, inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validarContrasena(contrasena1)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una letra mayúscula, un número y un carácter especial.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Encriptar registrar = new Encriptar();
        registrar.ModificarContraseña(nombre, apellido, correoElectronico, contrasena1);

        // JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
        Ingreso panel1 = new Ingreso();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtener el JFrame que contiene este JPanel
        this.dispose();
    }//GEN-LAST:event_botonRegistrarseActionPerformed
    public static boolean validarContrasena(String contrasena) {
        // Verificar que la contraseña tenga al menos una letra mayúscula, un número y un carácter especial
        Pattern patron = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).+$");
        Matcher matcher = patron.matcher(contrasena);
        return matcher.find();
    }
    private void regContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regContraseña2ActionPerformed
        new String(regContraseña1.getPassword());
    }//GEN-LAST:event_regContraseña2ActionPerformed

    private void regContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regContraseña1ActionPerformed
        new String(regContraseña2.getPassword());
    }//GEN-LAST:event_regContraseña1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField regApellido;
    private javax.swing.JPasswordField regContraseña1;
    private javax.swing.JPasswordField regContraseña2;
    private javax.swing.JTextField regCorreoElectronico1;
    private javax.swing.JTextField regNombre;
    // End of variables declaration//GEN-END:variables
}
