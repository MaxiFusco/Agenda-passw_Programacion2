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
public class BorrarBD {
    public void eliContacto(String aplicacion) { 
        try {
            // Establecer conexión a la base de datos
            Connection conn = BD.getConnection();

            // Obtener los datos del contacto a partir del correo electrónico
            JOptionPane.showConfirmDialog(null,aplicacion);
            String query = "SELECT * FROM contra.datos WHERE aplicacion = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, aplicacion);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                // Mostrar los datos del contacto
                String nombre = rs.getString("aplicacion");
                String usuario = rs.getString("usuario");
                int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar la Aplicacion" + nombre + " del Usuario: " + usuario + "?");

                if (opcion == JOptionPane.YES_OPTION) {
                    eliminarContacto(aplicacion); // Eliminar el contacto si el usuario confirma
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada");
                }
            } else {
                // El contacto no fue encontrado en la base de datos
                JOptionPane.showMessageDialog(null, "La Aplicacion no fue encontrado en la base de datos");
            }

            // Cerrar la conexión
            conn.close();

        } catch (SQLException e) {
            // Manejar cualquier error de la base de datos
            e.printStackTrace();
        }
    }

    public void eliminarContacto(String aplicacion) {
        try {
            // Establecer conexión a la base de datos
            Connection conn = BD.getConnection();

            // Eliminar el contacto
            String query = "DELETE FROM contra.datos WHERE aplicacion = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, aplicacion);
            statement.executeUpdate();

            // Cerrar la conexión
            conn.close();
            JOptionPane.showMessageDialog(null, "Aplicacion eliminado exitosamente");
            
            Buscar BuscarNuevo = new Buscar();
            BuscarNuevo.cargarAplicaciones();

        } catch (SQLException e) {
            // Manejar cualquier error de la base de datos
            e.printStackTrace();
        }
    }
}
