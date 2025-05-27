package BaseDeDatos;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;


public class BorrarBD {

    public void eliContacto(String aplicacion) {
        try {
            // Confirmar con el usuario si desea eliminar
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Seguro que quieres eliminar la aplicación: " + aplicacion + "?",
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }

            // Codificar el nombre de la aplicación para URL
            String nombreAppCodificada = URLEncoder.encode(aplicacion, StandardCharsets.UTF_8);

            // Crear cliente HTTP y construir la solicitud DELETE
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/api/aplicaciones/" + nombreAppCodificada))
                    .DELETE()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar la respuesta del servidor
            if (response.statusCode() == 200) {
                JOptionPane.showMessageDialog(null, "Aplicación eliminada correctamente.");
            } else if (response.statusCode() == 404) {
                JOptionPane.showMessageDialog(null, "Aplicación no encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar. Código: " + response.statusCode()
                        + "\nRespuesta: " + response.body());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }
}
