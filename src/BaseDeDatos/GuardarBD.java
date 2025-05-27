
package BaseDeDatos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import javax.swing.JOptionPane;
import org.json.JSONObject;


public class GuardarBD {
      
private final HttpClient httpClient;

    public GuardarBD() {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public void guardar(String aplicacion, String usuario, String contrasena, String email, String usuario2) {
        if (aplicacion.isEmpty() || usuario.isEmpty() || contrasena.isEmpty() || usuario2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        try {
            URI uri = URI.create("http://localhost:8080/api/aplicaciones");

            JSONObject jsonInput = new JSONObject();
            jsonInput.put("aplicacion", aplicacion);
            jsonInput.put("usuario", usuario);
            jsonInput.put("contrasena", contrasena);
            jsonInput.put("emailRecuperacion", email);
            jsonInput.put("usuarioCorreo", usuario2); // este debe coincidir con el campo del backend

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonInput.toString(), StandardCharsets.UTF_8))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 201 || response.statusCode() == 200) {
                JOptionPane.showMessageDialog(null, "¡Guardado Correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar la aplicación: "
                        + response.statusCode() + "\nRespuesta: " + response.body());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}