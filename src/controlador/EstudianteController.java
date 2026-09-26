/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import Dao.EstudianteDao;
import Modelo.Estudiante;
import java.util.List;
/**
 *
 * @author luisc
 */
public class EstudianteController {
        private final EstudianteDao dao = new EstudianteDao();
        
        
        
            // OBTENER TODOS
        public List<Estudiante> obtenerEstudiante() {
        return dao.obtenerTodos();
    }
        
            // GUARDAR
    public boolean guardarEstudiante(Estudiante est) {
        return dao.guardar(est);
    }
    // ACTUALIZAR
    public void actualizarEstudiante(int Telefono, String Carnet, String FirstName, String SecondName, String LastName, String Direccion, String Carrera, int parseInt1, String FechaNacimiento, String FechaIngreso){
        Estudiante est = new Estudiante(Carnet, FirstName, SecondName, LastName, Direccion, Telefono, Carrera, FechaNacimiento, FechaIngreso);
        dao.actualizar(est);
    }
        // ELIMINAR
    public void eliminarEstudiante(int id) {
        dao.eliminar(id);
    }
    
}
