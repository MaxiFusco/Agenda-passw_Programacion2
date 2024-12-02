package BaseDeDatos;  

import javax.swing.JOptionPane;  
import java.net.URI;  
import java.net.http.HttpClient;  
import java.net.http.HttpRequest;  
import java.net.http.HttpResponse;  
import java.nio.charset.StandardCharsets;  
import org.json.JSONObject;  
import java.time.Duration;  

public class NuevoRegistroBD {  
    private final HttpClient httpClient;  

    public NuevoRegistroBD() {  
        // Inicializar el HttpClient con un tiempo de espera  
        this.httpClient = HttpClient.newBuilder()  
                .connectTimeout(Duration.ofSeconds(10))  
                .build();  
    }  

    public void registrarNuevoUsuario(String nombre, String apellido, String correoElectronico, String contrasena) {  
        // Validaciones simples de entrada  
        if (nombre.isEmpty() || apellido.isEmpty() || correoElectronico.isEmpty() || contrasena.isEmpty()) {  
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");  
            return;  
        }  

        try {  
            URI uri = URI.create("http://localhost:8080/api/usuarios");  

            // Crear el objeto JSON  
            JSONObject jsonInput = new JSONObject();  
            jsonInput.put("correoElectronico", correoElectronico);  
            jsonInput.put("nombre", nombre);  
            jsonInput.put("apellido", apellido);  
            jsonInput.put("contrasena", contrasena);  

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
    }  
}


