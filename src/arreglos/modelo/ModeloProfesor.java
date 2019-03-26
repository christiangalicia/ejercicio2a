/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.modelo;

import arreglos.Profesor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class ModeloProfesor extends BD{
    
    public ArrayList<Profesor> listaProfesores(){
        try {
            ArrayList<Profesor> profesores= new ArrayList();
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            PreparedStatement ps =
                    conexion.prepareStatement("select * from profesores");
             ResultSet resultado= ps.executeQuery();
             while (resultado.next()) {     
                 profesores.add(new Profesor(resultado.getString("nombre"),
                         resultado.getString("paterno"), 
                         resultado.getString("materno"), 
                         resultado.getString("sexo"),
                         sdf.parse(resultado.getString("fecha_nacimiento")), 
                         resultado.getString("grado_estudios"), 
                         resultado.getString("tipo_profesor"), 
                 resultado.getString("materia")));
             
            }
             return profesores;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProfesor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ModeloProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insertarProfesor(String nombre,String paterno,String materno,
                        String sexo,String fechaNacimiento,String gradoEstudios,
                        String tipoProfesor, String materia){
        
        try {
            PreparedStatement pa= conexion.prepareStatement("INSERT INTO profesores(nombre,paterno,materno,sexo,fecha_nacimiento,grado_estudios,tipo_profesor,materia) VALUES (?,?,?,?,?,?,?,?)");
            pa.setString(1, nombre);
            pa.setString(2, paterno);
            pa.setString(3, materno);
            pa.setString(4, sexo);
            pa.setString(5, fechaNacimiento);
            pa.setString(6, gradoEstudios);
            pa.setString(7, tipoProfesor);
            pa.setString(8, materia);
            pa.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
}
