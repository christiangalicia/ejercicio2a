/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author christian
 */
public class Lote {
   private String nombre;
   private int oferta;

    public Lote(int oferta) {
        this.oferta = oferta;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getOferta() {       
        return oferta;
    }
    public void setOferta(int oferta){
        this.oferta=oferta;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
   
   public void ofertar(int oferta, String nombre){
       if(oferta>this.oferta){
           this.oferta=oferta;
           this.nombre=nombre;
       }
       
   }
}
