/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author christian
 */
public class Alumno extends Persona{
    private int matricula;
    private String gradoEstudios;
    private String carrera;
    private ArrayList<Materia> materias ;

    public Alumno(int matricula, String gradoEstudios, String carrera, String nombre, String paterno, String materno, String sexo, Date fechaNacimiento) {
        super(nombre, paterno, materno, sexo, fechaNacimiento);
        this.matricula = matricula;
        this.gradoEstudios = gradoEstudios;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
        
    }
    public int getMatricula(){
        return matricula;
    }
    
    public String informacion(){
        return nombreCompleto()+"\n Edad: "+edad()+"\n"+
                sexo+"\n"+matricula+"\n"+carrera+"\n"+gradoEstudios;
    }
    
    public void agregarMateria(String nombre){
        Materia m = new Materia(nombre);
        this.materias.add(m);
      
    }
    
    public void agregarMateria(String nombre, float c1, float c2){
         Materia m = new Materia(nombre);
         m.setParcial1(c1);
         m.setParcial2(c2);
        this.materias.add(m);
        
    }
    public void agregarCalificacionPrimerParcial(String m, float c){
        for (int i = 0; i < materias.size(); i++) {
            if(m.equals(materias.get(i).getNombre())){
                materias.get(i).setParcial1(c);
            }
        }
    }
    public void agregarCalificacionSegundoParcial(String m, float c){
        for (int i = 0; i < materias.size(); i++) {
            if(m.equals(materias.get(i).getNombre())){
                materias.get(i).setParcial2(c);
            }
        }
    }
    public Materia getMateria(String nombre){
        for (int i = 0; i < materias.size(); i++) {
            if(nombre.equals(materias.get(i).getNombre())){
               return materias.get(i);
            }
        }
        return null;
    }
    
    public float promedio(){
        float acu =0;
        for (int i = 0; i < materias.size(); i++) {
            acu=acu+ materias.get(i).promedio();
        }
        return acu/materias.size();
    }
            
}
