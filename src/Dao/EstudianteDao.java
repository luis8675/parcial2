/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import conexion.CreateConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Estudiante;

/**
 *
 * @author luisc
 */
public class EstudianteDao {
    private final CreateConnection connFactory = new CreateConnection();

        public List<Estudiante> obtenerTodos() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM Estudiante";
        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
             
            while (rs.next()) {
                Estudiante est = new Estudiante(
                        rs.getInt("idEstudiante"),
                        rs.getString("Carnet"),
                        rs.getString("FirstName"),
                        rs.getString("SecondName"),
                        rs.getString("LastName"),
                        rs.getString("Direccion"),
                        rs.getInt("Telefono"),
                        rs.getString("Carrera"),
                        rs.getString("FechaNacimiento"),
                        rs.getString("FechaIngreso"),                        
                        rs.getDouble("CuotaMensual")
                );
                lista.add(est);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
        
     public boolean guardar(Estudiante est) {
        String sql = "INSERT INTO Estudiante (Carnet,FirstName,SecondName,LastName,Direccion,Telefono,Carrera,FechaNacimiento,FechaIngreso,CuotaMensual ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, est.getCarnet());
            ps.setString(2, est.getFirstName());
            ps.setString(3, est.getSecondName());
            ps.setString(4, est.getLastName());
            ps.setString(5, est.getDireccion());
            ps.setInt(6, est.getTelefono());
            ps.setString(7, est.getCarrera());
            ps.setString(8, est.getFechaNacimiento());
            ps.setString(9, est.getFechaIngreso());
            ps.setDouble(10, est.getCuotaMensual());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR ESTUDIANTE");
            e.printStackTrace();
            return false;
        }
    }       
 
     
     
     
    // ACTUALIZAR CLIENTE
    public boolean actualizar(Estudiante est) {
        String sql = "UPDATE Estudiante SET Carnet=?,FirstName=?,SecondName=?,LastName=?,Direccion=?,Telefono=?,Carrera=?,FechaNacimiento=?,FechaIngreso=?,CuotaMensual=? WHERE idEstudiante=?";
        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setString(1, est.getCarnet());
            ps.setString(2, est.getFirstName());
            ps.setString(3, est.getSecondName());
            ps.setString(4, est.getLastName());
            ps.setString(5, est.getDireccion());
            ps.setInt(6, est.getTelefono());
            ps.setString(7, est.getCarrera());
            ps.setString(8, est.getFechaNacimiento());
            ps.setString(9, est.getFechaIngreso());
            ps.setDouble(10, est.getCuotaMensual());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
        // ELIMINAR CLIENTE
    public boolean eliminar(int id) {
        String sql = "DELETE FROM Estudiante WHERE idEstudiante=?";
        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }    
    
}
