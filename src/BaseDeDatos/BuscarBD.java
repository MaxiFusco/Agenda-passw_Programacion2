/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import ContraseñaIgu.Buscar;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

import org.json.JSONObject;

public class BuscarBD {

    public void aplicacion1(String nombreApp, Buscar ventana) {
        try {
            String nombreAppCodificada = URLEncoder.encode(nombreApp, StandardCharsets.UTF_8);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/api/aplicaciones/" + nombreAppCodificada))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Aquí esperamos un objeto JSON (no un array)
                JSONObject obj = new JSONObject(response.body());

                String app = obj.optString("aplicacion", "");
                String usuario = obj.optString("nombreUsuario", "");
                String contrasena = obj.optString("contrasena", "");
                String email = obj.optString("emailRecuperacion", "");
                String usuarioCorreo = obj.optString("correoUsuario", "");

                ventana.llevarDatos(app, usuario, contrasena, email, usuarioCorreo);

            } else if (response.statusCode() == 404) {
                JOptionPane.showMessageDialog(null, "Aplicación no encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar. Código: " + response.statusCode() +
                        "\nRespuesta: " + response.body());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }
}