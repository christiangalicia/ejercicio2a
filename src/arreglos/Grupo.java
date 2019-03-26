/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import arreglos.modelo.ModeloProfesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Grupo {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private String nombre;
    private  ModeloProfesor mp;
    public Grupo(int noAlumnos, String nombre){
        mp= new ModeloProfesor();
        alumnos = new ArrayList<Alumno>();
        profesores= mp.listaProfesores();
        this.nombre=nombre;
        alumnos.add(new Alumno(123, nombre, "tics", "christian", "galicia", 
                "garcia", "hombre", new Date("17/08/1984")));
        alumnos.add(new Alumno(124, nombre, "tics", "david", "galicia", 
                "perez", "hombre", new Date("17/08/1988")));
        alumnos.add(new Alumno(12356, nombre, "tics", "Juan diego", "perez", 
                "sanchez", "hombre", new Date("17/08/1984")));
        alumnos.add(new Alumno(12, nombre, "tics", "Ana Maria", "zarate", 
                "garcia", "hombre", new Date("17/08/1988")));
        
       
    }
    public String getNombre(){
        return nombre;
    }
    public int noAlumnos(){
        return alumnos.size();
    }
    public String reporteInfoAlumnos(){
        Alumno[] a= new Alumno[10];
        a= alumnos.toArray(a);
        return reporteInfoPersonas(a);
    }
    public String reporteInfoProfesores(){
        Profesor[] a= new Profesor[10];
        a= profesores.toArray(a);
       return reporteInfoPersonas(a);
    }
    public String reporteInfoPersonas(Persona[] personas){
         String acu="";
        for (int i = 0; i < personas.length; i++) {
            if(personas[i] !=null){
                acu=acu+ personas[i].informacion();
            }
        }
        return acu;
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
    public void agregarProfesor(String nombre,String paterno,String materno,
                        String sexo,String fechaNacimiento,String gradoEstudios,
                        String tipoProfesor, String materia){
        mp.insertarProfesor(nombre, paterno, materno, sexo, fechaNacimiento, gradoEstudios, tipoProfesor, materia);
    }
    public void agregarAlumno(int matricula, String grado, String carrera,
                                 String nombre, String paterno, String materno,
                                 String sexo, Date fechaNacimiento){
        Alumno a = new Alumno(matricula, grado, carrera, 
                        nombre, paterno, materno, sexo, fechaNacimiento);
        
        alumnos.add(a);
    }
    
//    public void agregarCalificacionParcial1(String materia, 
//            int matricula, float c){
//        for (int i = 0; i < alumnos.size(); i++) {
//            if(matricula== alumnos.get(i).getMatricula() ){
//                alumnos.get(i).getMateria(materia).setParcial1(c);
//            }
//        }
//    }
//    
//     public void agregarCalificacionParcial2(String materia, 
//            int matricula, float c){
//        for (int i = 0; i < alumnos.size(); i++) {
//            if(matricula== alumnos.get(i).getMatricula() ){
//                alumnos.get(i).getMateria(materia).setParcial2(c);
//            }
//        }
//    }
     
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
         try{
            String acu="CURPO\tMATRICUAL\tEDAD\tNOMBRE\n";
            acu= acu+"________\t____\t_________________\n";
           for (int i = 0; i < alumnos.size(); i++) {
               acu=acu+alumnos.get(i+1).CURP()+"\t"+ alumnos.get(i).getMatricula() +"\t\t"+alumnos.get(i).edad() +"\t"+alumnos.get(i).nombreCompleto()+"\n";
           }
              return acu;
         }catch(java.lang.IndexOutOfBoundsException e){
             System.out.println("NO existen todos los alumnos");           
         }
         catch(Exception e){
               System.out.println("Error desconocido");           
        
              System.out.println(e);
             
         }
         return null;
     }
}
