/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contrasena;

import BaseDeDatos.PermisoDeIngresoBD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;


public class IngresoEncriptar {
     public void Revisarcontrasena(String email,String contrasena,JFrame ventana){ 
    // Solicita al usuario que ingrese un texto
        String originalString = contrasena;
        if (originalString != null && !originalString.isEmpty()) {
            try {
                // Crea una instancia de MessageDigest para SHA-256
                MessageDigest digest = MessageDigest.getInstance("SHA-256");  
                 // Calcula el hash del texto original
                byte[] encodedHash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));

                // Convierte el resultado a una cadena hexadecimal
                String hashedValue = bytesToHex(encodedHash);

                // Muestra el hash utilizando JOptionPane
                //JOptionPane.showMessageDialog(null, "SHA-256 Hash: " + hashedValue);
                String contrasena1= hashedValue;
                System.out.println(contrasena1);
                
             PermisoDeIngresoBD permiso = new PermisoDeIngresoBD();
             permiso.ingreso(email, contrasena1, ventana); 
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        
        }
    }

    // Método para convertir bytes a una cadena hexadecimal
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
