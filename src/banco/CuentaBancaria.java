/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author christian
 */
public class CuentaBancaria {
    private float saldo;
    private int noCuenta;
    private String[] historial;
    private int noDeMovimiento;
    public CuentaBancaria(float saldo, int noCuenta){
        this.saldo=saldo;
        this.noCuenta=noCuenta;
        //depositar =0 , retirar =1;
        historial= new String[10];
        noDeMovimiento=0;
    }
    public int getNoCuenta(){
        return noCuenta;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public String[] getHistorial(){
        return historial;
    }
    public void depositar(float cantidad){
        this.saldo=this.saldo+cantidad;
        actualizarHistorial();
        historial[noDeMovimiento]="Deposito "+ cantidad;
        noDeMovimiento++;
    }
    public float retirar(float cantidad){
        if( cantidad<=this.saldo){
            this.saldo=this.saldo-cantidad;
            actualizarHistorial();
            historial[noDeMovimiento]="Retiro "+cantidad;
            noDeMovimiento++;
        }
        return this.saldo;
    }
    private void actualizarHistorial(){
        if(noDeMovimiento>9){
            for(int i=0; i<9;i++){
                historial[i]=historial[i+1];
            }
            noDeMovimiento=9;
        }
    }
    
}
