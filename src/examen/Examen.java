/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa cuantos boletos quieres vender y su costo");
        
        MaquinaDeBoletos m = new MaquinaDeBoletos(leer.nextInt(),leer.nextInt());
        
        int opcion=0;
        while(true){
            System.out.println("1 para comprar");
             System.out.println("2 para ver cuanto boletos quedan");
            System.out.println("3 ganancia"); 
            opcion = leer.nextInt();
            if(opcion==1){
                System.out.println("Cuantos quieres?");
                m.comprarBoleto(leer.nextInt());
            }else if(opcion==2){
                System.out.println(m.getNoBoletos());
            }else if(opcion==3){
                System.out.println(m.getGanancia());
            }
        }
        
        
      
        
    }
    
}
