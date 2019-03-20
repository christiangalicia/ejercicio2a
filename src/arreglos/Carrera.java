/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author christian
 */
public class Carrera {
    private String nombre;
    private Grupo[] grupos;
    private int noGruposActivos;
    public Carrera(String nombre,int noGrupos) {
        this.nombre=nombre;
        grupos= new Grupo[noGrupos];
        noGruposActivos=2;
        grupos[0]= new Grupo(5, "2a");
        grupos[1]= new Grupo(8, "2b");
    }
    
    public void crearNuevoGrupo(int noAlumnos,String nombre){
       
        Grupo nuevo = new Grupo(noAlumnos, nombre);
        grupos[noGruposActivos]= nuevo;
        noGruposActivos++;
    }
    
    public Grupo obtenerGrupo(String nombre){
        for (int i = 0; i < noGruposActivos; i++) {
            if(nombre.equals(grupos[i].getNombre())){
                return grupos[i];
            }
        }
       return null;
    }

   public float obtenerPromedioCarrera(){
       float total=0;
       for (int i = 0; i < noGruposActivos; i++) {
           total= total+grupos[i].promedio();
       }
       return total/noGruposActivos;
   }
    
   public Grupo[] obtenerGrupos(){
       return grupos;
   }
    
    
    
}
