/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import ContraseñaIgu.Buscar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author EdUaRdO
 */
public class BuscarBD {
  public void aplicacion1(String aplicacion,Buscar iguInstance){
      try {
            // Establecer conexión a la base de datos
            Connection conn = BD.getConnection();

            // Obtener los datos
            String query = "SELECT aplicacion, usuario, contrasena, Email_recuperacion, Correo_electronico_usuarios FROM contra.datos WHERE aplicacion = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, aplicacion);
            ResultSet rs = statement.executeQuery();


            if (rs.next()) {
                // Mostrar los datos
                String aplicacion1 = rs.getString("aplicacion");
                String usuario = rs.getString("usuario");
                String contrasena =rs.getString("contrasena");
                String Email_recuperacion =rs.getString("Email_recuperacion");
                String Correo_electronico_usuarios =rs.getString("Correo_electronico_usuarios");
               
                
                iguInstance.llevarDatos(aplicacion1, usuario, contrasena, Email_recuperacion, Correo_electronico_usuarios);
                
            } else {
                // El contacto no fue encontrado en la base de datos
                JOptionPane.showMessageDialog(null, "La aplicacion no fue encontrada");
            }

            // Cerrar la conexión
            conn.close();

        } catch (SQLException e) {
            // Manejar cualquier error de la base de datos
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        }
   }
  }
