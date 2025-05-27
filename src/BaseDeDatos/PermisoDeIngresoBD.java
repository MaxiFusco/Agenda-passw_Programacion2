package BaseDeDatos;

import ContraseñaIgu.IguContraseña;
import ContraseñaIgu.Ingreso;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import javax.swing.JFrame;
import org.json.JSONObject;

public class PermisoDeIngresoBD {
    private final HttpClient httpClient;

    public PermisoDeIngresoBD() {
        // Inicializar el HttpClient
        this.httpClient = HttpClient.newHttpClient();
    }

    public void ingreso(String email, String contrasena, JFrame Ingreso) {
        try {
            URI uri = URI.create("http://localhost:8080/api/usuarios/login");

            JSONObject jsonInput = new JSONObject();
            jsonInput.put("correoElectronico", email);
            jsonInput.put("contrasena", contrasena);

            // Crear solicitud HTTP con método POST
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonInput.toString(), StandardCharsets.UTF_8))
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            

            System.out.println(jsonInput.toString());

            // Verificar código de respuesta y procesar respuesta JSON
              System.out.println(response.statusCode());
            if (response.statusCode() == 200) { // Código 200 - OK
                JSONObject jsonResponse = new JSONObject(response.body());
                if (jsonResponse.has("success")) {
                    boolean success = jsonResponse.getBoolean("success");

                    if (success) {
                        JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
                        System.setProperty("user", email);
                       IguContraseña panel3 = new IguContraseña();
                        Ingreso.dispose(); 
                      
                    } else {
                        JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta del servidor no válida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos" );
            }
          
        } catch (Exception e) {
           
        }
    }
}


