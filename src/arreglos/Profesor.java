/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Date;
/**
 *
 * @author christian
 */
public class Profesor extends Persona{
    private String tipoProfesor;
    private String gradoEstudios;
    private String materia;
    
    public Profesor(String nombre,String paterno,
                    String materno, String sexo,
                   Date fechaNacimiento, String gradoEstudios,
                   String tipoProfesor, String materia){
        super(nombre, paterno, materno, sexo, fechaNacimiento);
         this.tipoProfesor=tipoProfesor;
         this.gradoEstudios=gradoEstudios;
         this.materia=materia;
    }
    
   public String informacion(){
       return edad() +"\t"+ 
               sexo+"\t"+ gradoEstudios+"\t"+ 
               tipoProfesor+"\t"+ nombreCompleto()+"\n";
             
   }
    
}
