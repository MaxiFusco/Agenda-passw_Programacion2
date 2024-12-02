/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.Vector;  

/**  
 *  
 * @author EdUaRdO  
 */  
public class BuscarContactos {  

    private int id;  
    private String nombre;  

    public int getId() {  
        return id;  
    }  

    public void setId(int id) {  
        this.id = id;  
    }  

    public String getNombre() {  
        return nombre;  
    }  

    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    @Override  
    public String toString() {  
        return this.nombre;  
    }  

    public Vector<BuscarContactos> mostrarAplicacion() {  
        PreparedStatement ps = null;  
        ResultSet rs = null;  
        Vector<BuscarContactos> datos = new Vector<>();  

        try (Connection conn = BD.getConnection()) { // Usar conexión a través de BD.getConnection()  
            String sql = "SELECT aplicacion FROM contra.datos"; // Verifica que 'aplicacion' sea correcto  
            ps = conn.prepareStatement(sql);  
            rs = ps.executeQuery();  

            // Agregar un elemento por defecto  
            BuscarContactos dat = new BuscarContactos();  
            dat.setId(0);  
            dat.setNombre("Seleccione Aplicacion");  
            datos.add(dat);  

            while (rs.next()) {  
                dat = new BuscarContactos();  
                dat.setId(0); // Asumir que este valor no se recibe en la consulta actual  
                dat.setNombre(rs.getString("aplicacion")); // Asegúrate de que la columna se llama 'aplicacion'  
                datos.add(dat);  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return datos;  
    }  
} 
