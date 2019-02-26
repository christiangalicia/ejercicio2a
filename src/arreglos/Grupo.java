/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Grupo {

    private ArrayList<Alumno> alumnos;
    private String nombre;
    public Grupo(int noAlumnos, String nombre){
        alumnos = new ArrayList<Alumno>();
        this.nombre=nombre;
        
    }
    public String getNombre(){
        return nombre;
    }
    
   public void cargarMaterias(String m1,String m2,
           String m3,String m4,String m5){
       for (int i = 0; i < alumnos.size(); i++) {
           alumnos.get(i).agregarMateria(m1);
           alumnos.get(i).agregarMateria(m2);
           alumnos.get(i).agregarMateria(m3);
           alumnos.get(i).agregarMateria(m4);
           alumnos.get(i).agregarMateria(m5);
       }
   }
    
    public void agregarAlumno(int matricula, String grado, String carrera,
                                 String nombre, String paterno, String materno,
                                 String sexo, Date fechaNacimiento){
        Alumno a = new Alumno(matricula, grado, carrera, 
                        nombre, paterno, materno, sexo, fechaNacimiento);
        
        alumnos.add(a);
    }
    
    public void agregarCalificacionParcial1(String materia, 
            int matricula, float c){
        for (int i = 0; i < alumnos.size(); i++) {
            if(matricula== alumnos.get(i).getMatricula() ){
                alumnos.get(i).getMateria(materia).setParcial1(c);
            }
        }
    }
    
     public void agregarCalificacionParcial2(String materia, 
            int matricula, float c){
        for (int i = 0; i < alumnos.size(); i++) {
            if(matricula== alumnos.get(i).getMatricula() ){
                alumnos.get(i).getMateria(materia).setParcial2(c);
            }
        }
    }
     
     public Alumno obtenerAlumno(int matricula){
         for (int i = 0; i < alumnos.size(); i++) {
             if(alumnos.get(i).getMatricula()==matricula){
                 return alumnos.get(i);
             }
         }
         return null;
     }
     
     public float promedio(){
         float acu=0;
         for (int i = 0; i < alumnos.size(); i++) {
             acu=acu+ alumnos.get(i).promedio();
         }
         return acu/alumnos.size();
     }
     
     public String listaAlumnos(){
          String acu="";
         for (int i = 0; i < alumnos.size(); i++) {
             acu=acu+ alumnos.get(i).nombreCompleto()+"\n";
         }
         return acu;
     }
}
