
package BaseDeDatos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import javax.swing.JOptionPane;
import org.json.JSONObject;


public class GuardarBD {
      

     public void guardar (String aplicacion,String usuario,String contrasena,String email,String usuario2) {
        /* if (aplicacion.isEmpty() || usuario.isEmpty() || contrasena.isEmpty() || usuario2.isEmpty()) {  
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");  
            return;  
        }  

        try {  
            URI uri = URI.create("http://localhost:8080/api/datos");  

            // Crear el objeto JSON  
            JSONObject jsonInput = new JSONObject();  
            jsonInput.put("aplicacion", aplicacion);  
            jsonInput.put("usuario", usuario);  
            jsonInput.put("contrasena", contrasena);  
            jsonInput.put("email_recuperacion", email);  
              jsonInput.put("Correo_electronico_usuarios", usuario2); 

            // Construir la solicitud  
            HttpRequest request = HttpRequest.newBuilder()  
                    .uri(uri)  
                    .header("Content-Type", "application/json")  
                    .POST(HttpRequest.BodyPublishers.ofString(jsonInput.toString(), StandardCharsets.UTF_8))  
                    .build();  

            // Enviar la solicitud y recibir la respuesta  
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());  

            // Manejar la respuesta  
            if (response.statusCode() == 201 || response.statusCode() == 200) {  
                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");  
            } else {  
                JOptionPane.showMessageDialog(null, "Error al registrar el usuario: "  
                    + response.statusCode() + "\nRespuesta: " + response.body());  
            }  

        } catch (Exception e) {  
            e.printStackTrace();  
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());  
        }  
         
         
  */ try {
            // Establecer conexión a la base de datos
            Connection conn = BD.getConnection();

            // Verificar si el usuario ya existe
            String queryVerificacion = "SELECT COUNT(*) FROM contra.datos WHERE aplicacion = ?"; 
            PreparedStatement statementVerificacion = conn.prepareStatement(queryVerificacion);
            statementVerificacion.setString(1, aplicacion);
            ResultSet rs = statementVerificacion.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                // Usuario ya existe
                JOptionPane.showMessageDialog(null, "La aplicacion ya esta registrada en la base de datos");
            } else {
                // Crear la sentencia SQL para insertar la información
                String query = "INSERT INTO contra.datos (aplicacion, usuario, contrasena, Email_recuperacion, Correo_electronico_usuarios) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, aplicacion);
                statement.setString(2, usuario);
                statement.setString(3, contrasena);
                statement.setString(4, email);
                statement.setString(5, usuario2);
        
                // Ejecutar la consulta
                statement.executeUpdate();

                // Cerrar la conexión
                conn.close();
                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
            }

        } catch (SQLException e) {
            // Manejar cualquier error de la base de datos
            e.printStackTrace();
        }
    }
}
