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
public class TrianguloEquilatero {
    
    private float base;
    private float altura;
    
    public TrianguloEquilatero(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void setBase(float base){
        this.base =base;
    }
    public void setAltura(float altura){
        this.altura= altura;
    }
    
    public void area(){
        System.out.println(base*altura/2);
    }
    public void perimetro(){
        System.out.println(base*3);
    }
}
