/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONObject;  

/**  
 *  
 * @author EdUaRdO  
 */  
public class BuscarContactos {

    private int id;
    private String nombre;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return this.nombre;
    }

    public Vector<BuscarContactos> mostrarAplicacion() {
        Vector<BuscarContactos> datos = new Vector<>();
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/api/aplicaciones"))
                .header("Accept", "application/json")
                .GET()
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JSONArray array = new JSONArray(response.body());

                // opción por defecto
                BuscarContactos def = new BuscarContactos();
                def.setId(0);
                def.setNombre("Seleccione Aplicación");
                datos.add(def);

                for (int i = 0; i < array.length(); i++) {
                    JSONObject obj = array.getJSONObject(i);
                    BuscarContactos contacto = new BuscarContactos();
                    contacto.setId(obj.getInt("id"));
                    contacto.setNombre(obj.getString("aplicacion"));
                    datos.add(contacto);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener datos: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con el servidor: " + e.getMessage());
        }

        return datos;
    }
}
