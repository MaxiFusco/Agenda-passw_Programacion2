/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

/**
 *
 * @author Eduardo
 */

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class RecuperarBD {

    public void recuperarContrasena(String email) {
        try {
            String emailCodificado = URLEncoder.encode(email, StandardCharsets.UTF_8);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/api/recuperar?correoElectronico=" + emailCodificado))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JSONObject obj = new JSONObject(response.body());
                String contrasena = obj.optString("contrasena");
                JOptionPane.showMessageDialog(null, "Tu contraseña es: " + contrasena);
            } else if (response.statusCode() == 404) {
                JOptionPane.showMessageDialog(null, "Correo no registrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Error del servidor: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
