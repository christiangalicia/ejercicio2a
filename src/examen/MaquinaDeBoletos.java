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
public class MaquinaDeBoletos {
    private double ganancia;
    private int noBoletos;
    private int costo;
    
    public MaquinaDeBoletos(int noBoletos,int costo){
        this.noBoletos=noBoletos;
        this.ganancia=0;
        this.costo=costo;
    }
    
    public void comprarBoleto(int numero){
        if(noBoletos>=numero){
            noBoletos=noBoletos-numero;
            ganancia= ganancia +(costo*numero);
        }
    }
    public double getGanancia() {
        return ganancia;
    }
    public int getNoBoletos() {
        return noBoletos;
    }
    
}
