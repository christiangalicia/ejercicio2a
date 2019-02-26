/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author christian
 */
public class ControlDeCalificaciones {
    
    
    public float evaluarCalificaciones(float c1, float c2){
        float promedio = (c1+c2)/2;
        if(promedio>=8){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        return promedio;
    }
    
    public float evaluarParcial(float examen, float trabajo1,
                                float trabajo2, float asistencia ){
        float parcial= (float)(examen*.4+trabajo1*.2+trabajo2*.2+asistencia);
        System.out.println("Calificacion " +parcial);
        return parcial;
    }
}
