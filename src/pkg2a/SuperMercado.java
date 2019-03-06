/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2a;

/**
 *
 * @author christian
 */
public class SuperMercado {
    private String nombre;
    private float ganancia;
    private int cantidad;
    
    
    public SuperMercado(String nombre){
        this.nombre=nombre;
    }
    
    public float cobrarProducto(int cantidad, float costo){
        this.cantidad=this.cantidad+cantidad;
        ganancia= ganancia+costo;
        return cantidad*costo;
        
    }
}
